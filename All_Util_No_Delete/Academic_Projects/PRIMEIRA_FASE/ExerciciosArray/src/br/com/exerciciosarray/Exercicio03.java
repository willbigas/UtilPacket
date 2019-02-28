/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exerciciosarray;

/**
 *
 * @author William
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Integer[] numA = new Integer[6];
        for (int i = 0; i < 6; i++) {
            numA[i] = UtilPacket.UtilMath.numRandom(1, 60);
        }
        System.out.println("|||Sugestão da MegaSena|||");
        for (int i = 0; i < numA.length; i++) {
            Integer integer = numA[i];
            System.out.println("Numeros de Sugestão " + (i+1) + " : " + integer);
        }
        System.out.println("Bom jogo!");

    }
}
