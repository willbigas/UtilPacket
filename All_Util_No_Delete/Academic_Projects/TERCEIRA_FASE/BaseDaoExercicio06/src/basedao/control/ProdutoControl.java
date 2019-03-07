package basedao.control;

import javax.swing.table.DefaultTableModel;
import basedao.dao.ProdutoDao;
import basedao.model.Produto;
import basedao.view.produto.JanelaGerenciarProduto;

/**
 *
 * @author William
 */
public class ProdutoControl {

    public static ProdutoDao PRODUTO_DAO = new ProdutoDao();

   

    public ProdutoControl() {
        
    }

    public static void inserirProdutoAction() {
        Produto p = new Produto();
        p.setId(1);
        p.setNome(JanelaGerenciarProduto.campoNome.getText());
        p.setValor(Double.valueOf(JanelaGerenciarProduto.campoValor.getText()));

        try {
            p.setDataCadastro(basedao.util.UtilFormat.data(JanelaGerenciarProduto.campoData.getText()));
        } catch (Exception exception) {
        }
        if (PRODUTO_DAO.cadastrar(p)) {
            System.out.println("Produto Cadastrado");
            listarAction();
        } else {
            System.out.println("Deu ruim!");
        }
    }

    public static void listarAction() {
        DefaultTableModel model = (DefaultTableModel) JanelaGerenciarProduto.tabelaProduto.getModel();
        model.setNumRows(0);
        for (Produto p : PRODUTO_DAO.listar()) {
            model.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getValor(),
                p.getDataCadastro()
            });
        }
    }

}
