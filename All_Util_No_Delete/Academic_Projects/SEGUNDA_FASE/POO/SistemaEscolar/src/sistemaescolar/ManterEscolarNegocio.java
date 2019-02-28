package sistemaescolar;

import objetos.Aluno;
import objetos.Professor;
import objetos.Disciplina;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class ManterEscolarNegocio {

    public static Disciplina criarDisciplina(String nome, String descricao, Professor professor, List<Aluno> alunos) {
        Disciplina disciplina = new Disciplina(nome, descricao, professor, alunos);
        return disciplina;
    }

    public static Professor criarProfessor(String nome, String cpf, String pis) {
        Professor professor = new Professor(nome, cpf, pis);
        return professor;
    }

    public static Aluno criarAluno(String nome, Integer matricula, Date nascimento, List<Double> notas) {
        Aluno aluno = new Aluno(nome, matricula, nascimento, notas);
        return aluno;
    }

    public static List<Double> criarNotasAluno(Double nota1, Double nota2, Double nota3) {
        List<Double> notaAluno = new ArrayList<>();
        notaAluno.add(nota1);
        notaAluno.add(nota2);
        notaAluno.add(nota3);
        return notaAluno;
    }
    
    public static void gerarDisciplina(List<Disciplina> disciplinas, List<Professor> professors, List<Aluno> alunos) throws HeadlessException {
        // DISCIPLINA //
        String nomeDisc = JOptionPane.showInputDialog("Nome da disciplina");
        String descrDisc = JOptionPane.showInputDialog("Descr da disciplina");
        
        disciplinas.add(ManterEscolarNegocio.criarDisciplina(nomeDisc, descrDisc, professors.get(0), alunos));
    }

    public static void gerarProfessor(List<Professor> professors) throws HeadlessException {
        // PROFESSOR //
        String msgProf = JOptionPane.showInputDialog("Digite o Professor : nome,cpf,pis");
        String dadosProf[] = msgProf.split(",");
        String nomeProf = dadosProf[0];
        String cpfProf = dadosProf[1];
        String pisProf = dadosProf[2];
        
        professors.add(ManterEscolarNegocio.criarProfessor(nomeProf, cpfProf, pisProf));
    }

    public static void gerarNotas(List<Aluno> alunos) throws Exception, HeadlessException, NumberFormatException {
        List<Double> notas;
        // ALUNOS //
        String msgAluno1 = JOptionPane.showInputDialog("Digite Nome,Matricula,Nascimento-DD/MM/AAAA-");
        String aluno1[] = msgAluno1.split(",");
        String nomeAluno = aluno1[0];
        String matricula = aluno1[1];
        String nascimento = aluno1[2];
        String msgNotas = JOptionPane.showInputDialog("Digite : nota1,nota2,nota3");
        String notasAluno[] = msgNotas.split(",");
        String msg1 = notasAluno[0];
        Double nota1 = Double.valueOf(msg1);
        String msg2 = notasAluno[1];
        Double nota2 = Double.valueOf(msg2);
        String msg3 = notasAluno[2];
        Double nota3 = Double.valueOf(msg3);
        notas = ManterEscolarNegocio.criarNotasAluno(nota1, nota2, nota3);
        alunos.add(ManterEscolarNegocio.criarAluno(nomeAluno, Integer.valueOf(matricula), UtilPacket.UtilFormat.data(nascimento), notas));
    }
    
    public static void gerarInterface(List<Aluno> alunos, List<Professor> professors, List<Disciplina> disciplinas) throws Exception {
        String opcao = "";
        
        do {
            opcao = JOptionPane.showInputDialog("###SISTEMA ESCOLAR###\r\n"
                    + "\r\n1) CRIAR ALUNO"
                    + "\r\n2) CRIAR PROFESSOR"
                    + "\r\n3) CRIAR DISCIPLINA"
                    + "\r\n0) Sair\r\n");
            switch (opcao) {
                
                case "1":                     
                    ManterEscolarNegocio.gerarNotas(alunos);
                    break;
                    
                case "2":                     
                    ManterEscolarNegocio.gerarProfessor(professors);
                    break;
                    
                case "3":                     
                    ManterEscolarNegocio.gerarDisciplina(disciplinas, professors, alunos);
                    break;

            }
        } while (!opcao.equals("0"));
    }
    
     public static void imprimirDisciplina(List<Disciplina> disciplinas) {
        System.out.println("LISTA DE DISCIPLINAS");
        for (int i = 0; i < disciplinas.size(); i++) {

            System.out.println(disciplinas.get(i));
        }
    }

    public static void imprimirAlunos(List<Aluno> alunos) {
        System.out.println("LISTA DE ALUNOS");
        for (int i = 0; i < alunos.size(); i++) {
            
            System.out.println(alunos.get(i) + "\r\n");
        }
    }

}
