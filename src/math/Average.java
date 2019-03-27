package math;

/**
 *
 * @author William
 */
public class Average {

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
     * Media de um Array de Inteiros
     *
     * @param numeros
     * @return Integer
     */
    public static Integer media(Integer[] numeros) {
        Integer quantidade = numeros.length;
        Integer valorT = 0;
        for (Integer numero : numeros) {
            valorT = valorT + numero;
        }
        Integer calculo = valorT / quantidade;
        return calculo;
    }

    /**
     * Media de um Array de Inteiros
     *
     * @param numeros
     * @return Integer
     */
    public static Double media(Double[] numeros) {
        Integer quantidade = numeros.length;
        Double valorT = 0.0;
        for (Double numero : numeros) {
            valorT = valorT + numero;
        }
        Double calculo = valorT / quantidade;
        return calculo;
    }
}
