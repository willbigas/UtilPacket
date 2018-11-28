package utilpacket;

import javax.swing.UIManager;

/**
 * Utilitarios de Visual Swing para ajustes de implementações especificas!
 *
 * @author WILL
 * @since 28/11/2018
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
