
package UtilPacket;

import java.util.Random;

/**
 * Utilitarios de Array - Numeros Randomicos
 * @since Ultima Modificacao 03/09/2018
 *
 * @author William
 */
public class UtilArray {

    public static Integer[] numRandom(Integer numInicial, Integer numFinal, Integer qtdNumero) {
        Integer array[] = new Integer[qtdNumero];
        for (int i = 0; i < qtdNumero; i++) {
            array[i] = UtilMath.numRandom(numInicial, numFinal);
        }
        return array;

    }

    public static Double[] numRandom(Double numInicial, Double numFinal, Integer qtdNumero) {
        Double array[] = new Double[qtdNumero];
        for (int i = 0; i < qtdNumero; i++) {
            array[i] = UtilMath.numRandom(numInicial, numFinal);
        }
        return array;

    }
    /**
     * Gerar numeros Randomicos de Inteiros sem repetir numeros.
     * @param numInicial
     * @param numFinal
     * @param qtdNumero
     * @return 
     */

    public static Integer[] numRandomNoRepeat(Integer numInicial, Integer numFinal, Integer qtdNumero) {
        Integer[] valores = new Integer[qtdNumero];
        Random gera = new Random();

        int i = 0;
        while (i < valores.length) {
            valores[i] = UtilMath.numRandom(numInicial, numFinal);
            boolean colide = false;
            for (int j = 0; j < i; j++) {
                if (valores[i].equals(valores[j])) {
                    colide = true;
                    break;
                }
            }
            if (!colide) {
                i++;
            }
        }
        return valores;

       
    }
    
    /**
     * Gerar numeros Randomicos de Decimais sem repetir numeros.
     * @param numInicial
     * @param numFinal
     * @param qtdNumero
     * @return 
     */

    public static Double[] numRandomNoRepeat(Double numInicial, Double numFinal, Integer qtdNumero) {
        Double[] valores = new Double[qtdNumero];
        Random gera = new Random();

        int i = 0;
        while (i < valores.length) {
            valores[i] = UtilMath.numRandom(numInicial, numFinal);
            boolean colide = false;
            for (int j = 0; j < i; j++) {
                if (valores[i].equals(valores[j])) {
                    colide = true;
                    break;
                }
            }
            if (!colide) {
                i++;
            }
        }
        return valores;

       
    }

}
