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
public class Exercicio04 {

    public static void main(String[] args) {

        Integer numDivPor2 = 0;
        Integer numDivPor3 = 0;
        Integer qtdDivPor2 = 0;
        Integer qtdDivPor3 = 0;
        for (int i = 0; i <= 100; i++) {
            Integer numero = i;

            if (numero % 2 == 0) {
                numDivPor2 = i;
                qtdDivPor2++;
                System.out.println("Numeros Divisiveis por 2 : " + numDivPor2);
            }
            if (numero % 3 == 0) {
                numDivPor3 = i;
                qtdDivPor3++;
                System.out.println("Numeros Divisiveis por 3 : " + numDivPor3);
            }

        }

        System.out.println("Quantidade de numeros Divisiveis por 2 : " + qtdDivPor2);

        System.out.println("Quantidade de numeros Divisiveis por 3 : " + qtdDivPor3);
    }
}
