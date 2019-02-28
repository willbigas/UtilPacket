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
public class Exercicio03 {

    public static void main(String[] args) {
        Integer numPar = 0;
        Integer numImpar = 0;

        for (int i = 1; i <= 100; i++) {
            Integer numeros = i;

            if (numeros % 2 == 0) {
                System.out.println("Numeros pares : " + i);
                numPar++;
            }

            if (numeros % 2 == 1) {
                System.out.println("Numeros Impares : " + i);
                numImpar++;
            }

            System.out.println("Quantidade de numeros Pares: " + numPar);
            System.out.println("Quantidade de numeros Impares: " + numImpar);
        }
    }
}
