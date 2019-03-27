package swing;

import javax.swing.JTextField;

/**
 * @since Ultima Modificacao - 25/03/2019
 * @author William Bigas Mauro
 *
 */
public class TextField {

    /**
     * Verifica se o Valor do Textfield está vazio.
     *
     * @param tf
     * @return Boolean - True ou False
     */
    public static Boolean isEmpty(JTextField tf) {
        return tf.getText().trim().isEmpty();
    }
    
     /**
     * Limpa o Conteudo do JtextField
     *
     * @param value
     */
    public static void cleanTextField(JTextField value) {
        value.setText(null);
    }

  

}
