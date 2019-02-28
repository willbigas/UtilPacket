package br.com.Principal;

import entidadeImpl.ListaCircular;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author WILL-PC
 */
public class Exercicio05 {

    private static ListaCircular lista;

    public static void main(String[] args) {
        lista = new ListaCircular();
        menu();
    }

    private static void menu() {
        String mensagem = "### DOIS OU UM - AMERICANO ###\n";
        mensagem += " 1 - ADICIONAR JOGADOR\n";
        mensagem += " 2 - SORTEAR\n";
        mensagem += " 0 - SAIR\n\n";
        mensagem += " ### JOGADORES ###\n";
        mensagem += lista;
        String resposta = JOptionPane.showInputDialog(mensagem);
        switch (resposta) {
            case "1":
                adicionarJogador();
                menu();
                break;
            case "2":
                sortearJogador();
                menu();
                break;
            case "0":
                JOptionPane.showMessageDialog(null, "VOCÊ SAIU DO PROGRAMA!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "LETRA NÃO ENCONTRADA - INSIRA 1,2,0");
                menu();
                break;
        }
    }

    private static void adicionarJogador() {
        lista.adicionar(JOptionPane.showInputDialog("INSIRA O NOME DO JOGADOR:"));
    }

    private static void sortearJogador() {
        Integer sorteado = sortearNumero();
        Integer num = sorteado % lista.tamanho();
        if(num.equals(0)){
            num = lista.tamanho();
        }
        JOptionPane.showMessageDialog(null, "Jogador sorteado: " + lista.buscar(num) + "\nNúmero: " + sorteado);
    }

    private static Integer sortearNumero() {
        Integer num = 0;
        Random r = new Random();
        for (int i = 0; i < lista.tamanho(); i++) {
            num += r.nextInt(10);
        }
        return num;
    }
}
