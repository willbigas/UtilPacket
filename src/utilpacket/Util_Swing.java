package utilpacket;

import javax.swing.UIManager;

/**
 *
 * @author WILL
 */
public class Util_Swing {

    /**
     * Mudando o visual das janelas para padrão windows.
     *
     * @throws Exception
     */
    public void mudandoVisualDasJanelasParaWindows() throws Exception {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

    }

}
