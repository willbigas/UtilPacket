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
 * @author William
 */
public class Exercicio02 {

    public static void main(String[] args) {
            System.out.println("----Remocao em ArrayList----");
            exclusaoemArrayList();
            System.out.println("\r\n");
            
            System.out.println("----Remocao em LinkedList----");
            exclusaoEmLinkedList();
            System.out.println("\r\n");
            
            System.out.println("----Remocao em Vector----");
            exclusaoEmVector();
    }

    public static void exclusaoemArrayList() {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            Integer numR = UtilPacket.UtilMath.gerarNumRandInt(1, 10000);
            lista.add(i, numR);

        }
        System.out.println("Lista Antes de Remover em Arraylist: " + lista);
        Date anterior = new Date();
        Long milliAnterior = anterior.getTime();
        lista.remove(0);
        System.out.println("Lista depois de Remover em Arraylist: " + lista);
        Date posterior = new Date();
        Long milliPosterior = posterior.getTime();
        System.out.println("Tempo gasto para Remocao em Arraylist : " + (milliPosterior - milliAnterior));
    }

    public static void exclusaoEmLinkedList() {
        List<Integer> lista = new LinkedList<>();

        for (int i = 0; i < 10; i++) {

            Integer numR = UtilPacket.UtilMath.gerarNumRandInt(1, 10000);
            lista.add(i, numR);

        }
        System.out.println("Lista Antes de Remover em LinkedList: " + lista);
        Date anterior = new Date();
        Long milliAnterior = anterior.getTime();
        lista.remove(0);
        System.out.println("Lista depois de Remover em LinkedList: " + lista);
        Date posterior = new Date();
        Long milliPosterior = posterior.getTime();
        System.out.println("Tempo gasto para Remocao em LinkedList : " + (milliPosterior - milliAnterior));
    }
    
    public static void exclusaoEmVector() {
        List<Integer> lista = new Vector<>();

        for (int i = 0; i < 10; i++) {

            Integer numR = UtilPacket.UtilMath.gerarNumRandInt(1, 10000);
            lista.add(i, numR);

        }
        System.out.println("Lista Antes de Remover em Vector: " + lista);
        Date anterior = new Date();
        Long milliAnterior = anterior.getTime();
        lista.remove(0);
        System.out.println("Lista depois de Remover em Vector: " + lista);
        Date posterior = new Date();
        Long milliPosterior = posterior.getTime();
        System.out.println("Tempo gasto para Remocao em Vector : " + (milliPosterior - milliAnterior));
    }
    
    
}
