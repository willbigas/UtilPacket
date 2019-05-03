package matematica;

/**
 *
 * @author William
 */
public class Randomicos {

    /**
     * Gerar Numeros Randomicos Inteiros entre um NumeroInicial e Final, Pode
     * haver Repeticoes de numeros
     *
     * @param numInicial
     * @param numFinal
     * @return Integer
     */
    public static Integer numRandom(Integer numInicial, Integer numFinal) {
        java.util.Random gerador = new java.util.Random();
        for (int i = 0; i < 1; i++) { //Sequencia da mega sena
            Integer numeroR = gerador.nextInt((numFinal + 1) - numInicial) + numInicial;
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
        java.util.Random gerador = new java.util.Random();
        for (int i = 0; i < 1; i++) { //Sequencia da mega sena
            return numInicial + ((numFinal + 1) - numInicial) * gerador.nextDouble();
        }
        return null;
    }

    /**
     *
     * @param numInicial
     * @param numFinal
     * @param qtdNumero
     * @return
     */
    public static Integer[] numRandom(Integer numInicial, Integer numFinal, Integer qtdNumero) {
        Integer array[] = new Integer[qtdNumero];
        for (int i = 0; i < qtdNumero; i++) {
            array[i] = numRandom(numInicial, numFinal);
        }
        return array;

    }

    /**
     *
     * @param numInicial
     * @param numFinal
     * @param qtdNumero
     * @return
     */
    public static Double[] numRandom(Double numInicial, Double numFinal, Integer qtdNumero) {
        Double array[] = new Double[qtdNumero];
        for (int i = 0; i < qtdNumero; i++) {
            array[i] = numRandom(numInicial, numFinal);
        }
        return array;

    }

    /**
     * Gerar numeros Randomicos de Inteiros sem repetir numeros.
     *
     * @param numInicial
     * @param numFinal
     * @param qtdNumero
     * @return
     */
    public static Integer[] numRandomNoRepeat(Integer numInicial, Integer numFinal, Integer qtdNumero) {
        Integer[] valores = new Integer[qtdNumero];
        java.util.Random gera = new java.util.Random();

        int i = 0;
        while (i < valores.length) {
            valores[i] = numRandom(numInicial, numFinal);
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
     *
     * @param numInicial
     * @param numFinal
     * @param qtdNumero
     * @return
     */
    public static Double[] numRandomNoRepeat(Double numInicial, Double numFinal, Integer qtdNumero) {
        Double[] valores = new Double[qtdNumero];
        java.util.Random gera = new java.util.Random();

        int i = 0;
        while (i < valores.length) {
            valores[i] = numRandom(numInicial, numFinal);
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
