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
public class Plantonista extends Funcionario implements Colaborador {

    @Override
    public Double obterSalario() {
        return this.salario = super.obterSalario() + (28.6 * this.getHorasTR()) + UtilPacket.UtilMath.porcentagemDec(salario, 10.00);
    }

    @Override
    public void obterDescricao() {
        System.out.println("Realiza atendimento aos clientes, visando esclarecimento de dúvidas e resolução de problemas, "
                + "via chat, VOIP, e-mail, telefone e rádio. Acompanhar, tramitar e liberar solicitações de clientes. ");
    }

}
