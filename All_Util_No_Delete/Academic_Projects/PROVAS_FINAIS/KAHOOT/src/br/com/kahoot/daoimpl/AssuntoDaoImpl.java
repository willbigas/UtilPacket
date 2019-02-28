package br.com.kahoot.daoimpl;

import br.com.kahoot.SessionFactory;
import br.com.kahoot.dao.AssuntoDao;
import br.com.kahoot.dao.DisciplinaDao;
import br.com.kahoot.entidade.Assunto;
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
public class AssuntoDaoImpl implements AssuntoDao{
    
    
    private Connection conexao;

    @Override
    public boolean inserir(Object obj) throws Exception {
        Assunto assunto = (Assunto) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("insert into assunto (nome, id_disciplina) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, assunto.getNome());
            statement.setInt(2, assunto.getDisciplina().getId());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Integer idInserido = rs.getInt(1);
                assunto.setId(idInserido);
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
        Assunto assunto = (Assunto) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "update assunto set nome = ?, id_disciplina = ? where id = ? ");
            statement.setString(1, assunto.getNome());
            statement.setInt(2, assunto.getDisciplina().getId());
            statement.setInt(3, assunto.getId());
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
    public Assunto pesquisar(Integer id) throws Exception {
       DisciplinaDao disciplinaDao = new DisciplinaDaoImpl();
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "select * from assunto where id = ? ");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                Integer idDisciplina = rs.getInt("id_disciplina");
                Assunto assunto = new Assunto();
                assunto.setNome(nome);
                assunto.setId(id);
                assunto.setDisciplina((Disciplina) disciplinaDao.pesquisar(idDisciplina));
                return assunto;
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
        DisciplinaDao disciplinaDao = new DisciplinaDaoImpl();
        List<Object> assuntos = new ArrayList<>();
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "select * from assunto");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Assunto assunto = new Assunto();
                
                assunto.setNome(rs.getString("nome"));
                assunto.setId(rs.getInt("id"));
                Integer idDisciplina = rs.getInt("id_disciplina");
                assunto.setDisciplina((Disciplina) disciplinaDao.pesquisar(idDisciplina));
                assuntos.add(assunto);
            }
            return assuntos;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return assuntos;
    }

    @Override
    public boolean excluir(Integer id) throws Exception {
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "delete from assunto where id = ?");
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
