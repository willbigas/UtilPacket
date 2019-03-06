package basedao.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import basedao.interfaces.DaoI;
import basedao.model.Usuario;

/**
 *
 * @author William
 */
public class UsuarioDao extends Dao implements DaoI<Usuario> {

    public UsuarioDao() {
        super();
    }

    @Override
    public List<Usuario> listar() {
        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement("SELECT id , nome , email, senha , nivel  from usuarios");
            ResultSet result = stmt.executeQuery();
            List<Usuario> listUsuario = new ArrayList<>();
            while (result.next()) {
                Usuario user = new Usuario();
                user.setId(result.getInt("id"));
                user.setNome(result.getString("nome"));
                user.setEmail(result.getString("email"));
                user.setSenha(result.getString("senha"));
                user.setNivel(result.getInt("nivel"));
                listUsuario.add(user);

            }
            return listUsuario;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean cadastrar(Usuario obj) {
        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement("INSERT INTO usuarios (nome, email, senha , nivel) VALUES (? , ? , ? , ?)");
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getEmail());
            stmt.setString(3, obj.getSenha());
            stmt.setInt(4, obj.getNivel());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean alterar(Usuario obj) {
        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement("UPDATE usuarios SET nome=? , email =? , senha =? , nivel = ? where id=?");
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getEmail());
            stmt.setString(3, obj.getSenha());
            stmt.setInt(4, obj.getNivel());
            stmt.setInt(5, obj.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean deletar(Usuario obj) {

        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement("DELETE FROM usuarios where id=?");
            stmt.setInt(1, obj.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Usuario buscaPorId(int id) {
        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement("SELECT id , nome  , email , senha, nivel from usuarios where id=?");
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            Usuario user = null;
            if (result.next()) {
                user = new Usuario();
                user.setId(result.getInt("id"));
                user.setNome(result.getString("nome"));
                user.setEmail(result.getString("email"));
                user.setSenha(result.getString("senha"));
                user.setNivel(result.getInt("nivel"));

            }
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

}
