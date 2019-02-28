package br.com.kahoot.daoimpl;

import br.com.kahoot.SessionFactory;
import br.com.kahoot.dao.UsuarioDao;
import br.com.kahoot.entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class UsuarioDaoImpl implements UsuarioDao{
    
    private Connection conexao;

    @Override
    public boolean inserir(Object obj) throws Exception {
        Usuario usuario = (Usuario) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("insert into usuario (nome, pontos , ip) values (?, ? , ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, usuario.getNome());
            statement.setInt(2, usuario.getPontos());
            statement.setString(3, usuario.getIp());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Integer idInserido = rs.getInt(1);
                usuario.setId(idInserido);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return false;
    }

    @Override
    public boolean update(Object obj) throws Exception {
        Usuario usuario = (Usuario) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "update usuario set nome = ?, pontos = ? , ip = ? where id = ? ");
            statement.setString(1, usuario.getNome());
            statement.setInt(2, usuario.getPontos());
            statement.setString(3, usuario.getIp());
            statement.setInt(4, usuario.getId());
            int linhasAtualizadas = statement.executeUpdate();
            return linhasAtualizadas > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return false;
    }

    @Override
    public Usuario pesquisar(Integer id) throws Exception {
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "select * from usuario where id = ? ");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                Integer pontos = rs.getInt("pontos");
                String ip = rs.getString("ip");
                Usuario user = new Usuario();
                user.setNome(nome);
                user.setPontos(pontos);
                user.setIp(ip);
                user.setId(id);
                return user;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return null;
    }

    @Override
    public List<Object> pesquisarTodos() throws Exception {
        List<Object> usuarios = new ArrayList<>();
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "select * from usuario");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Usuario user = new Usuario();
                user.setNome(rs.getString("nome"));
                user.setPontos(rs.getInt("pontos"));
                user.setIp(rs.getString("ip"));
                user.setId(rs.getInt("id"));
                usuarios.add(user);
            }
            return usuarios;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return usuarios;
    }

    @Override
    public boolean excluir(Integer id) throws Exception {
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "delete from usuario where id = ? ");
            statement.setInt(1, id);
            int executeUpdate = statement.executeUpdate();
            return executeUpdate != 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return false;
    }
    
    
    
}
