package br.com.poo.daoimpl;

import br.com.poo.conexaobd.implementacao.SessionFactory;
import br.com.poo.dao.DepartamentoDao;
import br.com.poo.dao.TelefoneDao;
import br.com.poo.entidade.Usuario;
import br.com.poo.dao.UsuarioDao;
import br.com.poo.entidade.Departamento;
import br.com.poo.entidade.Telefone;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao {

    private Connection conexao;
    private DepartamentoDao departamentoDao = new DepartamentoDaoImpl();
    private TelefoneDao telefoneDao = new TelefoneDaoImpl();

    @Override
    public boolean inserir(Object obj) throws Exception {
        Usuario usuario = (Usuario) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao
                    .prepareStatement("insert into usuario (nome, nascimento, id_departamento) values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, usuario.getNome());
            statement.setDate(2, new Date(usuario.getNascimento().getTime()));
            if (usuario.getDepartamento() == null) {
                statement.setNull(3, Types.INTEGER);
            } else {
                statement.setInt(3, usuario.getDepartamento().getId());
            }
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Integer idInserido = rs.getInt(1);
                usuario.setId(idInserido);
                gravarTelefones(usuario);
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
                    "update usuario set nome = ?, nascimento = ?, id_departamento = ? where id = ? ");
            statement.setString(1, usuario.getNome());
            statement.setDate(2, new Date(usuario.getNascimento().getTime()));
            if (usuario.getDepartamento() == null) {
                statement.setNull(3, Types.INTEGER);
            } else {
                statement.setInt(3, usuario.getDepartamento().getId());
            }
            statement.setInt(4, usuario.getId());
            int linhasAtualizadas = statement.executeUpdate();
            gravarTelefones(usuario);
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
                Date nascimento = rs.getDate("nascimento");
                Integer idDepartamento = rs.getInt("id_departamento");
                Usuario usuario = new Usuario();
                usuario.setNome(nome);
                usuario.setNascimento(nascimento);
                Departamento d = (Departamento) departamentoDao
                        .pesquisar(idDepartamento);
                usuario.setDepartamento(d);
                usuario.setId(id);
                usuario.setTelefones(telefoneDao.pesquisarTelefoneUsuarios(usuario));
                return usuario;
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
                Usuario usuario = new Usuario();
                usuario.setNome(rs.getString("nome"));
                Integer idDepartamento = rs.getInt("id_departamento");
                usuario.setNascimento(rs.getDate("nascimento"));
                usuario.setDepartamento((Departamento) departamentoDao.pesquisar(idDepartamento));
                usuario.setId(rs.getInt("id"));
                usuarios.add(usuario);
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

    private void gravarTelefones(Usuario usuario) throws Exception {
        telefoneDao.excluirTelefoneUsuarios(usuario.getId());
        if (usuario.getTelefones() != null && !usuario.getTelefones().isEmpty()) {
            for (Telefone telefone : usuario.getTelefones()) {
                telefone.setUsuario(usuario);
                telefoneDao.inserir(telefone);
            }
        }
    }

}
