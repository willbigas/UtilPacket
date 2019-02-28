/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.implementacao;

import br.com.Entidade.Usuario;
import br.com.dao.impl.UsuarioDaoImpl;
import br.com.dominio.ManterUsuarioNegocio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        String opcao = "";

        do {

            opcao = JOptionPane.showInputDialog("---WELCOME---\r\n"
                    + "\r\n1) INSERIR"
                    + "\r\n2) ATUALIZAR"
                    + "\r\n3) EXCLUIR"
                    + "\r\n4) PESQUISAR "
                    + "\r\n5) PESQUISAR TODOS "
                    + "\r\n0) SAIR\r\n");
            switch (opcao) {
                case "1":
                    List<Usuario> USUARIOS = new ArrayList<>();
                    String novaOpcao = "";
                    do {
                        novaOpcao = JOptionPane.showInputDialog("---ESCOLHA---\r\n"
                                + "\r\n1) INSERIR USUARIO "
                                + "\r\n2) INSERIR DEPARTAMENTO"
                                + "\r\n3) INSERIR TELEFONE"
                                + "\r\n0) SAIR\r\n");
                        switch (novaOpcao) {
                            case "1":
                                Usuario usuario = ManterUsuarioNegocio.inserirUsuario();
                                USUARIOS.add(usuario);

                                break;
                            case "2":
                                if (!USUARIOS.isEmpty()) {
                                    ManterUsuarioNegocio.inserirDpt();
                                } else {
                                    System.out.println("NAO PODE SER CRIADO O DEPARTAMENTO");
                                    break;
                                }
                                break;
                            case "3":
                                if (!USUARIOS.isEmpty()) {
                                    ManterUsuarioNegocio.inserirTelefone();
                                } else {
                                    System.out.println("NAO PODE SER CRIADO O TELEFONE");
                                    break;
                                }
                                break;

                        }
                    } while (!novaOpcao.equals("0"));

                case "2": // Opcao 2 //
                    UsuarioDaoImpl dao2 = new UsuarioDaoImpl();
                    Usuario usuario2 = new Usuario();

                    break;

                case "3": // Opcao 3 //

                    break;

                case "4": // Opcao 4 //

                    break;

                case "5": // Opcao 5 //
                    Usuario primeiro = new Usuario();
                    UsuarioDaoImpl dao3 = new UsuarioDaoImpl();

                    List<Object> usuarios = dao3.pesquisarTodos();

                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(usuarios.get(i));

                    }
                    break;
            }

        } while (!opcao.equals("0"));
    }
}
