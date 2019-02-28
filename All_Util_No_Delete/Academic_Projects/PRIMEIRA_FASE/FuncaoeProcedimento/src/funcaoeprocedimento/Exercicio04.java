/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaoeprocedimento;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author WILL
 */
public class Exercicio04 {

    public static void main(String[] args) {
        List<String> NOMES = new ArrayList<>();
        List<Integer> posicaoA = new ArrayList<>();
        List<Integer> posicaoE = new ArrayList<>();
        List<Integer> posicaoI = new ArrayList<>();
        List<Integer> posicaoO = new ArrayList<>();
        List<Integer> posicaoU = new ArrayList<>();
        gerandoListaDeNomes(NOMES);
        verificandoPosicoes(NOMES, posicaoA, posicaoE, posicaoI, posicaoO, posicaoU);
        imprimindoResultado(posicaoA, posicaoE, posicaoI, posicaoO, posicaoU);
    }

    public static void imprimindoResultado(List<Integer> posicaoA, List<Integer> posicaoE, List<Integer> posicaoI, List<Integer> posicaoO, List<Integer> posicaoU) {
        System.out.println("O nome que você digitou tem letra A na Posicao " + posicaoA);
        System.out.println("O nome que você digitou tem letra E na Posicao " + posicaoE);
        System.out.println("O nome que você digitou tem letra I na Posicao " + posicaoI);
        System.out.println("O nome que você digitou tem letra O na Posicao " + posicaoO);
        System.out.println("O nome que você digitou tem letra U na Posicao " + posicaoU);
    }

    public static void gerandoListaDeNomes(List<String> NOMES) throws HeadlessException {
        for (int i = 0; i < 1; i++) {
            NOMES.add(JOptionPane.showInputDialog("Digite o nome da uma Pessoa"));

        }
    }

    public static void verificandoPosicoes(List<String> NOMES, List<Integer> posicaoA, List<Integer> posicaoE, List<Integer> posicaoI, List<Integer> posicaoO, List<Integer> posicaoU) {
        for (int i = 0; i < NOMES.size(); i++) {
            String get = NOMES.get(i);
            System.out.println(get);
            for (int j = 0; j < get.length(); j++) {
                String aux = String.valueOf(get.charAt(j));
                if (aux.equalsIgnoreCase("A")) {
                    posicaoA.add(j + 1);
                }
                if (aux.equalsIgnoreCase("E")) {
                    posicaoE.add(j + 1);
                }
                if (aux.equalsIgnoreCase("I")) {
                    posicaoI.add(j + 1);
                }
                if (aux.equalsIgnoreCase("O")) {
                    posicaoO.add(j + 1);
                }
                if (aux.equalsIgnoreCase("U")) {
                    posicaoU.add(j + 1);
                }
            }

        }
    }

}
