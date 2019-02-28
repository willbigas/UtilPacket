/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.frentecaixa;

import java.util.Date;

/**
 *
 * @author Alunos
 */
public class Caixa {

    private String nmFuncionario;
    private Date dtAbertura;
    private Date dtFechamento;
    private Boolean flAberto;
    private Boolean flFechado;
    private Double vlInicialDinheiro;
    private Double vlDinheiro;
    private Double vlCartaoDebito;
    private Double vlCartaoCredito;
    private Integer qtVendas;

    public String getNmFuncionario() {
        return nmFuncionario;
    }

    public void setNmFuncionario(String nmFuncionario) {
        this.nmFuncionario = nmFuncionario;
    }

    public Date getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(Date dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public Date getDtFechamento() {
        return dtFechamento;
    }

    public void setDtFechamento(Date dtFechamento) {
        this.dtFechamento = dtFechamento;
    }

    public Boolean getFlAberto() {
        return flAberto;
    }

    public void setFlAberto(Boolean flAberto) {
        this.flAberto = flAberto;
    }

    public Boolean getFlFechado() {
        return flFechado;
    }

    public void setFlFechado(Boolean flFechado) {
        this.flFechado = flFechado;
    }

    public Double getVlInicialDinheiro() {
        return vlInicialDinheiro;
    }

    public void setVlInicialDinheiro(Double vlInicialDinheiro) {
        this.vlInicialDinheiro = vlInicialDinheiro;
    }

    public Double getVlDinheiro() {
        return vlDinheiro;
    }

    public void setVlDinheiro(Double vlDinheiro) {
        this.vlDinheiro = vlDinheiro;
    }

    public Double getVlCartaoDebito() {
        return vlCartaoDebito;
    }

    public void setVlCartaoDebito(Double vlCartaoDebito) {
        this.vlCartaoDebito = vlCartaoDebito;
    }

    public Double getVlCartaoCredito() {
        return vlCartaoCredito;
    }

    public void setVlCartaoCredito(Double vlCartaoCredito) {
        this.vlCartaoCredito = vlCartaoCredito;
    }

    public Integer getQtVendas() {
        return qtVendas;
    }

    public void setQtVendas(Integer qtVendas) {
        this.qtVendas = qtVendas;
    }

    public void abrirCaixa(String nome, Double valorInicial) {
        if (null != this.flAberto && this.flAberto) {
            return;
        }
        this.nmFuncionario = nome;
        this.dtAbertura = new Date();
        this.flAberto = true;
        this.vlInicialDinheiro = valorInicial;
        this.vlDinheiro = 0.0;
        this.vlCartaoCredito = 0.0;
        this.vlCartaoDebito = 0.0;
        this.qtVendas = 0;
    }

    public void fecharCaixa() {
        if (null == this.flAberto || !this.flAberto) {
            return;
        }
        this.dtFechamento = new Date();
        this.flFechado = true;
    }

    public void fazerVendaDinheiro(Double valor) {
        this.vlDinheiro += valor;
        qtVendas++;
    }

    public void fazerVendaDebito(Double valor) {
        this.vlCartaoDebito += valor;
        qtVendas++;
    }

    public void fazerVendaCredito(Double valor) {
        this.vlCartaoCredito += valor;
        qtVendas++;
    }

    @Override
    public String toString() {
        String texto = "Endereco de memoria" + super.toString();
        texto += "\r\n" + relatorio();
        return texto;
    }
    
    

    public String relatorio() {
        String retorno = "";
        retorno += "nmFuncionario: " + nmFuncionario + "\r\n";
        retorno += "dtAbertura: " + dtAbertura + "\r\n";
        retorno += "dtFechamento: " + dtFechamento + "\r\n";
        retorno += "flAberto: " + flAberto + "\r\n";
        retorno += "flFechado: " + flFechado + "\r\n";
        retorno += "vlInicialDinheiro: " + vlInicialDinheiro + "\r\n";
        retorno += "vlDinheiro: " + vlDinheiro + "\r\n";
        retorno += "vlCartaoDebito: " + vlCartaoDebito + "\r\n";
        retorno += "vlCartaoCredito: " + vlCartaoCredito + "\r\n";
        retorno += "qtVendas: " + qtVendas + "\r\n";

        return retorno; 
    }
    
    
}
