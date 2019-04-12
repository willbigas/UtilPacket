package math;

/**
 *
 * @author William
 */
public class Porcentagem {

    /**
     * Calculo de Porcentagem de Dois Doubles.
     *
     * @param valorCalculo
     * @param valorPorcentagem
     * @return Integer and Double
     */
    public static Double percent(Double valorCalculo, Double valorPorcentagem) {
        return (valorCalculo * valorPorcentagem) / 100;
    }

    /**
     * Calculo de Porcentagem de Dois Integers.
     *
     * @param valorCalculo
     * @param valorPorcentagem
     * @return
     */
    public static Integer percent(Integer valorCalculo, Integer valorPorcentagem) {
        return (valorCalculo * valorPorcentagem) / 100;
    }

    /**
     * Calculo de Porcentagem de Duas Strings.
     *
     * @param valorCalculo
     * @param valorPorcentagem
     * @return Retorna o Inteiro se Conseguiu converter os dados.
     */
    public static Integer percent(String valorCalculo, String valorPorcentagem) {
        try {
            Integer valorCalculoInt = Integer.valueOf(valorCalculo);
            Integer valorPorcentagemInt = Integer.valueOf(valorPorcentagem);
            return (valorCalculoInt * valorPorcentagemInt) / 100;
        } catch (NumberFormatException numberFormatException) {
        }
        return null;
    }

}
