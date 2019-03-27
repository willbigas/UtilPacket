package swing;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * LookAndFeel VisualApplication - Utilitarios
 *
 * @author William
 * @since 27/03/2019
 */
public class VisualApplication {

    /**
     * Muda o visual das janelas para Interface que o Sistema executar por
     * Padrão.
     * Se o sistema operacional for windows , a aplicação executará em
     * interface windows.
     *
     * @throws Exception
     */
    public static void changeVisualWindowForDefaultSystem() throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

    }

    /**
     * Muda o visual da Janela para Interface a escolhida.
     * <b>Metal</b><br>
     * <b>Nimbus</b><br>
     * <b>CDE/Motif</b><br>
     * <b>Windows</b><br>
     * <b>Windows Classic</b>
     *
     * @param nomeVisual - Recebe como Parametro uma String (Digitar
     * Corretamente)
     */
    public static void changeViewWindow(String nomeVisual) {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if (nomeVisual.equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(VisualApplication.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(VisualApplication.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(VisualApplication.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(VisualApplication.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    /**
     * Imprime os Look Anf Feel Default instalados no JDK.
     */
    public static void printVisualDefaultInstalled() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            System.out.println(info.getName());
        }
    }

}
