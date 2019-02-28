package UtilPacket;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utilitario para Formatacao de Variaveis
 *
 * @author William
 */
public class UtilFormat {

    /**
     * Convertendo Strings para Valores
     *
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
     *
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
     *
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

    /**
     * Convertendo Data para String e String para Data
     *
     * @param dataStr
     * @return Date
     * @throws Exception
     */
    public static Date StrforDate(String dataStr) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.parse(dataStr);
    }

    public static String dateForString(Date data) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(data);
    }

    public static String decFormatMoeda(Double numero) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
        return df.format(numero);
    }
}
