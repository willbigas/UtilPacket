package br.com.kahoot.entidade;

/**
 *
 * @author Alunos
 */
public class Disciplina {

    Integer id;
    String nome;
    String professor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "id=" + id + ", nome=" + nome + ", professor=" + professor + '}';
    }
    
    

}
