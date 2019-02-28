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
public class principal {

    public static void main(String[] args) {

        /**
         * Analista
         */
        Analista umAnalista = new Analista();
        umAnalista.setSalario(0.0);
        umAnalista.setNome("Funcionario1");
        umAnalista.setId("2");
        umAnalista.setHorasTR(44.00);
        umAnalista.setAnosTR(2);

        /**
         * Plantonista
         */
        Plantonista umPlantonista = new Plantonista();
        umPlantonista.setSalario(0.0);
        umPlantonista.setNome("Plantonista1");
        umPlantonista.setId("3");
        umPlantonista.setHorasTR(44.00);
        umPlantonista.setAnosTR(1);

        /**
         * Desenvolvedor
         */
        Desenvolvedor umDesenvolvedor = new Desenvolvedor();
        umDesenvolvedor.setSalario(0.0);
        umDesenvolvedor.setNome("Desenvolvedor1");
        umDesenvolvedor.setId("5");
        umDesenvolvedor.setHorasTR(40.00);
        umDesenvolvedor.setAnosTR(4);

        /**
         * Obtendo Salarios do Funcionarios
         */
        Double teste = umAnalista.obterSalario();
        System.out.println("||| Descricao do Analista |||");
        umAnalista.obterDescricao();
        System.out.println("Salario do Analista: " + UtilPacket.UtilFormat.decFormatMoeda(teste) + "\r\n");

        Double teste2 = umPlantonista.obterSalario();
        System.out.println("||| Descricao do Plantonista |||");
        umPlantonista.obterDescricao();
        System.out.println("Salario do Plantonista: " + UtilPacket.UtilFormat.decFormatMoeda(teste2) + "\r\n");

        Double teste3 = umDesenvolvedor.obterSalario();
        System.out.println("||| Descricao do Desenvolvedor |||");
        umDesenvolvedor.obterDescricao();
        System.out.println("Salario do Desenvolvedor: " + UtilPacket.UtilFormat.decFormatMoeda(teste3) + "\r\n");

    }

}
