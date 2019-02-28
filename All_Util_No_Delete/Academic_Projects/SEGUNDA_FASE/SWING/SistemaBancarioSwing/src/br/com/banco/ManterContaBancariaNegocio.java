/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class ManterContaBancariaNegocio {
    
    private static List<ContaBancaria> CONTAS = new ArrayList<>();
    
    public static void inserir(String nome, Integer agencia, Integer numeroConta, Double saldo) {
        ContaBancaria conta = new ContaBancaria();
        conta.setCliente(nome);
        conta.setAgencia(agencia);
        conta.setConta(numeroConta);
        conta.setSaldo(saldo);
        CONTAS.add(conta);
    }

    public static ContaBancaria obterContaPorAgenciaNumero(String agencia, String numeroConta) {
        for (ContaBancaria contaBancaria : CONTAS) {
            if (contaBancaria.getAgencia().toString().equalsIgnoreCase(agencia)
                    && contaBancaria.getConta().toString().equalsIgnoreCase(numeroConta)) {
                return contaBancaria;
            }
        }
        /* nao encontrado */
        return null;
    }
    
}
