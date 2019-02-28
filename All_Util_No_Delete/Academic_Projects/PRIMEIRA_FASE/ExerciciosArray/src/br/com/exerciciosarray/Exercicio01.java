package br.com.exerciciosarray;

import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Exercicio01 {

    public static void main(String[] args) {
        String[] nomeP = new String[3];
        String[] parteP = new String[3];
        String[] nomeA = new String[3];
        for (int i = 0; i < 3; i++) {
            nomeP[i] = JOptionPane.showInputDialog("Digite o nome da pessoa");
            parteP[i] = JOptionPane.showInputDialog("Digite a parte do corpo");
            nomeA[i] = JOptionPane.showInputDialog("Digite o nome do animal");
            System.out.println(nomeP[i] + " tem " + parteP[i] + " de " + nomeA[i]);
        }
    }

}
