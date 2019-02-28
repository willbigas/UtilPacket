package br.com.kahoot.dao;

import br.com.kahoot.entidade.Pergunta;
import br.com.kahoot.entidade.Resposta;
import java.util.List;

/**
 *
 * @author Alunos
 */
public interface RespostaDao extends BaseDao {

    public List<Resposta> pesquisaRespostaPerguntas(Pergunta pergunta) throws Exception;

    public boolean excluirRespostasPergunta(Integer id) throws Exception;

}
