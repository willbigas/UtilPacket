/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilPacket;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author William
 */
public class UtilData {

    
    /**
     * Convertendo String em Data
     * @param dataStr
     * @return Date
     * @throws Exception 
     */
    public static Date StrforDate(String dataStr) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.parse(dataStr);
    }
    
    /**
     * Convertendo  Data em String 
     * @param data
     * @return String
     * @throws Exception 
     */
    public static String dateForString(Date data) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(data);
    }

}
