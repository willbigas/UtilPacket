package swing;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author William
 */
public class FileChooser {

    public String salvarArquivo(JFrame jframe) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Arquivo Csv - Excel 2007 ou Inferior", "csv");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showSaveDialog(jframe);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String nomeArquivo = chooser.getSelectedFile().getName();
            String enderecoArquivo = chooser.getSelectedFile().getPath();
            return enderecoArquivo;
        }
        return null;
    }
    public String salvarArquivo(JInternalFrame internalFrame) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Arquivo Csv - Excel 2007 ou Inferior", "csv");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showSaveDialog(internalFrame);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String nomeArquivo = chooser.getSelectedFile().getName();
            String enderecoArquivo = chooser.getSelectedFile().getPath();
            return enderecoArquivo;
        }
        return null;
    }
    public String salvarArquivo(JDialog dialog) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Arquivo Csv - Excel 2007 ou Inferior", "csv");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showSaveDialog(dialog);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String nomeArquivo = chooser.getSelectedFile().getName();
            String enderecoArquivo = chooser.getSelectedFile().getPath();
            return enderecoArquivo;
        }
        return null;
    }

    public String abrirArquivo(JFrame jframe) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Arquivo Csv - Excel 2007 ou Inferior", "csv");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(jframe);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String nomeArquivo = chooser.getSelectedFile().getName();
            String enderecoArquivo = chooser.getSelectedFile().getPath();
            return enderecoArquivo;
        }
        return null;

    }
    public String abrirArquivo(JInternalFrame internalFrame) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Arquivo Csv - Excel 2007 ou Inferior", "csv");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(internalFrame);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String nomeArquivo = chooser.getSelectedFile().getName();
            String enderecoArquivo = chooser.getSelectedFile().getPath();
            return enderecoArquivo;
        }
        return null;

    }
    public String abrirArquivo(JDialog dialog) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Arquivo Csv - Excel 2007 ou Inferior", "csv");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(dialog);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String nomeArquivo = chooser.getSelectedFile().getName();
            String enderecoArquivo = chooser.getSelectedFile().getPath();
            return enderecoArquivo;
        }
        return null;

    }
}
