/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Will
 */
public class Exercicio04 {

    public static void main(String[] args) {

        List<String> listaconvidado = new ArrayList<>();

        String opcao = "";

        do {
            opcao = JOptionPane.showInputDialog("-----" + "LISTA DE CONVIDADOS" + "-----\r\n"
                    + "\r\n\r\n1-Incluir\r\n"
                    + "2-Visualizar\r\n"
                    + "3-Remover - Nome \r\n"
                    + "4-Remover - Indice \r\n"
                    + "0-sair");

            switch (opcao) {
                case "1": // Incluir novo Convidado
                    listaconvidado.add(JOptionPane.showInputDialog("Nome: ".toUpperCase()));

                    break;

                case "2": // Visualizar convidado
                    System.out.println("----LISTA----");
                    for (int i = 0; i < listaconvidado.size(); i++) {
                        {
                            System.out.println("Convidado: " + listaconvidado.indexOf(listaconvidado.get(i)) + " - " + listaconvidado.get(i).toUpperCase());
                        }
                    }
                    break;

                case "3": // Remover convidado pelo nome
                    listaconvidado.remove(JOptionPane.showInputDialog("Nome: ".toUpperCase()));
                    break;

                case "4": // Remover convidado pelo Indice
                    Integer teste = null;
                    String mensagem = JOptionPane.showInputDialog("Indice: ");
                    for (int i = 0; i < listaconvidado.size(); i++) {
                        if (Integer.valueOf(mensagem).equals(listaconvidado.indexOf(listaconvidado.get(i)))) {
                            teste = JOptionPane.showConfirmDialog(null, "Você deseja remover " + listaconvidado.get(i) + " da lista?");
                            if (teste.equals(0)) {
                                listaconvidado.remove(listaconvidado.get(i));
                            }
                        }

                    }

            }
        } while (!opcao.equals("0"));

    }

}
