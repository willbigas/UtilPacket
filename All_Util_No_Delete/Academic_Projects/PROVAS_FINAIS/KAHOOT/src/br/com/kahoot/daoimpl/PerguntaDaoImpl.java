package br.com.kahoot.daoimpl;

import br.com.kahoot.SessionFactory;
import br.com.kahoot.dao.AssuntoDao;
import br.com.kahoot.dao.PerguntaDao;
import br.com.kahoot.dao.RespostaDao;
import br.com.kahoot.entidade.Assunto;
import br.com.kahoot.entidade.Pergunta;
import br.com.kahoot.entidade.Resposta;
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
public class PerguntaDaoImpl implements PerguntaDao {

    private Connection conexao;
    private static AssuntoDao assuntoDao = new AssuntoDaoImpl();
    private static PerguntaDao perguntaDao = new PerguntaDaoImpl();
    private static RespostaDao respostaDao = new RespostaDaoImpl();

    @Override
    public boolean inserir(Object obj) throws Exception {
        Pergunta pergunta = (Pergunta) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("insert into pergunta (pergunta, tempo , id_Assunto) values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, pergunta.getPergunta());
            statement.setInt(2, pergunta.getTempo());
            statement.setInt(3, pergunta.getAssunto().getId());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Integer idInserido = rs.getInt(1);
                pergunta.setId(idInserido);
                gravarRespostas(pergunta);
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
        Pergunta pergunta = (Pergunta) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "update pergunta set pergunta = ?, tempo = ? , id_Assunto = ? where id = ? ");
            statement.setString(1, pergunta.getPergunta());
            statement.setInt(2, pergunta.getTempo());
            statement.setInt(3, pergunta.getAssunto().getId());
            statement.setInt(4, pergunta.getId());
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
    public Pergunta pesquisar(Integer id) throws Exception {
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "select * from pergunta where id = ? ");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String perguntaRecebida = rs.getString("pergunta");
                Integer tempo = rs.getInt("tempo");
                Integer idAssunto = rs.getInt("id_Assunto");
                Pergunta pergunta = new Pergunta();
                pergunta.setPergunta(perguntaRecebida);
                pergunta.setTempo(tempo);
                pergunta.setAssunto((Assunto) assuntoDao.pesquisar(idAssunto));
                pergunta.setId(id);
                return pergunta;
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
        List<Object> perguntas = new ArrayList<>();
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "select * from pergunta");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Pergunta pergunta = new Pergunta();
                Integer idAssunto = rs.getInt("id_Assunto");
                pergunta.setPergunta(rs.getString("pergunta"));
                pergunta.setTempo(rs.getInt("tempo"));
                pergunta.setAssunto((Assunto) assuntoDao.pesquisar(idAssunto));
                pergunta.setId(rs.getInt("id"));
                perguntas.add(pergunta);
            }
            return perguntas;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return perguntas;
    }

    @Override
    public boolean excluir(Integer id) throws Exception {
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "delete from pergunta where id = ? ");
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

    public void gravarRespostas(Pergunta pergunta) throws Exception {
        respostaDao.excluirRespostasPergunta(pergunta.getId());
        if (pergunta.getRespostas() != null && !pergunta.getRespostas().isEmpty()) {
            for (Resposta resposta : pergunta.getRespostas()) {
                resposta.setPergunta(pergunta);
                respostaDao.inserir(resposta);
            }
        }
    }

}
