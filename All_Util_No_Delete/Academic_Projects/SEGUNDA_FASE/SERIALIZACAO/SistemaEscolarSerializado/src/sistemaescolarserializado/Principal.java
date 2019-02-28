package sistemaescolarserializado;

import objetos.Pessoa;
import objetos.Funcionario;
import objetos.Aluno;
import objetos.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Principal {
    /**
     * Gerando Lista de Objetos
     */
    public static List<Pessoa> PESSOAS = new ArrayList<>();
    public static List<Aluno> ALUNOS = new ArrayList<>();
    public static List<Professor> PROFESSORS = new ArrayList<>();
    public static List<Funcionario> FUNCIONARIOS = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        List<Integer> r = UtilPacket.UtilList.numRandom(0, 2, 20);

        ManterEscolarNegocio.adicionarPessoas(r, ALUNOS, PROFESSORS, FUNCIONARIOS);
        ManterEscolarNegocio.adicionarPessoasALista(PESSOAS, ALUNOS, PROFESSORS, FUNCIONARIOS);

        UtilPacket.UtilSerializar.escreverSerializando("endidades.poo", PESSOAS);

        List<Pessoa> PESSOASLIDAS = UtilPacket.UtilSerializar.lerSerializando("endidades.poo", PESSOAS);

        Integer qtdAluno = 0;
        Integer qtdProfessor = 0;
        Integer qtdFuncionario = 0;

        for (int i = 0; i < PESSOASLIDAS.size(); i++) {

            System.out.println(PESSOASLIDAS.get(i));
            qtdAluno = ManterEscolarNegocio.verificandoAluno(PESSOASLIDAS, i, qtdAluno);
            qtdProfessor = ManterEscolarNegocio.verificandoProfessor(PESSOASLIDAS, i, qtdProfessor);
            qtdFuncionario = ManterEscolarNegocio.verificandoFuncionario(PESSOASLIDAS, i, qtdFuncionario);

        }

        ManterEscolarNegocio.imprimindoQuantidade(qtdAluno, qtdProfessor, qtdFuncionario);

    }

    

    

}
