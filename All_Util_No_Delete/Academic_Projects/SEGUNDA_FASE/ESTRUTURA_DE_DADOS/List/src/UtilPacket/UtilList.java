/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilPacket;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author William
 */
public class UtilList {
    
    /**
     * Ordena uma Arraylist usando Algoritmo BubbleSort
     * @param lista
     * @return List<Integer>
     */

    public static List<Integer> ordenarBubbleSort(List<Integer> lista) {

        int aux = 0;
        int i = 0;

        for (i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size() - 1; j++) {
                if (lista.get(j).intValue() > lista.get(j + 1)) {
                    aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                    
                }
            }
        }
        return lista;

    }
}
