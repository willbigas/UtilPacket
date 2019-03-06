package produtodao.control;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import produtodao.dao.ProdutoDao;
import produtodao.model.Produto;

/**
 *
 * @author William
 */
public class ProdutoControl {

    public static ProdutoDao PRODUTO_DAO = new ProdutoDao();

    private JTextField campoData;
    private JTextField campoNome;
    private JTextField campoValor;
    private JTable tabelaProduto;

    public ProdutoControl(JTextField campoData, JTextField campoNome, JTextField campoValor, JTable tabelaProduto) {
        this.campoData = campoData;
        this.campoNome = campoNome;
        this.campoValor = campoValor;
        this.tabelaProduto = tabelaProduto;
    }

    public static void inserindoProduto(JTextField campoNome , JTextField campoValor , JTextField campoData , JTable tabelaProduto ) {
        Produto p = new Produto();
        p.setId(1);
        p.setNome(campoNome.getText());
        p.setValor(Double.valueOf(campoValor.getText()));

        try {
            p.setDataCadastro(produtodao.util.UtilFormat.data(campoData.getText()));
        } catch (Exception exception) {
        }
        if (PRODUTO_DAO.cadastrar(p)) {
            System.out.println("Produto Cadastrado");
            atualizarJtable(tabelaProduto);
        } else {
            System.out.println("Deu ruim!");
        }
    }

    public static void atualizarJtable(JTable tabelaProduto) {
        DefaultTableModel model = (DefaultTableModel) tabelaProduto.getModel();
        model.setNumRows(0);
        ProdutoDao produtoDao = new ProdutoDao();
        for (Produto p : produtoDao.listar()) {
            model.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getValor(),
                p.getDataCadastro()
            });
        }
    }

}
