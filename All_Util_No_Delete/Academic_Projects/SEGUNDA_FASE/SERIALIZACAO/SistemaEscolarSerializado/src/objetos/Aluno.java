/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.io.Serializable;

/**
 *
 * @author Alunos
 */
public class Aluno extends Pessoa implements Serializable{
    private String curso;
    private Integer matricula;
    private boolean matriculado;

    public Aluno(String curso, Integer matricula, boolean matriculado) {
        this.curso = curso;
        this.matricula = matricula;
        this.matriculado = matriculado;
    }
    
    
    

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    
    public void fazMatricula(Integer nrMatricula){
        this.setMatricula(nrMatricula);
    }

    @Override
    public String toString() {
        return "Aluno{" + "curso=" + curso + ", matricula=" + matricula + ", matriculado=" + matriculado + '}';
    }
    
    
    
}
