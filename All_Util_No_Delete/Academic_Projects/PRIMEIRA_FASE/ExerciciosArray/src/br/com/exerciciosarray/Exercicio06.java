
package br.com.exerciciosarray;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author William
 */
public class Exercicio06 {
    public static void main(String[] args) {
        List<Integer> numA = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        
        for (int i = 0; i < 1; i++) {
          numA = UtilPacket.UtilList.numRandomListNoRepeat(0, 20);
            
        }
        System.out.println("||Lista de numeros||");
        for (int i = 0; i < 10; i++) {
            
            if (numA.get(i) % 2 == 0 ){
                pares.add(numA.get(i));
            }
            if (numA.get(i) % 2 == 1){
                impares.add(numA.get(i));
            }
        }
        System.out.println(numA);
        System.out.println("Numeros Pares :" + pares);
        System.out.println("Numeros Impares :" + impares);
        
    }
}
