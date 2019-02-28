/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exerciciosfor;

/**
 *
 * @author Will
 */
public class Exercicio09 {
    public static void main(String[] args) {
        Integer numUm = 0;
        Integer numDois = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println("||TABUADA DE " + i + "||");
            for (int j = 10; j >= 0; j--) {
                System.out.println(i + " x " +j + " = " + i*j);
            }
        }
    }
}
