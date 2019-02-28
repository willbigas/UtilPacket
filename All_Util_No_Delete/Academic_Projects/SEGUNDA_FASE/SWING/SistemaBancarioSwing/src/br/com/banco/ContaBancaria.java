/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.banco;

import java.text.DecimalFormat;

/**
 *
 * @author Alunos
 */
public class ContaBancaria implements Comparable<ContaBancaria> {

    private String cliente;
    private Integer agencia;
    private Integer conta;
    private Double saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int compareTo(ContaBancaria o) {
        return this.cliente.compareTo(o.getCliente());
    }

    public void sacar(Double valor) {
        setSaldo(getSaldo() - valor);
    }

    public void depositar(Double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String retorno = "Cliente: " + getCliente() + "\n";
        retorno += "Ag.: " + getAgencia() + "\n";
        retorno += "CC.: " + getConta() + "\n";
        retorno += "Saldo: " + df.format(getSaldo()) + "\n";
        return retorno;
    }
}
