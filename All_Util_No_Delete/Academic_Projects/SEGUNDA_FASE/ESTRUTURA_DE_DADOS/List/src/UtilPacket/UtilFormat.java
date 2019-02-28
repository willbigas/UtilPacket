package UtilPacket;

/**
 *
 * @author William
 */
public class UtilFormat {

    /**
     * Convertendo Strings para Valores
     * @param texto
     * @return Integer and Double
     */
    public static Integer strForInt(String texto) {

        Integer valorInteiro = Integer.valueOf(texto);
        return valorInteiro;
    }

    public static Double strForDec(String texto) {

        Double valorInteiro = Double.valueOf(texto);
        return valorInteiro;
    }

    /**
     * Convertendo Valores para Strings
     * @param valorDecimal
     * @return String
     */
    public static String decForStr(Double valorDecimal) {

        String texto = valorDecimal.toString();
        return texto;
    }

    public static String intForStr(Integer valorInteiro) {

        String texto = valorInteiro.toString();
        return texto;
    }

    /**
     * Convertendo Tipos de Valores
     * @param valorDecimal
     * @return Integer and Double
     */
    public static Integer decForInt(Double valorDecimal) {

        Integer numeroInteiro = valorDecimal.intValue();
        return numeroInteiro;
    }

    public static Double intForDec(Integer valorInteiro) {

        Double numeroDecimal = valorInteiro.doubleValue();
        return numeroDecimal;
    }
}
