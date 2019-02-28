/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

/**
 *
 * @author Alunos
 */
public class Exercicio03 {

    public static List<Integer> numeros = new ArrayList<>();
    public static Integer numMaior[] = new Integer[1];
    public static Integer numMenor[] = new Integer[1];
    public static Integer media[] = new Integer[1];

    public static void main(String[] args) {
        String mensagem = "";
        Integer valorMensagem;
        do {
            mensagem = JOptionPane.showInputDialog("Digite a Quantide de Numeros entre [1] e [200]: ");
            valorMensagem = Integer.valueOf(mensagem);
        } while (valorMensagem < 0 && valorMensagem > 200);

        for (int i = 0; i < valorMensagem; i++) {

            Integer nRandom = UtilPacket.UtilMath.gerarNumRandInt(0, 10);
            numeros.add(nRandom);
            System.out.println(numeros.get(i));

        }
        Integer maiorNumero = UtilPacket.UtilMath.maiorValorArrayList(numeros);
        Integer menorNumero = UtilPacket.UtilMath.menorValorArraylist(numeros);
        Integer mediaNumero = UtilPacket.UtilMath.mediaArrayList(numeros);
        System.out.println("Maior numero é : " + maiorNumero);
        System.out.println("Menor numero é : " + menorNumero);
        System.out.println("Media de todos os Numeros é: " + mediaNumero);

    }

}
