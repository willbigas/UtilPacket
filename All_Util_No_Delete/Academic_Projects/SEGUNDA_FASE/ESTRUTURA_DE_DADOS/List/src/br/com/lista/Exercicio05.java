/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author William
 */
public class Exercicio05 {

    public static void main(String args[]) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Integer numRandom = UtilPacket.UtilMath.gerarNumRandInt(0, 30);
            lista.add(numRandom);
        }

        int aux = 0;
        int i = 0;

        System.out.println("Vetor desordenado: ");
        for (i = 0; i < lista.size(); i++) {
            System.out.println(" " + lista.get(i));
        }
        System.out.println(" ");

        for (i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size() - 1; j++) {
                if (lista.get(j).intValue() > lista.get(j + 1)) {
                    aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                }
            }
        }
        System.out.println("Vetor organizado:");
        for (i = 0; i < lista.size(); i++) {
            System.out.println(" " + lista.get(i));
        }
    }
    
    
}
