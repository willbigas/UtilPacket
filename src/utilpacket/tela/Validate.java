package utilpacket.tela;

import javax.swing.JTextField;

/**
 * @since Ultima Modificacao - 25/03/2019
 * @author William Bigas Mauro
 *
 */
public class Validate {

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
     * Verifica se a String está vazia;
     *
     * @param texto
     * @return
     */
    public static Boolean isEmpty(String texto) {
        return texto.isEmpty();
    }

    /**
     * Verifica se o Objeto é nulo
     *
     * @param obj
     * @return
     */
    public static Boolean isNull(Object obj) {
        return obj == null;
    }

}
