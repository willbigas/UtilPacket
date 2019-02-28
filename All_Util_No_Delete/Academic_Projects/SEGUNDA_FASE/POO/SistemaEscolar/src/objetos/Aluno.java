/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author William
 */
public class Aluno implements Serializable{
    private String nome;
    private Integer matricula;
    private Date nascimento;
    private List<Double> notas;

    public Aluno(String nome, Integer matricula, Date nascimento, List<Double> notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nascimento = nascimento;
        this.notas = notas;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Nome= " + nome + ", Matricula= " + matricula + ", Notas= " + notas + ", Media= " + UtilPacket.UtilList.mediaDec(notas);
    }
    
    
    
    
}
