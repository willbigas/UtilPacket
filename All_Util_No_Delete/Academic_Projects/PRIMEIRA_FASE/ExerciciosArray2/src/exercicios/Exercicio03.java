/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import UtilPacket.UtilList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author William
 */
public class Exercicio03 {
    public static void main(String[] args) {
        List<Integer> numA = UtilPacket.UtilList.numRandomList(0, 10, 1000);
        System.out.println("LISTA DE NUMEROS ALEATORIOS");
        System.out.println(numA);
        Map<String , Integer > frequencia = UtilList.mapearFrequencia(numA);
        System.out.println("LISTA DE FREQUENCIA DOS NUMEROS");
        System.out.println(frequencia);
        
        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(key.equals("1")) {
                System.out.println("Chave " + key +  " - " + value + " Vezes");
            }
            
            if(key.equals("3")) {
                System.out.println("Chave " + key +  " - " + value + " Vezes");
            }
            if(key.equals("5")) {
                System.out.println("Chave " + key +  " - " + value + " Vezes");
            }
        }
    }
}
