package produtodao.principal;

import javax.swing.JFrame;
import produtodao.view.produto.JanelaGerenciaUsuario;

/**
 *
 * @author William
 */
public class PrincipalUsuario {

    public static void main(String[] args) {
        JanelaPrincipal();
    }

    public static void JanelaPrincipal() {
        JanelaGerenciaUsuario painelPrincipal = new JanelaGerenciaUsuario();
        painelPrincipal.setTitle("JANELA PRINCIPAL");
        painelPrincipal.setSize(800, 600);
        painelPrincipal.setLocationRelativeTo(null);
        painelPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        painelPrincipal.setVisible(true);
    }
}
