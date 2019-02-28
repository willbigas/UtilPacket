/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilPacket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Utiliarios Arraylist
 *
 * @author William Bigas Mauro
 */
public class UtilList {

    /**
     * Ordena uma Arraylist usando Algoritmo BubbleSort
     *
     * @param lista
     * @return List<Integer>
     */
    public static List<Integer> bubbleSort(List<Integer> lista) {
        int aux = 0;
        for (Integer lista1 : lista) {
            for (int j = 0; j < lista.size() - 1; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                }
            }
        }
        return lista;
    }

    /**
     * Ordena uma Lista de Integer usando Collections Sort nativo do Java.
     *
     * @param lista
     * @return List<Integer>
     */
    public static List<Integer> ordListInt(List<Integer> lista) {
        Collections.sort(lista);
        return lista;
    }

    /**
     * Ordena uma Lista de Double usando Collections Sort nativo do Java.
     *
     * @param lista
     * @return List<Double>
     */
    public static List<Double> ordListDec(List<Double> lista) {
        Collections.sort(lista);
        return lista;
    }
    
    /**
     * Gerar uma lista de um Numero Inteiro Randomico , pode haver repeticoes
     *
     * @param numInicial
     * @param numFinal
     * @param qtdNumero
     * @return List<Integer>
     */
    public static List<Integer> numRandomList(Integer numInicial, Integer numFinal, Integer qtdNumero) {
        List<Integer> numA = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < qtdNumero; i++) {
            numA.add(r.nextInt(numFinal - numInicial) + numInicial);

        }
        return numA;

    }

    /**
     * Gerar uma lista de um Numero Decimal Randomico , pode haver repeticoes
     *
     * @param numInicial
     * @param numFinal
     * @param qtdNumero
     * @return
     */
    public static List<Double> numRandomList(Double numInicial, Double numFinal, Integer qtdNumero) {
        List<Double> numA = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < qtdNumero; i++) { //Sequencia da mega sena
            numA.add(numInicial + (numFinal - numInicial) * r.nextDouble());

        }
        return numA;
    }

    /**
     * Gerar Lista de numeros Randomicos Inteiros e Decimais Aleatórios sem
     * Repetições
     *
     * @param Integer numInicial
     * @param Integer numFinal
     * @return List<Integer>
     * @return
     */
    public static List<Integer> numRandomListNoRepeat(Integer numInicial, Integer numFinal) {
        List<Integer> numA = new ArrayList<>();
        for (int i = numInicial; i <= numFinal; i++) {
            numA.add(i);
        }
        Collections.shuffle(numA);
        return numA;
    }

    /**
     * Gerar Lista de numeros Randomicos Inteiros e Decimais Aleatórios sem
     * Repetições
     *
     * @param numInicial
     * @param numFinal
     * @return List<Double>
     */
    public static List<Double> numRandomListNoRepeat(Double numInicial, Double numFinal) {
        List<Double> numA = new ArrayList<>();
        for (Double i = numInicial; i <= numFinal; i++) {
            numA.add(i);
        }
        Collections.shuffle(numA);
        return numA;
    }
}
