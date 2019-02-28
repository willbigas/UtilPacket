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
public class Desenvolvedor extends Funcionario implements Colaborador {

    @Override
    public Double obterSalario() {
        return this.salario = super.obterSalario() + 37.4 * this.getHorasTR();
    }

    @Override
    public void obterDescricao() {
        System.out.println("O tecnólogo com esta formação desenvolve, analisa, projeta, implementa e atualiza sistemas de "
                + "informação. Tem noções de gerenciamento, "
                + "mas sua especialidade é a criação de sistemas informatizados: programação de computadores e "
                + "desenvolvimento de softwares para ampliar a capacidade dos recursos do equipamento.");
    }
}
