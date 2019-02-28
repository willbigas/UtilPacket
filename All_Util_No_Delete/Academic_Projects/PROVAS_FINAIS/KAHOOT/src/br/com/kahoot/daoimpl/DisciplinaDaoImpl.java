package br.com.kahoot.daoimpl;

import br.com.kahoot.SessionFactory;
import br.com.kahoot.dao.DisciplinaDao;
import br.com.kahoot.entidade.Disciplina;
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
public class DisciplinaDaoImpl implements DisciplinaDao{
    
    private Connection conexao;

    @Override
    public boolean inserir(Object obj) throws Exception {
        Disciplina disciplina = (Disciplina) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("insert into disciplina (nome, professor) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, disciplina.getNome());
            statement.setString(2, disciplina.getProfessor());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Integer idInserido = rs.getInt(1);
                disciplina.setId(idInserido);
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
        Disciplina disciplina = (Disciplina) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "update disciplina set nome = ?, professor = ? where id = ? ");
            statement.setString(1, disciplina.getNome());
            statement.setString(2, disciplina.getProfessor());
            statement.setInt(3, disciplina.getId());
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
    public Disciplina pesquisar(Integer id) throws Exception {
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "select * from disciplina where id = ? ");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                String professor = rs.getString("professor");
                Disciplina disciplina = new Disciplina();
                disciplina.setNome(nome);
                disciplina.setProfessor(professor);
                disciplina.setId(id);
                return disciplina;
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
        List<Object> disciplinas = new ArrayList<>();
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "select * from disciplina");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Disciplina disciplina = new Disciplina();
                disciplina.setNome(rs.getString("nome"));
                disciplina.setProfessor(rs.getString("professor"));
                disciplina.setId(rs.getInt("id"));
                disciplinas.add(disciplina);
            }
            return disciplinas;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return disciplinas;
    }

    @Override
    public boolean excluir(Integer id) throws Exception {
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "delete from disciplina where id = ? ");
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
