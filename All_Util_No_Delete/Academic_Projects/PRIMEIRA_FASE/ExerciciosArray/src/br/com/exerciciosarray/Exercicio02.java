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
public class Exercicio02 {
    public static void main(String[] args) {
         String[] nomeP = new String[10];
         Integer[] numA = new Integer[3];
         for (int i = 0; i < 10; i++) {
            nomeP[i] = JOptionPane.showInputDialog("Nome da pessoa:");
        }
         for (int i = 0; i < 3; i++) {
          numA[i] = UtilPacket.UtilMath.numRandom(0, 9);
        }
         
         for (int i = 0; i < numA.length; i++) {
             System.out.println("O " + nomeP[numA[i]] + " é o vencedor numero " + (i+1));
        }
       
    }
    
}
