package br.com.kahoot;

import br.com.kahoot.dao.AssuntoDao;
import br.com.kahoot.dao.DisciplinaDao;
import br.com.kahoot.dao.PerguntaDao;
import br.com.kahoot.dao.RespostaDao;
import br.com.kahoot.dao.UsuarioDao;
import br.com.kahoot.daoimpl.AssuntoDaoImpl;
import br.com.kahoot.daoimpl.DisciplinaDaoImpl;
import br.com.kahoot.daoimpl.PerguntaDaoImpl;
import br.com.kahoot.daoimpl.RespostaDaoImpl;
import br.com.kahoot.daoimpl.UsuarioDaoImpl;
import br.com.kahoot.entidade.Assunto;
import br.com.kahoot.entidade.Disciplina;
import br.com.kahoot.entidade.Pergunta;
import br.com.kahoot.entidade.Resposta;
import br.com.kahoot.entidade.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class TestandoPersistenciaBanco {

    private static UsuarioDao usuarioDao = new UsuarioDaoImpl();
    private static PerguntaDao perguntaDao = new PerguntaDaoImpl();
    private static RespostaDao respostaDao = new RespostaDaoImpl();
    private static DisciplinaDao disciplinaDao = new DisciplinaDaoImpl();
    private static AssuntoDao assuntoDao = new AssuntoDaoImpl();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Usuario userTeste = new Usuario();
        Disciplina discTeste = new Disciplina();
        Assunto assuntoTeste = new Assunto();
        Pergunta perguntaTeste = new Pergunta();

////        userTeste.setId(1);
////        userTeste.setIp("192.168.0.105");
////        userTeste.setNome("ADJ");
////        userTeste.setPontos(25);
////        usuarioDao.inserir(userTeste);
//
//         List<?> obj = usuarioDao.pesquisarTodos();
//         List<Usuario> user = (List<Usuario>) (Object) obj;
//         for (int i = 0; i < user.size(); i++) {
//            Usuario get = user.get(i);
//             System.out.println(get.getNome());
//        }
//
//        discTeste.setId(1);
//        discTeste.setNome("SGBD");
//        discTeste.setProfessor("Wendel");
//        disciplinaDao.inserir(discTeste);
//        List<?> TYPES =  disciplinaDao.pesquisarTodos();
//        List<Disciplina> DISCIPLINAS = (List<Disciplina>) (Object) TYPES;
//        for (int i = 0; i < DISCIPLINAS.size(); i++) {
//            Disciplina get = DISCIPLINAS.get(i);
//            System.out.println(get.getNome());
//        }
//    assuntoTeste.setNome("Banco de dados");
//    assuntoTeste.setDisciplina((Disciplina) disciplinaDao.pesquisar(1));
//    assuntoTeste.setId(1);
//    assuntoDao.inserir(assuntoTeste);
//        List<?> obj = assuntoDao.pesquisarTodos();
//        List<Assunto> assuntoTeste2 = (List<Assunto>)(Object) obj;
//        for (int i = 0; i < assuntoTeste2.size(); i++) {
//            Assunto get = assuntoTeste2.get(i);
//            System.out.println(get.getNome());
//        }

       

        Resposta rsp1 = new Resposta();
        rsp1.setId(1);
        rsp1.setCorreta(true);
        rsp1.setResposta("Resposta A");
////        respostaDao.inserir(rsp1);
//        
         Resposta rsp2 = new Resposta();
        rsp2.setId(2);
        rsp2.setCorreta(false);
        rsp2.setResposta("Resposta B");
////        respostaDao.inserir(rsp2);
//        
        List<Resposta> RESPOSTAS =  new ArrayList<>();
        RESPOSTAS.add(rsp1);
        RESPOSTAS.add(rsp2);
//        
        perguntaTeste.setAssunto((Assunto) assuntoDao.pesquisar(1));
        perguntaTeste.setId(2);
        perguntaTeste.setPergunta("Quanto é A + B");
        perguntaTeste.setRespostas(RESPOSTAS);
        perguntaTeste.setTempo(50);
        perguntaDao.inserir(perguntaTeste);

//       
//        List<?> teste =  perguntaDao.pesquisarTodos();
//        List<Pergunta> PERGUNTAS = (List<Pergunta>)(Object) teste;
//        for (int i = 0; i < PERGUNTAS.size(); i++) {
//            Pergunta get = PERGUNTAS.get(i);
//            System.out.println(get.getPergunta());
//        }
        
        

    }

}
