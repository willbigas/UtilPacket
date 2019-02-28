package br.com.Principal;

import entidadeImpl.ListaCircular;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author WILL-PC
 */
public class Exercicio06 {
    private static ListaCircular lista;
    
    public static void main(String[] args) {
        lista = new ListaCircular();
        adicionarSoldados();
        for (int i = 0; i < 9; i++) {
            sortearSoldado();
        }
        JOptionPane.showMessageDialog(null, "Soldado que deve cruzar a trincheira é o " + lista);
    }
    
    private static void adicionarSoldados(){
        lista.adicionar("Soldado 1");
        lista.adicionar("Soldado 2");
        lista.adicionar("Soldado 3");
        lista.adicionar("Soldado 4");
        lista.adicionar("Soldado 5");
        lista.adicionar("Soldado 6");
        lista.adicionar("Soldado 7");
        lista.adicionar("Soldado 8");
        lista.adicionar("Soldado 9");
        lista.adicionar("Soldado 10");
    }
    
    private static void sortearSoldado() {
        Integer sorteado = sortearNumero();
        Integer num = sorteado % lista.tamanho();
        if(num.equals(0)){
            num = lista.tamanho();
        }
        JOptionPane.showMessageDialog(null, "Soldado sorteado: " + lista.buscar(num) + "\nNúmero: " + sorteado);
        lista.remover(num);
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
