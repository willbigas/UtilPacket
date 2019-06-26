package formatador;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class DecimalFormat {

    /**
     * Formatando um Double em Moeda - "R$ 1,110.00"
     *
     * @param numero
     * @return String
     */
    public static String decimalFormatR$(Double numero) {
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.applyPattern("R$ ###,###,##0.00");
        return df.format(numero);
    }

    /**
     * Formatando um Integer em Moeda - "R$ 1,110.00"
     *
     * @param numero
     * @return String
     */
    public static String decimalFormatR$(Integer numero) {
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.applyPattern("R$ ###,###,##0.00");
        return df.format(numero);
    }

    /**
     * Formatando um Decimal em Valor decimal Normal - "1,110.00"
     *
     * @param numero
     * @return
     */
    public static String decimalFormat(Double numero) {
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.applyPattern("###,###,##0.00");
        return df.format(numero);
    }

    /**
     * Formatando um Inteiro em Valor decimal Normal - "1,110.00"
     *
     * @param numero
     * @return
     */
    public static String decimalFormat(Integer numero) {
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.applyPattern("###,###,##0.00");
        return df.format(numero);
    }

    public static Double toDecimalUs(String valorDecimal) {
        double d = 0;
        try {
            NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
            Number number = format.parse(valorDecimal);
            d = number.doubleValue();
        } catch (ParseException parseException) {
            JOptionPane.showMessageDialog(null, "Erro ao converter para NumberFormat com [.]");
        }
        return d;
    }

    /**
     * Recebe uma String com campos decimais em , Ex : [1000,00] e converte para
     * campos com ponto Ex : [1000.00]
     *
     * @param valorDecimal
     * @return
     */
    public static String paraPonto(String valorDecimal) {
        return valorDecimal.replace(",", ".");
    }

    /**
     * Recebe uma String com campos decimais em . Ex : [1000.00] e converte para
     * campos com virgula Ex : [1000,00]
     *
     * @param valorDecimal
     * @return
     */
    public static String paraVirgula(String valorDecimal) {
        return valorDecimal.replace(".", ",");
    }
}
