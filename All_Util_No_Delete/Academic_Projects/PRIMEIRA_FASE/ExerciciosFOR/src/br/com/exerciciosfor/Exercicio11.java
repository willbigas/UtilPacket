/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exerciciosfor;

import javax.swing.JOptionPane;

/**
 *
 * @author Will
 */
public class Exercicio11 {
    public static void main(String[] args) {
        String m = JOptionPane.showInputDialog("Digite um nome");
        for (int i = 1; i <= m.length(); i++) {
            if (i % 3 == 0) {
                System.out.println("Posicao da letra dividida por 3 : " + m.charAt(i-1));
            }
        }
    }
}
