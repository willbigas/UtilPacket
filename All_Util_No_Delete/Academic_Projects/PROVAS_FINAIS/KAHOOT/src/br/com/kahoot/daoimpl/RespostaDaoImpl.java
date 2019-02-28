package br.com.kahoot.daoimpl;

import br.com.kahoot.SessionFactory;
import br.com.kahoot.dao.PerguntaDao;
import br.com.kahoot.dao.RespostaDao;
import br.com.kahoot.entidade.Pergunta;
import br.com.kahoot.entidade.Resposta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class RespostaDaoImpl implements RespostaDao {

    PerguntaDao perguntaDao = new PerguntaDaoImpl();

    private Connection conexao;

    @Override
    public boolean inserir(Object obj) throws Exception {
        Resposta resposta = (Resposta) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("insert into resposta (resposta, correta, id_pergunta) values (?, ? , ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, resposta.getResposta());
            statement.setBoolean(2, resposta.getCorreta());
            if (resposta.getPergunta() == null) {
                statement.setNull(3, Types.INTEGER);
            } else {
                statement.setInt(3, resposta.getPergunta().getId());
            }
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Integer idInserido = rs.getInt(1);
                resposta.setId(idInserido);
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
        Resposta resposta = (Resposta) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "update resposta set resposta = ?, correta = ? , set id_pergunta = ? where id = ? ");
            statement.setString(1, resposta.getResposta());
            statement.setBoolean(2, resposta.getCorreta());
            statement.setInt(3, resposta.getPergunta().getId());
            statement.setInt(4, resposta.getId());
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
    public Resposta pesquisar(Integer id) throws Exception {
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "select * from resposta where id = ? ");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String resposta = rs.getString("resposta");
                Boolean correta = rs.getBoolean("correta");
                Integer idPergunta = rs.getInt("id_pergunta");
                Resposta resp = new Resposta();
                resp.setResposta(resposta);
                resp.setCorreta(correta);
                resp.setPergunta((Pergunta) perguntaDao.pesquisar(idPergunta));
                resp.setId(id);
                return resp;
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
        List<Object> respostas = new ArrayList<>();
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "select * from resposta");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Resposta rsp = new Resposta();
                Integer perguntaId = rs.getInt("id_pergunta");
                rsp.setResposta(rs.getString("resposta"));
                rsp.setCorreta(rs.getBoolean("correta"));
                rsp.setPergunta((Pergunta) perguntaDao.pesquisar(perguntaId));
                rsp.setId(rs.getInt("id"));
                respostas.add(rsp);
            }
            return respostas;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return respostas;
    }

    @Override
    public boolean excluir(Integer id) throws Exception {
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "delete from resposta where id = ? ");
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

    @Override
    public List<Resposta> pesquisaRespostaPerguntas(Pergunta pergunta) throws Exception {
        List<Resposta> respostas = new ArrayList<>();
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "select * from resposta where id_pergunta = ?");
            statement.setInt(1, pergunta.getId());
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String respostaRecebida = rs.getString("resposta");
                Boolean correta = rs.getBoolean("correta");
                Integer idPergunta = rs.getInt("id_pergunta");
                Resposta resposta = new Resposta();
                resposta.setPergunta(pergunta);
                resposta.setCorreta(correta);
                resposta.setResposta(respostaRecebida);
                resposta.setId(idPergunta);
                respostas.add(resposta);
            }
            return respostas;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return respostas;
    }

    @Override
    public boolean excluirRespostasPergunta(Integer id) throws Exception {
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "delete from resposta where id_pergunta = ? ");
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
