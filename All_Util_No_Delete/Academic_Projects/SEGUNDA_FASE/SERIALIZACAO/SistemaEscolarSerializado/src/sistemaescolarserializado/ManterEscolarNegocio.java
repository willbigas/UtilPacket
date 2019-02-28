/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaescolarserializado;

import objetos.Pessoa;
import objetos.Funcionario;
import objetos.Aluno;
import objetos.Professor;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class ManterEscolarNegocio {

    public static void imprimindoQuantidade(Integer qtdAluno, Integer qtdProfessor, Integer qtdFuncionario) {
        System.out.println("Quantidade de Alunos :" + qtdAluno);
        System.out.println("Quantidade de Professores :" + qtdProfessor);
        System.out.println("Quantidade de Funcionarios :" + qtdFuncionario);
    }

    public static void adicionarPessoasALista(List<Pessoa> PESSOAS, List<Aluno> ALUNOS, List<Professor> PROFESSORS, List<Funcionario> FUNCIONARIOS) {
        PESSOAS.addAll(ALUNOS);
        PESSOAS.addAll(PROFESSORS);
        PESSOAS.addAll(FUNCIONARIOS);
    }

    public static void adicionarPessoas(List<Integer> r, List<Aluno> ALUNOS, List<Professor> PROFESSORS, List<Funcionario> FUNCIONARIOS) {
        for (int i = 0; i < r.size(); i++) {
            if (r.get(i) == 0) {
                ALUNOS.add(new Aluno("aluno" + i, 1234 + i, true));

            }
            if (r.get(i) == 1) {
                PROFESSORS.add(new Professor("Mestrado" + i, "sei la mano" + i));
            }
            if (r.get(i) == 2) {
                FUNCIONARIOS.add(new Funcionario(12345678 + i, "setorteste" + i));
            }

        }
    }

    public static Integer verificandoFuncionario(List<Pessoa> PESSOASLIDAS, int i, Integer qtdFuncionario) {
        if (PESSOASLIDAS.get(i) instanceof Funcionario) {
            qtdFuncionario++;
        }
        return qtdFuncionario;
    }

    public static Integer verificandoProfessor(List<Pessoa> PESSOASLIDAS, int i, Integer qtdProfessor) {
        if (PESSOASLIDAS.get(i) instanceof Professor) {
            qtdProfessor++;
        }
        return qtdProfessor;
    }

    public static Integer verificandoAluno(List<Pessoa> PESSOASLIDAS, int i, Integer qtdAluno) {
        if (PESSOASLIDAS.get(i) instanceof Aluno) {
            qtdAluno++;
        }
        return qtdAluno;
    }

}
