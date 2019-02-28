/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lista;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Alunos
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        execucaoEmArray();
        execucaoemLinkedList();
        execucaoEmVector();

    }

    public static void execucaoEmArray() {
        List<Integer> lista = new ArrayList<>();
        Date anterior = new Date();
        Long milliAnterior = anterior.getTime();

        for (int i = 0; i < 10; i++) {

            Integer numR = UtilPacket.UtilMath.gerarNumRandInt(1, 10000);
            lista.add(i, numR);

        }
        Date posterior = new Date();
        System.out.println(lista);
        Long milliPosterior = posterior.getTime();
        System.out.println("Tempo gasto para Execução em Arraylist : " + (milliPosterior - milliAnterior) + " Millisegundos\r\n");
    }

    public static void execucaoemLinkedList() {
        List<Integer> lista = new LinkedList<>();
        Date anterior = new Date();
        Long milliAnterior = anterior.getTime();

        for (int i = 0; i < 10; i++) {

            Integer numR = UtilPacket.UtilMath.gerarNumRandInt(1, 10000);
            lista.add(i, numR);

        }
        Date posterior = new Date();
        System.out.println(lista);
        Long milliPosterior = posterior.getTime();
        System.out.println("Tempo gasto para Execução em LinkedList : " + (milliPosterior - milliAnterior) + " Millisegundos\r\n");
    }

    public static void execucaoEmVector() {
        List<Integer> lista = new Vector<>();
        Date anterior = new Date();
        Long milliAnterior = anterior.getTime();

        for (int i = 0; i < 10; i++) {

            Integer numR = UtilPacket.UtilMath.gerarNumRandInt(1, 10000);
            lista.add(i, numR);

        }
        Date posterior = new Date();
        System.out.println(lista);
        Long milliPosterior = posterior.getTime();
        System.out.println("Tempo gasto para Execução em Vector : " + (milliPosterior - milliAnterior) + " Millisegundos\r\n");
    }

}
