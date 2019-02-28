/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dominio;

import br.com.Entidade.Departamento;
import br.com.Entidade.Telefone;
import br.com.Entidade.Usuario;
import br.com.dao.TelefoneDao;
import br.com.dao.impl.DepartamentoDaoImpl;
import br.com.dao.impl.TelefoneDaoImpl;
import br.com.dao.impl.UsuarioDaoImpl;
import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class ManterUsuarioNegocio {

    private static DepartamentoDaoImpl dptDao = new DepartamentoDaoImpl();

    public static Usuario inserirUsuario() throws Exception {
        UsuarioDaoImpl dao = new UsuarioDaoImpl();
        Usuario usuario = new Usuario();
        String respostaNomeUsuario = JOptionPane.showInputDialog("Digite seu nome");
        usuario.setNome(respostaNomeUsuario);
        String respostaNascimentoUsuario = JOptionPane.showInputDialog("Digite a sua data de nascimento (dd/MM/yyyy)");
        Date d = data(respostaNascimentoUsuario);
        usuario.setNascimento(d);
        Telefone t = inserirTelefone();
        Departamento departamento = inserirDpt();
        usuario.setDepartamento(departamento);
        List<Telefone> telefones = new ArrayList<>();
        telefones.add(t);
        usuario.setTelefones(telefones);
        boolean sucesso = dao.inserir(usuario);
        if (sucesso) {
            System.out.println(usuario.getNome() + usuario.getNascimento());
            return usuario;
        }
        return null;
    }

    public static Departamento inserirDpt() throws HeadlessException, Exception {
        // Opcao 1 //
        Departamento departamento = new Departamento();
        String respostaNomeDepartamento = JOptionPane.showInputDialog("Digite o nome do departamento");
        departamento.setNome(respostaNomeDepartamento);
        String respostaDescricao = JOptionPane.showInputDialog("Digite a descricao");
        departamento.setDescricao(respostaDescricao);
        if (dptDao.inserir(departamento)) {
            System.out.println(departamento.getNome() + departamento.getDescricao());
        }
        return departamento;
    }

    public static Telefone inserirTelefone() throws HeadlessException, Exception {
        // Opcao 1 //
        TelefoneDaoImpl telDao = new TelefoneDaoImpl();
        Telefone telefone = new Telefone();
        String respostaTipo = JOptionPane.showInputDialog("Digite o tipo:");
        telefone.setTipo(respostaTipo);
        String respostaNumero = JOptionPane.showInputDialog("Digite seu numero:");
        telefone.setNumero(respostaNumero);
        String respostaDdd = JOptionPane.showInputDialog("Digite seu ddd:");
        telefone.setDdd(Integer.valueOf(respostaDdd));
        boolean sucesso = telDao.inserir(telefone);
        if (sucesso) {
            System.out.println(telefone.getDdd() + telefone.getNumero());
        }
        return telefone;
    }

    public static Date data(String dataStr) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.parse(dataStr);
    }

}
