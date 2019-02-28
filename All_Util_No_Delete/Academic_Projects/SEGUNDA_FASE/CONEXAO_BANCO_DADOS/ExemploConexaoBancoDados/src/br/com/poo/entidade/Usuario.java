package br.com.poo.entidade;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Usuario {

    private Integer id;
    private String nome;
    private Date nascimento;
    private Departamento departamento;
    private List<Telefone> telefones;

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String retorno = "ID " + id + " Nome: " + nome + " Nascimento: " + df.format(nascimento) + "";
        return retorno;
    }

}
