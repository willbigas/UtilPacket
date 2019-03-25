package utilpacket.tela;

import javax.swing.JTextField;

/**
 *
 * @author Alunos
 */
public class Validate {
    
    public static Boolean isEmpty(JTextField tf){
        return tf.getText().trim().isEmpty();
    }
    
    
}
