package basedao.principal;

import javax.swing.JFrame;
import basedao.view.produto.JanelaGerenciarProduto;

/**
 *
 * @author William
 */
public class PrincipalProduto {

    public static void main(String[] args) {
        JanelaPrincipal();
    }

    public static void JanelaPrincipal() {
        JanelaGerenciarProduto painelPrincipal = new JanelaGerenciarProduto();
        painelPrincipal.setTitle("JANELA PRINCIPAL");
        painelPrincipal.setSize(800, 600);
        painelPrincipal.setLocationRelativeTo(null);
        painelPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        painelPrincipal.setVisible(true);
    }
}
