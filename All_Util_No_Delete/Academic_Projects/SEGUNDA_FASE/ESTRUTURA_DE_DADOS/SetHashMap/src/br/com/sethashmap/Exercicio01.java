/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sethashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author William
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> numRandom = new ArrayList<>();
        Integer teste = 0;
        
        Map<Integer, Integer> contagem = new HashMap();
        
        for (int i = 0; i < 30; i++) {
         numRandom.add(UtilPacket.UtilMath.gerarNumRandInt(1, 10));
         teste = 0;
            for (int j = 0; j < numRandom.size(); j++) {
                
                if (numRandom.get(i).equals(numRandom.get(j))) {
                    
                    contagem.put(numRandom.get(i), teste = teste + 1) ;
                } else {
                    
                }
            }
        }
        
        System.out.println("Numeros gerados : " + numRandom);
        System.out.println("||||||||| Contagem de Numeros |||||||");
        for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            
            System.out.println("O Numero " + key + " foi gerado: " + value + " x");
            
        }
    }

}
