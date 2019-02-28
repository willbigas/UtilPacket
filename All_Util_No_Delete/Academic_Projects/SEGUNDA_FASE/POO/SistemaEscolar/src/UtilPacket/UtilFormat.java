package UtilPacket;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utilitario para Formatacao de Variaveis - Data, DecimalFormat
 *
 * @since 03/09/2018 - Ultima Modificação
 * @author William Bigas Mauro
 */
public class UtilFormat {

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
     * Formatando um Double em Moeda - "R$ 1,110.00"
     *
     * @param numero
     * @return String
     */
    public static String decFormatR$(Double numero) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ ###,###,##0.00");
        return df.format(numero);
    }

    /**
     * Formatando um Integer em Moeda - "R$ 1,110.00"
     *
     * @param numero
     * @return String
     */
    public static String decFormatR$(Integer numero) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ ###,###,##0.00");
        return df.format(numero);
    }

    /**
     * Formatando um Decimal em Valor decimal Normal - "1,110.00"
     *
     * @param numero
     * @return
     */
    public static String decFormatNormal(Double numero) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("###,###,##0.00");
        return df.format(numero);
    }

    /**
     * Formatando um Inteiro em Valor decimal Normal - "1,110.00"
     *
     * @param numero
     * @return
     */
    public static String decFormatNormal(Integer numero) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("###,###,##0.00");
        return df.format(numero);
    }
}
