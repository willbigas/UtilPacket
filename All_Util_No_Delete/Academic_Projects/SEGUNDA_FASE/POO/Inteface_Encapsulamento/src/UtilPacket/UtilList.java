/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilPacket;

import java.util.Collections;
import java.util.List;

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
    public static List<Integer> ordenarBubbleSort(List<Integer> lista) {
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
     * Ordena uma Lista usando Collections Sort nativo do Java.
     *
     * @param lista
     * @return Integer e Double
     */
    public static List<Integer> ordenarListaInt(List<Integer> lista) {
        Collections.sort(lista);
        return lista;
    }

    public static List<Double> ordenarListDec(List<Double> lista) {
        Collections.sort(lista);
        return lista;
    }
}
