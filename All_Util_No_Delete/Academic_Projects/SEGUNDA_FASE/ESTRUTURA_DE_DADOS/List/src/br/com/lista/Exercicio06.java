/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author William
 */
public class Exercicio06 {

    public static void main(String[] args) {
        List<Integer> listaA = new ArrayList<>();
        List<Integer> listaB = new ArrayList<>();
        List<Integer> listaIguais = new ArrayList<>();
        List<Integer> listaAnaoB = new ArrayList<>();
        List<Integer> listaBnaoA = new ArrayList<>();

        Random randomico = new Random();
        for (int i = 5; i < 15; i++) {
            listaA.add(i);
        }

        for (int i = 0; i < 10; i++) {
            listaB.add(i);
        }

        Collections.shuffle(listaA);
        Collections.shuffle(listaB);
        for (int i = 0; i < 1; i++) {
            System.out.println("Lista A:" + listaA);
            System.out.println("Lista B:" + listaB);
        }

        listaAnaoB.addAll(listaA);
        listaAnaoB.addAll(listaB);

        for (int i = 0; i < listaA.size(); i++) {
            for (int j = 0; j < listaB.size(); j++) {
                if (listaA.get(i).equals(listaB.get(j))) {
                    listaIguais.add(listaA.get(i));
                }

            }

        }

        listaBnaoA.addAll(listaA);
        listaBnaoA.addAll(listaB);

        listaAnaoB.removeAll(listaB);
        listaBnaoA.removeAll(listaA);

        System.out.println("Lista de numeros que Contem em A porem não B: " + listaAnaoB);
        System.out.println("Lista de numeros que Contem em B porem não A: " + listaBnaoA);

        System.out.println("Lista de Iguais: " + listaIguais);

    }
}
