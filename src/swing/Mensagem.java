package swing;

import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Mensagem {

    /**
     * Mensagem de Informação do Swing
     *
     * @param texto
     */
    public static void info(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Informação!", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Mensagem de Erro do Swing
     *
     * @param texto
     */
    public static void erro(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Erro!", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Mensagem de Atenção do Swing
     *
     * @param texto
     */
    public static void atencao(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Atenção!", JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Mensagem Questão do Swing
     *
     * @param texto
     */
    public static void pergunta(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Pergunta!", JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * Mensagem Vazia do Swing
     *
     * @param texto
     */
    public static void simples(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Mensagem!", JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Metodo que mostra uma Mensagem de ConfirmDialog do Swing!
     *
     * @param pergunta
     * @return 0 - Yes Option , 1 - No Option
     */
    public static int confirmacao(String pergunta) {
        return JOptionPane.showConfirmDialog(null, pergunta, "Pergunta", JOptionPane.YES_OPTION);
    }

    /**
     * Metodo que mostra uma Mensagem de ConfirmDialog do Swing!
     *
     * @param pergunta
     * @return 0 - Yes Option , 1 - No Option , 2 - Cancel Option
     */
    public static int confirmacaoComCancelar(String pergunta) {
        return JOptionPane.showConfirmDialog(null, pergunta, "Pergunta", JOptionPane.YES_NO_CANCEL_OPTION);
    }

    /**
     * Metodo que recebe qualquer coisa via InputDialog
     *
     * @param value
     * @return
     */
    public static String entrada(Object value) {
        return JOptionPane.showInputDialog(value);
    }
}
