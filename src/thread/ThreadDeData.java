package thread;

import java.awt.BorderLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 * Classe que invoca uma Thread de Data atual - Util para mostrar numa tela.
 * (Relogio Dinamico) Para invocar este Metodo - deve se usar
 * <b>ThreadDeData dataAtual = new ThreadDeData();</b>
 *
 * @author William Bigas Mauro
 */
public class ThreadDeData extends JFrame {

    private JLabel label;

    /**
     *
     */
    public ThreadDeData() {
        setSize(200, 100);
        setTitle("Hora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel();
        label.setFont(new Font("Arial", Font.BOLD, 35));
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label, BorderLayout.CENTER);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Thread(new AtualizadorData()).start();
            }
        });
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ThreadDeData().setVisible(true);
            }
        });
    }

    private class AtualizadorData implements Runnable {

        private SimpleDateFormat sdf;

        public AtualizadorData() {
            sdf = new SimpleDateFormat("dd/MM/yyyy");
        }

        public void run() {
            while (true) {
                try {
//                    JanelaSaida.tfDataSaida.setText(sdf.format(new Date())); // chamar a Label ou Button
                    Thread.sleep(500);
                } catch (InterruptedException exc) {
                    exc.printStackTrace();
                }
            }
        }
    }
}
