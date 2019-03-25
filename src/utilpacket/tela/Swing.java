package utilpacket.tela;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * Utilitarios de Visual Swing para ajustes de implementações especificas!
 *
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
    public static void msg(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    public static void msgWarning(String texto) {

    }

}
