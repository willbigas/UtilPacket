package calendario;

import java.text.SimpleDateFormat;

/**
 *
 * @author William
 */
public class Hora {

    /**
     * Formatando Integer em Minutos:Segundos
     *
     * @param numero
     * @return
     */
    public static String Hora(Integer numero) {
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
    
     /**
     * Pega a hora Atual e converte em String no formato HH:mm:ss
     * @return String : 10:50:25
     */
    public static String horaAtual(){
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
        java.util.Date dataUtil = new java.util.Date();
        return formatador.format(dataUtil.getTime());
    }
}
