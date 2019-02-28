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
     * Convertendo String para valor Inteiro
     *
     * @param texto String de um texto
     * @return Integer numero
     *
     */
    public static Integer strForInt(String texto) {
        return Integer.valueOf(texto);
    }

    /**
     * Convertendo String para valor Decimal
     *
     * @param texto Recebe uma String
     * @return Double Retorna um Double
     */
    public static Double strForDec(String texto) {
        return Double.valueOf(texto);
    }

    /**
     * Convertendo um valor Double para String
     *
     * @param valorDecimal Recebe um Decimal
     * @return String Retorna uma String
     */
    public static String decForStr(Double valorDecimal) {
        return valorDecimal.toString();
    }

    /**
     * Convertendo um valor Integer para String
     *
     * @param valorInteiro
     * @return String
     */
    public static String intForStr(Integer valorInteiro) {
        return valorInteiro.toString();
    }

    /**
     * Convertendo um valor Double para valor Integer
     *
     * @param valorDecimal
     * @return Integer
     */
    public static Integer numero(Double valorDecimal) {
        return valorDecimal.intValue();
    }

    /**
     * Convertendo um valor Integer para um valor Double
     *
     * @param valorInteiro
     * @return Double 
     */
    public static Double numero(Integer valorInteiro) {
        return valorInteiro.doubleValue();
    }

    /**
     * Convertendo String para Data no Formato DD/MM/AAAA
     *
     * @param dataStr
     * @return Date
     * @throws Exception
     */
    public static Date data(String dataStr) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.parse(dataStr);
    }

    /**
     * Convertendo Data para String no Formato DD/MM/AAAA
     *
     * @param data
     * @return String
     * @throws Exception
     */
    public static String data(Date data) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(data);
    }

    /**
     * Formatando um Double em Moeda - "R$ #,##0.00"
     *
     * @param numero
     * @return String
     */
    public static String decFormatMoeda(Double numero) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
        return df.format(numero);
    }

    /**
     * Formatando um Integer em Moeda - "R$ #,##0.00"
     * @param numero
     * @return String
     */
    public static String decFormatMoeda(Integer numero) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
        return df.format(numero);
    }
}
