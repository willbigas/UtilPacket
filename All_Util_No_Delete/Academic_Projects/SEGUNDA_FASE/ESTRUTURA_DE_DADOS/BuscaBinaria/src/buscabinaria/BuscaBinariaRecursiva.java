package buscabinaria;

import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class BuscaBinariaRecursiva {

    public static void main(String[] args) {
        Integer[] array = new Integer[500];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        Integer busca = 230;
        Integer indiceInicio = 0;
        Integer indiceFinal = array.length - 1;
        Integer posicao = buscabinaria(array, busca, indiceInicio, indiceFinal);
        System.out.println("Posicao Buscada no indice " + posicao);
    }

    private static Integer buscabinaria(Integer[] array, Integer busca, Integer inicio, Integer fim) {
        Boolean encontrou = false;

        while (!encontrou && inicio <= fim) {
            Integer meio = (inicio + fim) / 2;
            if (array[meio].equals(busca)) {
                encontrou = true;
            }
            if (array[meio] > busca) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }

            if (encontrou) {
                return meio;
            } else {
                buscabinaria(array, busca, inicio, fim);
            }
        }
        return null;
    }
}
