package swing;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * LookAndFeel InterfaceJanela - Utilitarios
 *
 * @author William
 * @since 27/03/2019
 */
public class InterfaceJanela {

    /**
     * Muda o visual das janelas para Interface que o Sistema executar por
     * Padrão. Se o sistema operacional for windows , a aplicação executará em
     * interface windows.
     *
     * @throws Exception
     */
    public static void mudaInterfaceSwingParaPadrao() throws Exception {
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
    public static void mudaInterfaceSwing(String nomeVisual) {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if (nomeVisual.equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(InterfaceJanela.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(InterfaceJanela.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(InterfaceJanela.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(InterfaceJanela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    /**
     * Imprime os Look Anf Feel Default instalados no JDK.
     */
    public static void imprimeVisualSwingInstalado() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            System.out.println(info.getName());
        }
    }

    /**
     * Editar o Icone do JFrame - Necessário indicar a Janela e o Endereco de
     * Arquivo
     * <b>Atenção - Necessário ter uma imagem no projeto para chamar o
     * enderecoArq</b>
     *
     * @param jframe -- Janela de Jframe a ser modificada
     * @param enderecoArq - Ex : /prova/img/icon_product_16x16.png
     */
    public static void alteraIconePrincipalDoFrame(JFrame jframe, String enderecoArq) {
        URL url;
        url = jframe.getClass().getResource(enderecoArq);
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        jframe.setIconImage(imagemTitulo);
    }

}
