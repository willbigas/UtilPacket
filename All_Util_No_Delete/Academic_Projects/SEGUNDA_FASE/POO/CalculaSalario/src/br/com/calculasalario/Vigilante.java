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
public class Vigilante extends Funcionario {

    private Double qtdHrNoturna;

    public Vigilante(String nome, Double qtdHorasMesTr, Double valorHora, Date dtContratacao, String departamento , Double qtdHrNoturna) {
        super(nome, qtdHorasMesTr, valorHora, dtContratacao, departamento);
        this.qtdHrNoturna = qtdHrNoturna;
    }

    public Double getQtdHrNoturna() {
        return qtdHrNoturna;
    }

    public void setQtdHrNoturna(Double qtdHrNoturna) {
        this.qtdHrNoturna = qtdHrNoturna;
    }

    @Override
    public Double calculaSalario() {
        Double salario = (this.qtdHorasMesTr * this.valorHora) * (1 + this.qtdHrNoturna / 10);
        return salario;
    }

    @Override
    public String toString() {
        return "Vigilante " + this.getNome() + ", qtdHorasMesTr=" + qtdHorasMesTr + ", valorHora=" + valorHora + ", dtContratacao=" + this.getDtContratacao() + ", departamento=" + this.getDepartamento() + ", " + "qtdHrNoturna=" + qtdHrNoturna + "hrs";
    }
    
    

}
