package UtilPacket;

import java.util.Random;

/**
 * UTILITARIOS MATEMATICOS
 *
 * @author William Bigas Mauro
 */
public class UtilMath {

    /**
     * Medias de Decimais.
     *
     * @param numeroA
     * @param numeroB
     * @return Double - Retorna uma media em decimal
     */
    public static Double media(Double numeroA, Double numeroB) {
        return (numeroA + numeroB) / 2;
    }

    /**
     * Media de Inteiros
     *
     * @param numeroA
     * @param numeroB
     * @return Integer - Retorna uma Media em Inteiro
     */
    public static Integer media(Integer numeroA, Integer numeroB) {
        return (numeroA + numeroB) / 2;
    }

    /**
     * Calculo de Porcentagem
     *
     * @param valorCalculo
     * @param valorPorcentagem
     * @return Integer and Double
     */
    public static Double porcentagem(Double valorCalculo, Double valorPorcentagem) {
        return (valorCalculo * valorPorcentagem) / 100;
    }

    public static Integer porcentagem(Integer valorCalculo, Integer valorPorcentagem) {
        return (valorCalculo * valorPorcentagem) / 100;
    }

    /**
     * Calculo de Raiz Quadrada
     *
     * @param valorRaiz
     * @return Double
     */
    public static Double raizQuadrada(Integer valorRaiz) {
        Double valorTotal = Math.sqrt(valorRaiz);
        return valorTotal;
    }

    /**
     * Gerar Numeros Randomicos Inteiros entre um NumeroInicial e Final, Pode
     * haver Repeticoes de numeros
     *
     * @param numInicial
     * @param numFinal
     * @return Integer
     */
    public static Integer numRandom(Integer numInicial, Integer numFinal) {
        Random gerador = new Random();
        for (int i = 0; i < 1; i++) { //Sequencia da mega sena
            Integer numeroR = gerador.nextInt(numFinal - numInicial) + numInicial;
            return numeroR;
        }
        return null;
    }

    /**
     * Gerar Numeros Randomicos Decimais entre um NumeroInicial e Final, Pode
     * haver Repeticoes de numeros
     *
     * @param numInicial
     * @param numFinal
     * @return
     */
    public static Double numRandom(Double numInicial, Double numFinal) {
        Random gerador = new Random();
        for (int i = 0; i < 1; i++) { //Sequencia da mega sena
            return numInicial + (numFinal - numInicial) * gerador.nextDouble();
        }
        return null;
    }

    /**
     * Calcular Fatorial de um Integer
     *
     * @param numero
     * @return Integer
     */
    public static Integer fatorial(Integer numero) {
        Integer fatorial = 1;

        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    /**
     * Calculo de Fatorial de Decimais
     *
     * @param numero
     * @return Double
     */
    public static Double fatorial(Double numero) {
        Double fatorial = 1.0;

        for (Double i = 2.0; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

}
