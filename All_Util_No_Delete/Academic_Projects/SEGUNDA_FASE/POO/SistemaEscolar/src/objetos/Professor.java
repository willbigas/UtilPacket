/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.io.Serializable;

/**
 *
 * @author William
 */
public class Professor implements Serializable{

    private String nome;
    private String cpf;
    private String pis;

    public Professor(String nome, String cpf, String pis) {
        this.nome = nome;
        this.cpf = cpf;
        this.pis = pis;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + '}';
    }
    
    
}
