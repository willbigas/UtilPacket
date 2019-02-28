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
public class Exercicio10 {

    public static void main(String[] args) {
        String mensagem = JOptionPane.showInputDialog("Digite o nome");

        String mens = "";
        for (int i = mensagem.length() - 1; i >= 0; i--) {
            mens = mens + mensagem.charAt(i);
            
        }

        System.out.println("Ao Contrario : " +mens);
    }
}
