package desktop;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class PdfReader {

    /**
     *
     * @param endereco
     */
    public void abrirArquivoPdf(String endereco) {
        // TODO add your handling code here:
        try {
            File arquivo = new File(getClass().getResource(endereco).getFile());
            Desktop.getDesktop().open(arquivo);
        } catch (IOException iOException) {
            JOptionPane.showMessageDialog(null, "Impossivel acessar os Recursos de Desktop!");
        }
    }

}
