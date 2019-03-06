package basedao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author William
 */
public class Conexao {

    private final static String URL = "jdbc:mysql://localhost:3306/planta";
    private final static String USER = "root";
    private final static String PASS = "";
    private static Connection conexao;

    public static Connection getConexao() {
        if (conexao == null) {

            try {
                conexao = DriverManager.getConnection(URL, USER, PASS);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Conectou...");
        }
        return conexao;
    }

}
