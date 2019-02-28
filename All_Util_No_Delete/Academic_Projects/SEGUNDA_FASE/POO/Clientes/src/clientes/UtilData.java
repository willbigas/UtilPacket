/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Alunos
 */
public class UtilData {

    public static Date stringToDate(String dataStr) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.parse(dataStr);
    }

    public static String dateToString(Date data) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(data);
    }

}
