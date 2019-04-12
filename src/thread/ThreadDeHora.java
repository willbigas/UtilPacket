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
 * <b>ThreadDeHora horaAtual = new ThreadDeHora();</b>
 *
 * @author William Bigas Mauro
 */
public class ThreadDeHora extends JFrame {

    private JLabel label;

    public ThreadDeHora() {
        setSize(200, 100);
        setTitle("Hora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel();
        label.setFont(new Font("Arial", Font.BOLD, 35));
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label, BorderLayout.CENTER);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Thread(new AtualizadorHora()).start();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ThreadDeHora().setVisible(true);
            }
        });
    }

    private class AtualizadorHora implements Runnable {

        private SimpleDateFormat sdf;

        public AtualizadorHora() {
            sdf = new SimpleDateFormat("HH:mm:ss");
        }

        public void run() {
            while (true) {
                try {
//                    JanelaSaida.tfHoraSaida.setText(sdf.format(new Date())); // Chamar Label ou Textfield
                    Thread.sleep(500);
                } catch (InterruptedException exc) {
                    exc.printStackTrace();
                }
            }
        }
    }
}
