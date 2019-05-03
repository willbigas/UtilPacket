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
    public static boolean dataValida(String data) {
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
    public static java.util.Date dataHora(String dataStr) {
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
    public static String dataHora(java.util.Date data) {
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        return df.format(data);
    }

    /**
     *
     * @param data
     * @return Se dataVerificada comparada com hoje é menor então retorna
     * verdadeiro, senão, retorna falso.
     */
    public boolean menorQueHoje(String data) {
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
    public boolean maiorQueHoje(String data) {
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
    public boolean dataDeHoje(String data) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataVerificada = LocalDate.parse(data, dtf);
        //Esse comando pega a data de hoje
        LocalDate hoje = LocalDate.now();

        return dataVerificada.compareTo(hoje) == 0;
    }
    
    /**
     * Converte uma data vinda no formato do banco de dados
     * @param data
     * @return data no formato dd/MM/yyyy
     */
    public static String deSql(java.sql.Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(data);
    }
    
    /**
    * Converte uma data vinda no formato de string do usuário
    * @param data
    * @return data no formato do banco de dados
    */
    public static java.sql.Date paraSql(String data){
        try {
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date dataUtil = formatador.parse(data);
            return new java.sql.Date(dataUtil.getTime());
        } catch (ParseException ex) {
            System.out.println("Erro ao converter data");
            return null;
        }
        
    }
    
    /**
     * Retorna a data atual convertida em String no formato dd/MM/yyyy
     * @return 
     */
    public static String dataAtual(){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date dataUtil = new java.util.Date();
        return formatador.format(dataUtil);
    }
    

}
