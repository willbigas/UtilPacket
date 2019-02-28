package sistemaescolar;

import objetos.Disciplina;
import objetos.Professor;
import objetos.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author William
 */
public class Principal {

    public static void main(String[] args) throws Exception {

        List<Double> notas = new ArrayList<>();

        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professors = new ArrayList<>();
        List<Disciplina> disciplinas = new ArrayList<>();

        ManterEscolarNegocio.gerarInterface(alunos, professors, disciplinas);

        ManterEscolarNegocio.imprimirAlunos(alunos);
        ManterEscolarNegocio.imprimirDisciplina(disciplinas);

    }

}
