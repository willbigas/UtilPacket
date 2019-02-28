/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.banco;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Principal {

    private static ContaBancaria CONTA_LOGADA_USUARIO;
    private static FramePrincipal frame;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        carregarDadosIniciais();
        frame = new FramePrincipal();
        frame.setTitle("BANCO XYZ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        maximizado --> frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(600, 450);
        frame.setVisible(Boolean.TRUE);
    }

    private static void carregarDadosIniciais() throws NumberFormatException, Exception {
        String[] conteudo = UtilArquivo.lerArquivoEmLinhas("correntistas.txt");
        Boolean primeiro = true;
        for (String umaLinha : conteudo) {
            if (primeiro) {
                primeiro = false;
                continue;
            }
            String[] dados = umaLinha.split("[;]");
            String nome = dados[0];
            Integer agencia = Integer.valueOf(dados[1]);
            Integer numeroConta = Integer.valueOf(dados[2]);
            Double saldo = Double.valueOf(dados[3]);
            ManterContaBancariaNegocio.inserir(nome, agencia, numeroConta, saldo);
        }
    }

    static void fazerLogin(String agencia, String numeroConta) {
        ContaBancaria conta = ManterContaBancariaNegocio.obterContaPorAgenciaNumero(agencia, numeroConta);
        if (conta == null) {
            JOptionPane.showMessageDialog(null, "Conta não encontrada", "BANCO XYZ", JOptionPane.ERROR_MESSAGE);
        } else {
            CONTA_LOGADA_USUARIO = conta;
            setMenuPrincipal();
        }

    }

    static void verSaldo() {
        JOptionPane.showMessageDialog(null, CONTA_LOGADA_USUARIO);
    }

    static void transferir() {
        frame.setContentPane(new PanelTransferencia());
        frame.setVisible(Boolean.TRUE);
    }

    public static void transferir(Double valor, String agencia, String numeroConta) {
        if (CONTA_LOGADA_USUARIO.getSaldo() >= valor) {
            ContaBancaria contaDestino = ManterContaBancariaNegocio.obterContaPorAgenciaNumero(agencia, numeroConta);
            if (null == contaDestino) {
                JOptionPane.showMessageDialog(null, "Conta não encontrada!");
                setMenuPrincipal();
                return;
            }
            CONTA_LOGADA_USUARIO.sacar(valor);
            contaDestino.depositar(valor);
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Sem saldo para transação");
        }
        setMenuPrincipal();
    }

    private static void setMenuPrincipal() {
        frame.setContentPane(new PanelMenu(CONTA_LOGADA_USUARIO.getCliente()));
        frame.setVisible(Boolean.TRUE);
    }

    public static void sacar() {
        frame.setContentPane(new PanelSacar());
        frame.setVisible(Boolean.TRUE);
    }

    public static void sacar(Double valor) {
        if (CONTA_LOGADA_USUARIO.getSaldo() >= valor) {
            CONTA_LOGADA_USUARIO.sacar(valor);
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Sem saldo para transação");
        }
        setMenuPrincipal();
    }

    public static void depositar() {
        frame.setContentPane(new PanelDeposito());
        frame.setVisible(Boolean.TRUE);
    }

    public static void depositar(Double valor) {
        CONTA_LOGADA_USUARIO.depositar(valor);
        JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso!");
        setMenuPrincipal();
    }

}
