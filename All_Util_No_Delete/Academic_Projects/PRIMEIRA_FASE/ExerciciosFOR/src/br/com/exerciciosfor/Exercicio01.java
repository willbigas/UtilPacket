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
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // Crescente 
        for (int i = 1; i <= 100; i++) {
            Integer teste = i;
            System.out.println("Crescente : " + teste);
        }
        
        
        for (int i = 100; i >= 1; i--) { // Decrescente
            Integer teste2 = i;
            System.out.println("Decrescente : " + teste2);
        }
    }
    
}
