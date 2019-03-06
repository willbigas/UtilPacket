package produtodao.dao;

import java.sql.Connection;
import produtodao.factory.Conexao;

/**
 *
 * @author William
 */
public class Dao {

    protected Connection conexao;

    public Dao() {
        conexao = Conexao.getConexao();
    }

}
