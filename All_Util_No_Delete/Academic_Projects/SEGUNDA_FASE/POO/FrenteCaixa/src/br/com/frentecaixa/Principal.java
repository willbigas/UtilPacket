/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.frentecaixa;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome funcionario");
        String valorString = JOptionPane.showInputDialog("Valor inicial caixa");
        Double valor = Double.valueOf(valorString);
        Caixa caixaAtual = new Caixa();
        caixaAtual.abrirCaixa(nome, valor);
        Double vl;
        String opcao = "";
        do {
            opcao = JOptionPane.showInputDialog("MENU\r\n1) Fazer venda dinheiro"
                    + "\r\n2) Fazer venda débito"
                    + "\r\n3) Fazer venda crédito"
                    + "\r\n0) Fechar caixa");
            switch(opcao) {
                case "0":
                    caixaAtual.fecharCaixa();
                    break;
                case "1":
                    vl = obterValor("Dinheiro");
                    caixaAtual.fazerVendaDinheiro(vl);
                    break;
                case "2":
                    vl = obterValor("Debito");
                    caixaAtual.fazerVendaDebito(vl);
                    break;
                case "3":
                    vl = obterValor("Credito");
                    caixaAtual.fazerVendaCredito(vl);
                    break;
            }
        } while (!opcao.equals("0"));
        System.out.println(caixaAtual);
    }

    private static Double obterValor(String tipo) {
        String valorString = JOptionPane.showInputDialog("Valor venda em " + tipo);
        return Double.valueOf(valorString);
    }
    
}
