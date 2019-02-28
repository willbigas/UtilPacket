/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaoeprocedimento;

import javax.swing.JOptionPane;

/**
 *
 * @author WILL
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Integer[] numRandom = UtilPacket.UtilArray.numRandom(0, 10, 45);
        String mensagem = JOptionPane.showInputDialog("Digite um numero");
        mostrarNumeros(numRandom);
        Integer quantidade = verificarQuantidade(numRandom, mensagem);
        System.out.println("Esse numero foi encontrado " + quantidade + " Vezes");

    }

    public static void mostrarNumeros(Integer[] numRandom) {
        for (Integer integer : numRandom) {
            System.out.println(integer);
        }
    }

    public static Integer verificarQuantidade(Integer[] numRandom, String mensagem) throws NumberFormatException {
        Integer qtdOcorrencias = 0;
        for (int i = 0; i < numRandom.length; i++) {

            if (Integer.valueOf(mensagem).equals(numRandom[i])) {
                qtdOcorrencias++;
            }
        }
        return qtdOcorrencias;
    }
}
