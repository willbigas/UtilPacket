package calendario;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Classe de Utilitarios para Data - Conversores , Validações e Verificações.
 *
 * @author William Bigas Mauro
 * @since 27/03/2019
 */
public class Data {

    /**
     * Convertendo String para Data no Formato DD/MM/AAAA
     *
     * @param dataStr
     * @return Data
     * @throws Exception
     */
    public static java.util.Date data(String dataStr) throws Exception {
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
    public static String data(java.util.Date data) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(data);
    }

    /**
     * Metodo que verifica se uma String é uma Data com Verificação de Datas
     * validas usando @SetLenient
     *
     * @param data
     * @return Retorna True se a Data for Valida
     */
    public static boolean isDate(String data) {
        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            /**
             * O setLenient() é usado para setar sua escolha sobre datas
             * estranhas, quando eu seto para "false" estou dizendo que não
             * aceito datas falsas como 31/02/2016
             */
            sdf.setLenient(false);
            sdf.parse(data);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }

    /**
     * Convertendo String para Data no Formato HH:mm:ss
     *
     * @param dataStr
     * @return Data
     */
    public static java.util.Date dataHour(String dataStr) {
        try {
            DateFormat df = new SimpleDateFormat("HH:mm:ss");
            return df.parse(dataStr);
        } catch (ParseException parseException) {
        }
        return null;
    }

    /**
     * Convertendo Data para String no Formato HH:mm:ss
     *
     * @param data
     * @return String
     */
    public static String dataHour(java.util.Date data) {
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        return df.format(data);
    }

    /**
     *
     * @param data
     * @return Se dataVerificada comparada com hoje é menor então retorna
     * verdadeiro, senão, retorna falso.
     */
    public boolean dateLowerThanToday(String data) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataVerificada = LocalDate.parse(data, dtf);
        //Esse comando pega a data de hoje
        LocalDate hoje = LocalDate.now();

        return dataVerificada.compareTo(hoje) <= 0;
    }

    /**
     *
     * @param data
     * @return Se dataVerificada comparada com hoje é Maior então retorna
     * verdadeiro, senão, retorna falso.
     */
    public boolean dateLargerThanToday(String data) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataVerificada = LocalDate.parse(data, dtf);
        //Esse comando pega a data de hoje
        LocalDate hoje = LocalDate.now();

        return dataVerificada.compareTo(hoje) >= 0;
    }

    /**
     *
     * @param data
     * @return Se dataVerificada comparada com hoje é igual hoje então retorna
     * verdadeiro, senão, retorna falso.
     */
    public boolean dateSameToday(String data) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataVerificada = LocalDate.parse(data, dtf);
        //Esse comando pega a data de hoje
        LocalDate hoje = LocalDate.now();

        return dataVerificada.compareTo(hoje) == 0;
    }

}
