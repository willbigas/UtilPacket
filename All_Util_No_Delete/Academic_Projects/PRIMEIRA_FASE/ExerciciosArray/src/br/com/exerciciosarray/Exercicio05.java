/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exerciciosarray;

import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Integer[] numA = new Integer[200];
        Integer xSorteadas = 0;
        String m = JOptionPane.showInputDialog("Digite um numero");
        Integer v = Integer.valueOf(m);
        
        for (int i = 0; i < 200; i++) {
         numA[i] = UtilPacket.UtilMath.numRandom(0, 80);
         if (numA[i].equals(v)) {
             xSorteadas++;
         }
        }
        
        for (int i = 0; i < numA.length; i++) {
            Integer integer = numA[i];
            System.out.println("Numeros Sorteados: " + integer);
        }
        
        System.out.println("O numero " + v + " foi sorteado " + xSorteadas + " vezes" );
        
    }
}
