package UtilPacket;

import java.util.List;
import java.util.Random;

/**
 * UTILITARIOS MATEMATICOS
 *
 * @author William Bigas Mauro
 */
public class UtilMath {

    /**
     * Operadores Aritmeticos Simples [+ - * /]
     *
     * @param numeroA
     * @param numeroB
     * @return Double
     */
    public static Double somarNumDec(Double numeroA, Double numeroB) {
        Double somaNumero = numeroA + numeroB;
        return somaNumero;
    }

    public static Double subtrairNumDec(Double numeroA, Double numeroB) {
        Double somaNumero = numeroA - numeroB;
        return somaNumero;
    }

    public static Double multiplicarNumDec(Double numeroA, Double numeroB) {
        Double somaNumero = numeroA * numeroB;
        return somaNumero;
    }

    public static Double dividirNumDec(Double numeroA, Double numeroB) {
        Double somaNumero = numeroA / numeroB;
        return somaNumero;
    }

    /**
     * Calculo de Medias de Decimais e Inteiros.
     *
     * @param numeroA
     * @param numeroB
     * @return Integer and Double
     */
    public static Double mediaDoisDec(Double numeroA, Double numeroB) {
        Double media = (numeroA + numeroB) / 2;
        return media;
    }

    public static Integer mediaDoisInt(Integer numeroA, Integer numeroB) {
        Integer media = (numeroA + numeroB) / 2;
        return media;
    }

    /**
     * Media de Arraylist
     *
     * @param numeros
     * @return Integer
     */
    public static Integer mediaArrayList(List<Integer> numeros) {
        Integer quantidade = numeros.size();
        Integer valorT = 0;
        for (int i = 0; i < numeros.size(); i++) {
            valorT = valorT + numeros.get(i);
        }
        Integer calculo = valorT / quantidade;
        return calculo;
    }

    /**
     * Maior e menor numero.
     *
     * @param numeroA
     * @param numeroB
     * @return Integer and Double
     */
    public static Double maiorNumDec(Double numeroA, Double numeroB) {
        return Math.max(numeroA, numeroB);
    }

    public static Integer maiorNumInt(Integer numeroA, Integer numeroB) {
        return Math.max(numeroA, numeroB);
    }

    public static Double menorNumDec(Double numeroA, Double numeroB) {
        return Math.min(numeroA, numeroB);
    }

    public static Integer menorNumInt(Integer numeroA, Integer numeroB) {
        return Math.min(numeroA, numeroB);
    }

    /**
     * Maior e menor Numero em Arraylist de Integer e Double
     *
     * @param numeros
     * @return Integer e Double
     */
    public static Integer maiorValorArrayList(List<Integer> numeros) {
        Integer aux = 0; // Colocar o Valor Minimo

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > aux) {
                aux = numeros.get(i);
            }
        }
        return aux;
    }

    public static Integer menorValorArraylist(List<Integer> numeros) {
        Integer aux = 10; // Colocar valor maximo.
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < aux) {
                aux = numeros.get(i);
            }
        }
        return aux;
    }

    public static Double maiorValorArrayListDouble(List<Double> numeros) {
        Double aux = 0.0; // Colocar o Valor Minimo
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > aux) {
                aux = numeros.get(i);
            }
        }
        return aux;
    }

    public static Double menorValorArraylistDouble(List<Double> numeros) {
        Double aux = 10.0; // Colocar valor maximo.
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < aux) {
                aux = numeros.get(i);
            }
        }
        return aux;
    }

    /**
     * Calculo de Porcentagem
     *
     * @param valorCalculo
     * @param valorPorcentagem
     * @return Integer and Double
     */
    public static Double porcentagemDec(Double valorCalculo, Double valorPorcentagem) {
        Double valorTotal = (valorCalculo * valorPorcentagem) / 100;
        return valorTotal;
    }

    public static Integer porcentagemInt(Integer valorCalculo, Integer valorPorcentagem) {
        Integer valorTotal = (valorCalculo * valorPorcentagem) / 100;
        return valorTotal;
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
     * Gerar Numeros Randomicos de Inteiros e Decimais
     *
     * @param numInicial
     * @param numFinal
     * @return Integer and Double
     */
    public static Integer gerarNumRandInt(Integer numInicial, Integer numFinal) {
        Random gerador = new Random();
        for (int i = 0; i <= 1; i++) { //Sequencia da mega sena
            Integer numeroR = gerador.nextInt(numFinal) + numInicial;
            return numeroR;
        }
        return null;
    }

    public static Double gerarNumRandDouble(Integer numInicial, Integer numFinal) {
        Random gerador = new Random();
        for (int i = 0; i <= 1; i++) { //Sequencia da mega sena
            Integer numeroR = gerador.nextInt(numFinal) + numInicial;
            Double numeroRDouble = numeroR.doubleValue();
            return numeroRDouble;
        }
        return null;
    }
}
