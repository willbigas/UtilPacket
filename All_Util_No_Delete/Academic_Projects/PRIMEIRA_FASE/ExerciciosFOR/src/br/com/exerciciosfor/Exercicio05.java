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
public class Exercicio05 {
    public static void main(String[] args) {
        
        Integer qtdNumPar = 0;
        Integer qtdNumImpar = 0;
        for (int i = 0; i < 10000; i++) {
            Integer numero = i;
            
            if(numero %2 ==0) {
                qtdNumPar++;
            }
            if(numero %2 ==1) {
                qtdNumImpar++;
            }
        }
        System.out.println("Quant de numeros Pares: " + qtdNumPar);
        System.out.println("Quant de numeros Impares: " + qtdNumImpar);
    }
}
