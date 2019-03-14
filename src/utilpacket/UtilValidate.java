package utilpacket;

import javax.swing.JTextField;

/**
 *
 * @author Alunos
 */
public class UtilValidate {
    
    public static Boolean isEmpty(JTextField tf){
        return tf.getText().trim().isEmpty();
    }
    
    
}
