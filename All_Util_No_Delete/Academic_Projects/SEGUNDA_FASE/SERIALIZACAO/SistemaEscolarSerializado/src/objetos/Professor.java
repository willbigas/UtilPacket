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
public class Professor extends Pessoa implements Serializable{
    private String titulo;
    private String especialidade;

    public Professor(String titulo, String especialidade) {
        this.titulo = titulo;
        this.especialidade = especialidade;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public void alteraTitulo(String novotitulo){
        this.setTitulo(novotitulo);
    }

    @Override
    public String toString() {
        return "Professor{" + "titulo=" + titulo + ", especialidade=" + especialidade + '}';
    }
    
    
    
    
}
