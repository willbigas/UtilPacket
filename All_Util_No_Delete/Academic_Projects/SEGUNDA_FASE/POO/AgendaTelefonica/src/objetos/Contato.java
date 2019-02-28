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
public class Contato implements Serializable{

    private String nome;
    private String email;
    private Endereco endereco;
    private List<Telefone> telefones;

    public Contato(String nome, String email, Endereco endereco, List<Telefone> telefones) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefones = telefones;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Nome =" + nome + ", Endereco=" + endereco + ", Telefones=" + telefones;
    }

}
