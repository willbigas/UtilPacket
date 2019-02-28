package br.com.agendatelefonica;

import br.com.agendatelefonica.dominio.Contato;
import br.com.agendatelefonica.negocio.ManterAgendaNegocio;
import br.com.agendatelefonica.view.FrameContato;
import br.com.agendatelefonica.view.FramePrincipal;
import javax.swing.JFrame;

/**
 *
 * @author Alunos
 */
public class AgendaTelefonica {

    private static FramePrincipal frame;

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Contato c = new Contato();
            c.setId(1 + i);
            c.setNome("nome" + i);
            c.setEmail("email" + i + "@" + "servidor" + i + ".com");
            c.setCpf("100.52" + i + ".859.5" + i);
            ManterAgendaNegocio.adicionar(c);
        }

        frame = new FramePrincipal();
        frame.setTitle("Agenda");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void listarContatos() {
        FrameContato panel = new FrameContato();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

}
