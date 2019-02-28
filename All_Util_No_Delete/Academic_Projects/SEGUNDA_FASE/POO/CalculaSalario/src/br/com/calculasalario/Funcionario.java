/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculasalario;

import java.util.Date;

/**
 *
 * @author William
 */
public class Funcionario {

    private String nome;
    protected Double qtdHorasMesTr;
    protected Double valorHora;
    private Date dtContratacao;
    private String departamento;

    public Funcionario(String nome, Double qtdHorasMesTr, Double valorHora, Date dtContratacao, String departamento) {
        this.nome = nome;
        this.qtdHorasMesTr = qtdHorasMesTr;
        this.valorHora = valorHora;
        this.dtContratacao = dtContratacao;
        this.departamento = departamento;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getQtdHorasMesTr() {
        return qtdHorasMesTr;
    }

    public void setQtdHorasMesTr(Double qtdHorasMesTr) {
        this.qtdHorasMesTr = qtdHorasMesTr;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Date getDtContratacao() {
        return dtContratacao;
    }

    public void setDtContratacao(Date dtContratacao) {
        this.dtContratacao = dtContratacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double calculaSalario() {
        Double salario = this.qtdHorasMesTr * this.valorHora;
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario " + nome + ", qtdHorasMesTr=" + qtdHorasMesTr + ", valorHora=" + valorHora + ", dtContratacao=" + dtContratacao + ", departamento=" + departamento + ", ";
    }
    
    

}
