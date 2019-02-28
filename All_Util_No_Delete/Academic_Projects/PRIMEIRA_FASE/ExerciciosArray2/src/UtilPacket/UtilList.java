package UtilPacket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Utiliarios Arraylist - Ordenar, Max, Min, Media, e Randomicos.
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

    /**
     * Media de um Arraylist de Inteiros
     *
     * @param numeros
     * @return Integer
     */
    public static Integer media(List<Integer> numeros) {
        Integer quantidade = numeros.size();
        Integer valorT = 0;
        for (int i = 0; i < numeros.size(); i++) {
            valorT = valorT + numeros.get(i);
        }
        Integer calculo = valorT / quantidade;
        return calculo;
    }

    /**
     * Media de um Arraylist de Decimais
     *
     * @param numeros - List <Double> como parametro
     * @return Double retorna um Decimal
     */
    public static Double mediaDec(List<Double> numeros) {
        Integer quantidade = numeros.size();
        Double valorT = 0.0;
        for (int i = 0; i < numeros.size(); i++) {
            valorT = valorT + numeros.get(i);
        }
        Double calculo = valorT / quantidade;
        return calculo;
    }

    /**
     * Maior Numero de um Arraylist de Integer
     *
     * @param numeros Recebe uma Lista de Inteiros
     * @return Integer Retorna uma Inteiro
     */
    public static Integer maiorNum(List<Integer> numeros) {
        Integer aux = 0; // Colocar o Valor Minimo

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > aux) {
                aux = numeros.get(i);
            }
        }
        return aux;
    }

    /**
     * Menor Numero de um Arraylist de Inteiros
     *
     * @param numeros Recebe uma Lista de Inteiros
     * @return Integer Retorna um Numero Inteiro
     */
    public static Integer menorNum(List<Integer> numeros) {
        Integer aux = 10; // Colocar valor maximo.
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < aux) {
                aux = numeros.get(i);
            }
        }
        return aux;
    }

    /**
     * Maior Numero de um Arraylist de Decimais
     *
     * @param numeros Recebe uma lista de Decimais
     * @return Double Retorna um Decimal
     */
    public static Double maiorNumDec(List<Double> numeros) {
        Double aux = 0.0; // Colocar o Valor Minimo
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > aux) {
                aux = numeros.get(i);
            }
        }
        return aux;
    }

    /**
     * Menor Numero de um Arraylist de Decimais
     *
     * @param numeros Recebe uma lista de Decimais
     * @return Double Retorna um Decimal
     */
    public static Double menorNumDec(List<Double> numeros) {
        Double aux = 10.0; // Colocar valor maximo.
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < aux) {
                aux = numeros.get(i);
            }
        }
        return aux;
    }

    /**
     * Faz Contagem de frequencia de valores e retorna um Map < Key,Value >
     *
     * @param numeros - Recebe uma Lista de Valores como Parametro
     * @return Map - Retorna um Map < Key , Value >
     */
    public static Map mapearFrequencia(List valores) {
        Map<String, Integer> contFreq = new HashMap<>();
        Iterator<Integer> it = valores.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            int frequency = Collections.frequency(valores, obj);
            contFreq.put(String.valueOf(obj), frequency);
        }

        return contFreq;

    }
}
