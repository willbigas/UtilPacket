package utilpacket.tela;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * Utilitarios de Visual Swing para ajustes de implementações especificas!
 * @deprecated - Falta documentar os novos metodos.
 * @author WILL
 * @since 28/11/2018
 */
public class Swing {

    /**
     * Mudando o visual das janelas para padrão windows.
     *
     * @throws Exception
     */
    public static void mudandoVisualDasJanelasParaWindows() throws Exception {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

    }

    /**
     * Metodo que mostra uma Mensagem de ShowMessage do Swing!
     *
     * @param texto
     */
    public static void msgInfo(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Informação!", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void msgWarning(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Atenção!", JOptionPane.WARNING_MESSAGE);
    }

    public static void msgPlain(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Mensagem!", JOptionPane.PLAIN_MESSAGE);
    }

    public static void msgQuestion(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Atenção!", JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * Metodo que mostra uma Mensagem de ConfirmDialog do Swing!
     *
     * @param pergunta
     * @return 0 -
     */
    public static int msgConfirm(String pergunta) {
        return JOptionPane.showConfirmDialog(null, pergunta, "Pergunta", JOptionPane.YES_OPTION);
    }

    /**
     * Metodo que mostra uma Mensagem de ConfirmDialog do Swing!
     *
     * @param pergunta
     * @return 0 -
     */
    public static int msgConfirmWithCancel(String pergunta) {
        return JOptionPane.showConfirmDialog(null, pergunta, "Pergunta", JOptionPane.YES_NO_CANCEL_OPTION);
    }

    /**
     * Metodo que recebe qualquer coisa via InputDialog
     *
     * @return
     */
    public static Object input() {
        Object value = null;
        return JOptionPane.showInputDialog(value);
    }

}
