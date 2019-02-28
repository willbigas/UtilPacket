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
public class Exercicio08 {

    public static void main(String[] args) {
        String mensagem = JOptionPane.showInputDialog("Digite um numero");
        Integer numero = Integer.valueOf(mensagem);
        Integer fatorial = 1;

        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é igual a " + fatorial);

    }

    //   System.out.println("Fatorial: " + fatorial);
}
