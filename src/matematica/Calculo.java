package matematica;

/**
 * Utilitarios Matematicos Simples (Media,Porcentagem,Raiz Quadrada ,Fatorial)
 *
 * @since 16/09/2018
 * @author William Bigas Mauro
 */
public class Calculo {

    /**
     * Calculo de Raiz Quadrada
     *
     * @param valorRaiz
     * @return Double
     */
    public static Double raizQuadrada(Integer valorRaiz) {
        Double valorTotal = java.lang.Math.sqrt(valorRaiz);
        return valorTotal;
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

    /**
     * Verificar se o numero passado por parametro é primo
     *
     * @param numero - Recebe um Integer como Parametro
     * @return boolean - Retorna true ou false
     */
    public static boolean numeroPrimo(Integer numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }

}
