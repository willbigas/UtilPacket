/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author William
 */
public class Disciplina implements Serializable{

    private String nome;
    private String descricao;
    private Professor professor;
    private List<Aluno> alunos;

    public Disciplina(String nome, String descricao, Professor professor, List<Aluno> alunos) {
        this.nome = nome;
        this.descricao = descricao;
        this.professor = professor;
        this.alunos = alunos;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Nome= " + nome + ", Descricao= " + descricao + ", Professor= " + professor.getNome() +" \r\n" + "Alunos=" + alunos;
    }
    
    

}
