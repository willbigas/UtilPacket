package basedao.dao;

import java.sql.Connection;
import basedao.factory.Conexao;

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
