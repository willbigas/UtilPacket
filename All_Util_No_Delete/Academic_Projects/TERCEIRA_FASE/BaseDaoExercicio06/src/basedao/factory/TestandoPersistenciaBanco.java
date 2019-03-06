package basedao.factory;

import java.util.List;
import basedao.dao.ProdutoDao;
import basedao.model.Produto;

/**
 *
 * @author William
 */
public class TestandoPersistenciaBanco {

    public static void main(String[] args) {
        ProdutoDao PRODUTO_DAO = new ProdutoDao();

//        Produto p = new Produto();
//        p.setId(3);
//        p.setNome("AAAAAA - 22222");
//        p.setValor(15.8);
//        p.setDataCadastro(new Date());
//        PRODUTO_DAO.cadastrar(p);

        List<Produto> PRODUTOS = PRODUTO_DAO.listar();
        System.out.println(PRODUTOS);

    }
}
