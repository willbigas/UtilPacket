package br.com.poo.conexaobd.implementacao;

import br.com.poo.dao.DepartamentoDao;
import br.com.poo.daoimpl.UsuarioDaoImpl;
import br.com.poo.dao.UsuarioDao;
import br.com.poo.daoimpl.DepartamentoDaoImpl;
import br.com.poo.entidade.Departamento;
import br.com.poo.entidade.Telefone;
import br.com.poo.entidade.Usuario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SistemaCadastroUsuario {

    private UsuarioDao usuarioDao;
    private DepartamentoDao departamentoDao;
    private SimpleDateFormat df;

    public void iniciar() throws Exception {
        departamentoDao = new DepartamentoDaoImpl();
        usuarioDao = new UsuarioDaoImpl();
        String opcao = "";
        df = new SimpleDateFormat("dd/MM/yyyy");
        do {
            String menu = "1) Inserir\n2) Listar\n3) Pesquisar por id\n4) Editar\n5) Excluir\n6) Departamentos\n0) Sair";
            opcao = JOptionPane.showInputDialog(menu, "Escolha uma opção");
            switch (opcao) {
                case "1":
                    inserirNovoUsuario();
                    break;
                case "2":
                    listarTodos();
                    break;
                case "3":
                    pesquisarPorId();
                    break;
                case "4":
                    editarUsuario();
                    break;
                case "5":
                    excluirUsuario();
                    break;
                case "6":
                    menuDepartamento();
                    break;

                default:
                    break;
            }
        } while (!opcao.equals("0"));

    }

    private void excluirUsuario() throws Exception {
        Integer idPesquisar = Integer.valueOf(JOptionPane.showInputDialog("Excluir usuario\nID:"));
        Usuario usuario = (Usuario) usuarioDao.pesquisar(idPesquisar);
        if (null == usuario) {
            JOptionPane.showMessageDialog(null, "Usuario nao encontrado!");
            return;
        } else {
            String resposta = JOptionPane.showInputDialog("Dados atuais:\n\t - " + usuario + "\n\nConfirma exclusao? (S/N)");
            if (resposta.equalsIgnoreCase("S")) {
                if (usuarioDao.excluir(idPesquisar)) {
                    JOptionPane.showMessageDialog(null, "Usuario excluido!");
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Usuario nao excluido!");
        }
    }

    private void editarUsuario() throws Exception {
        Integer idPesquisar = Integer.valueOf(JOptionPane.showInputDialog("Editar usuario\nID:"));
        Usuario usuario = (Usuario) usuarioDao.pesquisar(idPesquisar);
        if (null == usuario) {
            JOptionPane.showMessageDialog(null, "Usuario nao encontrado!");
        } else {
            editarUsuario(usuario);
        }
    }

    public void editarUsuario(Usuario usuario) throws Exception {
        String opcao = "";
        do {
            String mensagem = "Dados atuais:\nUsuario: " + usuario.getNome() + " - " + df.format(usuario.getNascimento()) + "\n";
            mensagem += "Departamento: " + (usuario.getDepartamento() == null ? "" : usuario.getDepartamento().getNome());
            if (usuario.getTelefones() != null && !usuario.getTelefones().isEmpty()) {
                mensagem += "\nTelefones:\n";
                for (Telefone telefone : usuario.getTelefones()) {
                    mensagem += "\t" + telefone + "\n";
                }
            }
            mensagem += "\n\n1) Editar nome/nascimento\n2) Editar departamento\n3) Editar telefones\n0) Voltar ao menu anterior";
            opcao = JOptionPane.showInputDialog(mensagem);
            switch (opcao) {
                case "1":
                    String nome = JOptionPane.showInputDialog("Nome:");
                    String nascimentoStr = JOptionPane.showInputDialog("Nascimento:");
                    usuario.setNome(nome);
                    usuario.setNascimento(df.parse(nascimentoStr));
                    usuarioDao.update(usuario);
                    break;
                case "2":
                    List<Object> departamentos = departamentoDao.pesquisarTodos();
                    if (departamentos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não há departamentos cadastrados!");
                    } else {
                        Departamento departamento = (Departamento) JOptionPane.showInputDialog(null, "Escolha o departamento", "Departamentos", 0, null, departamentos.toArray(), null);
                        usuario.setDepartamento(departamento);
                        usuarioDao.update(usuario);
                    }
                    break;
                case "3":
                    menuEditarTelefone(usuario);
                    break;
            }
        } while (!opcao.equals("0"));
    }

    private void pesquisarPorId() throws Exception {
        Integer idPesquisar = Integer.valueOf(JOptionPane.showInputDialog("Pesquisa usuario\nID:"));
        Usuario usuario = (Usuario) usuarioDao.pesquisar(idPesquisar);
        if (null == usuario) {
            JOptionPane.showMessageDialog(null, "Usuario nao encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario encontrado:\n\t - " + usuario);
        }
    }

    private void listarTodos() throws Exception {
        String mensagem = "Listagem de usuarios:";
        List<Object> usuarios = usuarioDao.pesquisarTodos();
        for (Object usuario : usuarios) {
            mensagem += ("\n\t - " + usuario);
        }
        mensagem += ("\n\n-- FIM");
        JOptionPane.showMessageDialog(null, mensagem);
    }

    private void inserirNovoUsuario() throws Exception {
        String nome = JOptionPane.showInputDialog("Nome:");
        String nascimentoStr = JOptionPane.showInputDialog("Nascimento:");
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(nome);
        novoUsuario.setNascimento(df.parse(nascimentoStr));
        boolean sucesso = usuarioDao.inserir(novoUsuario);
        if (sucesso) {
            JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuario!");
        }
        editarUsuario(novoUsuario);
    }

    public static void main(String[] args) throws Exception {
        SistemaCadastroUsuario sistema = new SistemaCadastroUsuario();
        sistema.iniciar();
    }

    private void menuEditarTelefone(Usuario usuario) throws Exception {
        String opcao = "";
        do {
            String mensagem = "";
            if (usuario.getTelefones() != null && !usuario.getTelefones().isEmpty()) {
                mensagem += "Telefones:\n";
                for (Telefone telefone : usuario.getTelefones()) {
                    mensagem += "\t" + telefone + "\n";
                }
            } else {
                usuario.setTelefones(new ArrayList<>());
                mensagem += "<não há telefones cadastrados>";
            }
            mensagem += "\n\n1) Adicionar\n2) Excluir\n0) Sair";
            opcao = JOptionPane.showInputDialog(mensagem);
            switch (opcao) {
                case "1":
                    String tipo = JOptionPane.showInputDialog("Tipo telefone");
                    Integer ddd = Integer.valueOf(JOptionPane.showInputDialog("DDD"));
                    String numero = JOptionPane.showInputDialog("numero");
                    Telefone tel = new Telefone(numero, tipo, ddd);
                    usuario.getTelefones().add(tel);
                    usuarioDao.update(usuario);
                    break;
                case "2":
                    mensagem = "Digite o ID para excluir ou -1 para voltar ao menu anterior\n";
                    for (Telefone telefone : usuario.getTelefones()) {
                        mensagem += "ID " + telefone.getId() + ": " + telefone;
                    }
                    Integer idExcluir = Integer.valueOf(JOptionPane.showInputDialog(mensagem));
                    if (idExcluir > 0) {
                        Telefone remover = null;
                        List<Telefone> telefones = usuario.getTelefones();
                        for (int i = 0; i < telefones.size(); i++) {
                            Telefone telefone = telefones.get(i);
                            if (telefone.getId().equals(idExcluir)) {
                                remover = telefone;
                            }
                        }
                        telefones.remove(remover);
                        usuarioDao.update(usuario);
                    }
                    break;
            }
        } while (!opcao.equals("0"));
    }

    private void menuDepartamento() throws Exception {
        String opcao = "";
        do {
            String mensagem = "Departamentos:\n";
            List<Object> departamentos = departamentoDao.pesquisarTodos();
            for (Object objDepartamento : departamentos) {
                Departamento dep = (Departamento) objDepartamento;
                mensagem += "\t" + dep + "\n";
            }
            mensagem += "\n\n1) Adicionar\n2) Excluir\n0) Sair";
            opcao = JOptionPane.showInputDialog(mensagem);
            switch (opcao) {
                case "1":
                    String nome = JOptionPane.showInputDialog("Nome");
                    String descricao = JOptionPane.showInputDialog("Descrição");
                    Departamento departamento = new Departamento(nome, descricao);
                    departamentoDao.inserir(departamento);
                    break;
                case "2":
                    mensagem = "Digite o ID para excluir ou -1 para voltar ao menu anterior\n";
                    for (Object objDepartamento : departamentos) {
                        Departamento dep = (Departamento) objDepartamento;
                        mensagem += "\nID " + dep.getId() + ": " + dep;
                    }
                    Integer idExcluir = Integer.valueOf(JOptionPane.showInputDialog(mensagem));
                    if (idExcluir > 0) {
                        boolean excluiu = departamentoDao.excluir(idExcluir);
                        if (excluiu) {
                            JOptionPane.showMessageDialog(null, "Departamento excluído!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Não foi possível excluir o departamento\n. Provavelmente ele não existe ou está em uso por outro registro!");
                        }
                    }
                    break;
            }
        } while (!opcao.equals("0"));
    }

}
