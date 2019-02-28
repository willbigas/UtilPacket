/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agendatelefonica;

import objetos.Contato;
import objetos.Telefone;
import objetos.Endereco;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class ManterContatoNegocio {

    public static List<Telefone> telefone = new ArrayList<>();
    public static List<Contato> contatos = new ArrayList<>();

    public static Contato inserirContato(String nome, String email, Endereco endereco, List<Telefone> telefone) {

        Contato contato = new Contato(nome, email, endereco, telefone);
        contatos.add(contato);
        return contato;
    }

    public static Contato buscarPorNome(String nome) {

        for (int i = 0; i < 1; i++) {
            List<Contato> umContato = contatos;
            if (umContato.get(i).getNome().equalsIgnoreCase(nome)) {

                return contatos.get(i);
            }

        }
        return null;

    }

    public static List<Contato> excluirContato(String nome) {

        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                int retorno = JOptionPane.showConfirmDialog(null, "Deseja Excluir " + contatos.get(i).getNome() + " da lista de contatos?");
                switch (retorno) {
                    case 0:
                        contatos.remove(contatos.get(i));

                        System.out.println("Contato Excluido com Sucesso , Verifique!");
                        break;
                    case 1:
                        System.out.println("Você não Excluiu o Contato");
                        break;
                    case 2:
                        System.exit(i);
                    default:
                        break;
                }
                return contatos;

            }
        }
        return null;

    }
    
    public static List<Contato> gerandoInterface(Endereco umEndereco, Endereco umEndereco2, Endereco umEndereco3, List<Telefone> telefones, List<Contato> contatos) throws HeadlessException {
        String opcao = "";
        do {

            String opcaoEnd = "";
            String opcaoTelefone = "";
            Endereco enderecoAuxiliar = null;

            opcao = JOptionPane.showInputDialog("MENU\r\n1) Inserir Contato"
                    + "\r\n2) Buscar por Nome"
                    + "\r\n3) Excluir Contato"
                    + "\r\n0) Sair");
            switch (opcao) {
                case "1":
                    List<Telefone> telefoneAuxiliar = new ArrayList<>();
                    String nomeContato = JOptionPane.showInputDialog("Digite um Nome de Contato");
                    String email = JOptionPane.showInputDialog("Digite um Email para esse Contato");

                    opcaoEnd = JOptionPane.showInputDialog("ENDERECO\r\n1)" + umEndereco
                            + "\r\n2)" + umEndereco2
                            + "\r\n3)" + umEndereco3
                            + "\r\n0) Sair");

                    switch (opcaoEnd) {
                        case "1":
                            enderecoAuxiliar = umEndereco;
                            break;
                        case "2":
                            enderecoAuxiliar = umEndereco2;
                            break;
                        case "3":
                            enderecoAuxiliar = umEndereco3;
                            break;
                    }

                    opcaoTelefone = JOptionPane.showInputDialog("TELEFONE\r\n1)" + telefones.get(0)
                            + "\r\n2)" + telefones.get(1)
                            + "\r\n3)" + telefones.get(2)
                            + "\r\n0) Sair");

                    switch (opcaoEnd) {
                        case "1":
                            telefoneAuxiliar.add(telefones.get(0));
                            break;
                        case "2":
                            telefoneAuxiliar.add(telefones.get(1));
                            break;
                        case "3":
                            telefoneAuxiliar.add(telefones.get(2));
                            break;
                    }

                    contatos.add(ManterContatoNegocio.inserirContato(nomeContato, email, enderecoAuxiliar, telefoneAuxiliar));
                    break;
                case "2":
                    String mensagem = JOptionPane.showInputDialog("||PESQUISA DE CONTATO|| + \r\n + Digite o nome do Contato");
                    Contato retorno = ManterContatoNegocio.buscarPorNome(mensagem);
                    JOptionPane.showMessageDialog(null, "CONTATO PESQUISADO!\r\n" + "Nome: "
                            + retorno.getNome() + "\r\nTelefone: " + retorno.getTelefones()
                            + "\r\nEndereco: " + retorno.getEndereco());

                    break;
                case "3":
                    String msgRetorno = JOptionPane.showInputDialog("||Excluir Contato||\r\n Digite um nome para Excluir");
                    contatos = ManterContatoNegocio.excluirContato(msgRetorno);
                    break;

            }
            System.out.println("Depois de Criar : " + contatos);

        } while (!opcao.equals("0"));
        return contatos;
    }
    
    public static void adicionandoTelefones(List<Telefone> telefones) {
        for (int i = 0; i < 1; i++) {
            telefones.add(new Telefone("3033-7442", "48", "99682-2475"));
            telefones.add(new Telefone("3033-2426", "48", "99985-7564"));
            telefones.add(new Telefone("3089-9133", "48", "98827-8305"));
        }
    }

}
