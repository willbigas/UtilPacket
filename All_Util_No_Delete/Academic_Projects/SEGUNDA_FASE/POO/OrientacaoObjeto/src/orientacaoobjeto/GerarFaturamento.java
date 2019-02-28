/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoobjeto;

/**
 *
 * @author Alunos
 */
public class GerarFaturamento {

    public static void main(String[] args) {
        Integer[] leituraAtuals = {359, 3265, 4587, 659, 120};
        Integer[] leituraAnteriors = {329, 3165, 4287, 259, 110};
        Double[] valorTarifas = {1.75, 3.16, 1.75, 2.59, 1.90};

        for (int i = 0; i < leituraAtuals.length; i++) {
            ContaEnergia umaConta = new ContaEnergia();
            umaConta.setLeituraAtual(leituraAtuals[i]);
            umaConta.setLeituraAnterior(leituraAnteriors[i]);
            umaConta.setValorTarifa(valorTarifas[i]);
            umaConta.setNome("Felipe");
            System.out.println(umaConta.obterValorTotal());
        }
        System.gc();

    }

}
