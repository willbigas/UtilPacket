package basedao.principal;

import basedao.dao.ProdutoDao;
import basedao.dao.UsuarioDao;
import basedao.model.Produto;
import basedao.model.Usuario;
import java.util.List;

/**
 *
 * @author William
 */
public class TestandoPersistenciaBanco {

    public static void main(String[] args) {
        ProdutoDao PRODUTO_DAO = new ProdutoDao();
        UsuarioDao USUARIO_DAO = new UsuarioDao();

        List<Produto> teste = PRODUTO_DAO.buscarPorTermo("y");
        System.out.println(teste);
    }
}
