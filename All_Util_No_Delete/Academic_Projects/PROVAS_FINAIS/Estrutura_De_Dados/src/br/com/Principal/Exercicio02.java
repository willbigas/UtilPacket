package br.com.Principal;

import java.util.Random;
import javax.swing.JOptionPane;
import entidadeImpl.ListaEncadeada;

/**
 *
 * @author WILL-PC
 */
public class Exercicio02 {

    private static ListaEncadeada senhaNormal;
    private static ListaEncadeada senhaPrioritaria;

    public static void main(String[] args) {
        senhaNormal = new ListaEncadeada();
        senhaPrioritaria = new ListaEncadeada();
        menu();
    }

    private static void menu() {
        String mensagem = "### MENU ###\n";
        mensagem += " (1) SENHA NORMAL ;\n";
        mensagem += " (2) SENHA PRIORITARIA;\n";
        mensagem += " (3) CHAMAR PROXIMO;\n";
        mensagem += " (4) VIZUALIZAR FILA;\n";
        mensagem += " (0) SAIR;\n";
        String resposta = JOptionPane.showInputDialog(mensagem);
        switch (resposta) {
            case "1":
                JOptionPane.showMessageDialog(null, "Senha: " + gerarSenhaNormal());
                menu();
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Senha prioritária: " + gerarSenhaPrioritaria());
                menu();
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Próximo: " + chamarProximo() + "\n\nSenha normal: " + senhaNormal + "\nSenha Prioritaria: " + senhaPrioritaria);
                menu();
                break;
            case "4":
                vizualizarFila();
                menu();
                break;
            case "0":

                break;
            default:
                JOptionPane.showMessageDialog(null, "Insira 1,2,3,0 ou Cancele o Programa");
                menu();
                break;
        }
    }

    private static Integer gerarSenhaNormal() {
        Random r = new Random();
        Integer senha = null;
        while (senha == null || senhaNormal.existe(senha) && senhaPrioritaria.existe(senha)) {
            senha = r.nextInt(999);
        }
        senhaNormal.adicionar(senha);
        return senha;
    }

    private static Integer gerarSenhaPrioritaria() {
        Random r = new Random();
        Integer senha = null;
        while (senha == null || senhaNormal.existe(senha) && senhaPrioritaria.existe(senha)) {
            senha = r.nextInt(999);
        }
        senhaPrioritaria.adicionar(senha);
        return senha;
    }

    private static Integer chamarProximo() {
        Integer proximo;
        proximo = (Integer) senhaPrioritaria.getProximo();
        if (proximo == null) {
            proximo = (Integer) senhaNormal.getProximo();
        } if (proximo == null) {
            JOptionPane.showMessageDialog(null, "Não Existem + Pessoas para Chamar , Favor aguardar!");
        }
        return proximo;
    }

    public static String vizualizarFila() {
        if (senhaNormal.isVazio() && senhaPrioritaria.isVazio()) {
            JOptionPane.showMessageDialog(null, "Não existe membros na fila , por favor crie + senhas!");
        } else {
            System.out.println("-------------------------------");
            System.out.println("FILA NORMAL");
            senhaNormal.vizualizarFila();
            System.out.println("FILA PRIORITARIA");
            senhaPrioritaria.vizualizarFila();
            System.out.println("-------------------------------");
        }
        return null;
    }
}
