/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaponto;

import UtilPacket.UtilFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class PontoPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Funcionario umFuncionario = new Funcionario();

        String opcao = "";

        do {
            opcao = JOptionPane.showInputDialog("###GERENCIAMENTO DE FUNCIONARIOS###\r\n"
                    + "\r\n1) Cadastrar"
                    + "\r\n2) Alterar"
                    + "\r\n3) Pesquisar"
                    + "\r\n4) Listar Todos "
                    + "\r\n0) Sair\r\n");
            switch (opcao) {
                case "1": // Cadastrar Funcionario //

                    String codigoFuncionario = JOptionPane.showInputDialog("Codigo: ");
                    String nomeFuncionario = JOptionPane.showInputDialog("Nome: ");

                    Integer codigoFunc = UtilFormat.strForInt(codigoFuncionario);
                    JOptionPane.showMessageDialog(null, "##DADOS DO FUNCIONARIO INSERIDO##\r\n\r\n" + "Codigo: " + codigoFuncionario + "\r\n"
                            + "Nome: " + nomeFuncionario + "\r\n");
                    ManterPontoNegocio.inserirFuncionario(codigoFunc, nomeFuncionario);
                    break;

                case "2": // Alterar Funcionario //

                    String mensagemCodigo = JOptionPane.showInputDialog("Insira o Codigo do Funcionario para Alterar: ");
                    String mensagemNome = JOptionPane.showInputDialog("Insira o nome para Alterar: ");
                    Integer codigoF = UtilFormat.strForInt(mensagemCodigo);
                    JOptionPane.showMessageDialog(null, " ----Codigo Alterado----\r\n\r\n" + "Cod: " +mensagemCodigo 
                            + "Nome: " + mensagemNome);
                    ManterPontoNegocio.AlterarFuncionario(codigoF, mensagemNome);
                    break;

                case "3": // Pesquisar Funcionario //

                    String pesquisa = JOptionPane.showInputDialog("Pesquisar por Codigo: ");
                    Integer funcionario = UtilFormat.strForInt(pesquisa);
                    JOptionPane.showMessageDialog(null, " ----Menu----\r\n" + pesquisa);
                    String umaLinha = ManterPontoNegocio.pesquisarUmFuncionario(funcionario);
                    JOptionPane.showMessageDialog(null, umaLinha);

                    break;

                case "4": // Listar Funcionarios //
                   String[] todos = new String[21]; 
                   todos = ManterPontoNegocio.listarTodosFuncionarios(true);
                    for (int i = 0; i < todos.length; i++) {
                        System.out.println(todos[i]);
                        
                    }

                    break;
            }
        } while (!opcao.equals("0"));

    }

}
