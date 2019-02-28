/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

/**
 *
 * @author William
 */
public class Analista extends Funcionario implements Colaborador {

    
    @Override
    public Double obterSalario() {
        return this.salario = super.obterSalario() + 42.7 * this.getHorasTR() * (1 + (this.getAnosTR() / 100));
       
    }

    @Override
    public void obterDescricao() {
        System.out.println("O analista de sistemas é um profissional da área de Tecnologia da Informação "
                + "(TI) que analisa e desenvolve sistemas, mapeia processos, faz a modelagem de dados e "
                + "levanta os requisitos para implementar esses programas de acordo com os objetivos e as "
                + "regras de negócio da empresa contratante. ");
    }

}
