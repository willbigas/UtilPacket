/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 *
 * @author William
 */
public class Exception {

    public static String converterException(Throwable thr) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        thr.printStackTrace(pw);
        return sw.toString();
    }

}
