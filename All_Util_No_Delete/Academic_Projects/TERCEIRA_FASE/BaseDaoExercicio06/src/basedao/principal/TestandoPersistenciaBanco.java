package basedao.principal;

import basedao.dao.ProdutoDao;
import basedao.dao.UsuarioDao;
import basedao.model.Usuario;

/**
 *
 * @author William
 */
public class TestandoPersistenciaBanco {

    public static void main(String[] args) {
        ProdutoDao PRODUTO_DAO = new ProdutoDao();
        UsuarioDao USUARIO_DAO = new UsuarioDao();

//        Usuario user = new Usuario();
//        user.setId(2);
//        user.setNome("Nome de Usuario 2");
//        user.setSenha("teste de senha alterada");
//        user.setEmail("Williambmauro@hotmail.com");
//        user.setNivel(1);
        Usuario user = USUARIO_DAO.buscaPorId(2);
        System.out.println(user);
    }
}
