package calendar;

import java.text.SimpleDateFormat;

/**
 *
 * @author William
 */
public class Hour {

    /**
     * Formatando Integer em Minutos:Segundos
     *
     * @param numero
     * @return
     */
    public static String mmss(Integer numero) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("mm:ss");
        return sdf.format(numero);
    }

    /**
     * Formatando Double em Minutos:Segundos
     *
     * @param numero
     * @return
     */
    public static String mmss(Double numero) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("mm:ss");
        return sdf.format(numero);
    }

    /**
     * Formatando Integer em Horas:Minutos:Segundos
     *
     * @param numero
     * @return
     */
    public static String hhmmss(Integer numero) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("HH:mm:ss");
        return sdf.format(numero);
    }

    /**
     * Formatando Double em Horas:Minutos:Segundos
     *
     * @param numero
     * @return
     */
    public static String hhmmss(Double numero) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("HH:mm:ss");
        return sdf.format(numero);
    }
}
