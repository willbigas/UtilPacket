package https;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author William
 */
public class Website {
    
    public static void abreWebSiteNoNavegadorPadrao(String endereco) {
        try {
            Desktop desktop = null;
            //Primeiro verificamos se é possível a integração com o desktop
            if (!Desktop.isDesktopSupported()) {
                throw new IllegalStateException("Desktop resources not supported!");
            }
            desktop = Desktop.getDesktop();
            //Agora vemos se é possível disparar o browser default.
            if (!desktop.isSupported(Desktop.Action.BROWSE)) {
                throw new IllegalStateException("No default browser set!");
            }
            URI uri = new URI(endereco);
            desktop.browse(uri);
            //Dispara o browser default, que pode ser o Explorer, Firefox ou outro.
        } catch (IllegalStateException illegalStateException) {
        } catch (URISyntaxException uRISyntaxException) {
        } catch (IOException iOException) {
        }
    }
}
