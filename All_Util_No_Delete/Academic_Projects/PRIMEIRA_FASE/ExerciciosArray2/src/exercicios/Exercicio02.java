package exercicios;

import UtilPacket.UtilList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author WILL
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Integer[] inteiros = UtilPacket.UtilArray.numRandom(0, 20, 50);
        List<Integer> intLista = Arrays.asList(inteiros);
        Map<String, Integer> numModa = new HashMap<>();
        Integer qtdModa = 0;
        for (int i = 0; i < inteiros.length; i++) {
            Integer Inteiro = inteiros[i];
            System.out.println("Posicao" + i + " N: " + Inteiro);

        }

        Integer media = UtilPacket.UtilArray.media(inteiros);
        System.out.println("Media: " + media);

        Map<String, Integer> frequencia = UtilList.mapearFrequencia(intLista);
        Map<String, Integer> valorMaior = new HashMap();
        System.out.println("LISTA DE NUMEROS");
        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            System.out.println("Chave " + key + " Valor -> " + value);
            
        }
        System.out.println("Frequencia de Numeros");
        System.out.println(frequencia);
        Integer valorM = 0;

        for (String chaves : frequencia.keySet()) {
            if (frequencia.get(chaves) > valorM) {
                valorM = frequencia.get(chaves);
            }

        }

        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value.equals(valorM)) {
                valorMaior.put(key, value);
            }
        }

        System.out.println("A Moda é : " + "Chave " + valorMaior.keySet() + " N Repeticoes :" + valorMaior.values());
    }

}
