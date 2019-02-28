/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Exercicio01 {

    public static void main(String[] args) {
        List<String> p = new ArrayList<>();
        List<Integer> qt = new ArrayList<>();
        List<Double> v = new ArrayList<>();
        List<Produto> PRODUTOS = new ArrayList<>();
        List<Produto> PRODUTOSMENORQ100 = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            p.add("nome" + i);

        }
        qt = UtilPacket.UtilList.numRandomList(0, 500, 50);
        v = UtilPacket.UtilList.numRandomList(0.0, 25.00, 50);

        for (int i = 0; i < 50; i++) {
            PRODUTOS.add(new Produto());
            PRODUTOS.get(i).setNome(p.get(i));
            PRODUTOS.get(i).setQuantidade(qt.get(i));
            PRODUTOS.get(i).setValor(v.get(i));
        }
        System.out.println("!!PRODUTOS!!");
        System.out.println("Nome  " + "     QT " + "         V");

        for (int i = 0; i < p.size(); i++) {
            System.out.println(PRODUTOS.get(i).getNome() + "      " + PRODUTOS.get(i).getQuantidade() + "        " + UtilPacket.UtilFormat.decFormatR$(PRODUTOS.get(i).getValor()));

        }

        String opcao = "";
        Collections.sort(PRODUTOS);
        do {
            opcao = JOptionPane.showInputDialog("###GERENCIAMENTO DE PRODUTOS###\r\n"
                    + "\r\n1) 10 Produtos + Baratos"
                    + "\r\n2) 10 Produtos + Caros"
                    + "\r\n3) Produtos com Menos de 100UN"
                    + "\r\n0) Sair\r\n");
            switch (opcao) {
                case "1": // Opcao 1 //

                    for (int i = 0; i < 10; i++) {

                        System.out.println("Produto " + (i + 1) + " " + PRODUTOS.get(i).getNome() + " " + UtilPacket.UtilFormat.decFormatR$(PRODUTOS.get(i).getValor()));

                    }

                    break;

                case "2":

                    for (int i = 39; i < 50; i++) {

                        System.out.println("Produto " + (i + 1) + " " + PRODUTOS.get(i).getNome() + " " + UtilPacket.UtilFormat.decFormatR$(PRODUTOS.get(i).getValor()));

                    }

                    break;

                case "3": // Opcao 3 //
                    for (int i = 0; i < PRODUTOS.size(); i++) {
                        if (PRODUTOS.get(i).getQuantidade() < 100) {
                            PRODUTOSMENORQ100.add(PRODUTOS.get(i));
                        }

                    }
                    System.out.println("NOME||QTD|||||V");
                    for (int i = 0; i < PRODUTOSMENORQ100.size(); i++) {
                        Produto get = PRODUTOSMENORQ100.get(i);
                         System.out.println(PRODUTOSMENORQ100.get(i).getNome() + " || " + PRODUTOSMENORQ100.get(i).getQuantidade() +  " || " +  UtilPacket.UtilFormat.decFormatR$(PRODUTOSMENORQ100.get(i).getValor()));
                    }
                   

                    break;

            }
        } while (!opcao.equals("0"));

    }

    public void top10Produtos() {

    }

}
