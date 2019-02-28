
package br.com.exerciciosarray;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Integer qtdA = 0;
        List letras = new ArrayList();
        String m = JOptionPane.showInputDialog("Digite um nome:");
        Boolean contemA = false;

        for (int i = 0; i < m.length(); i++) {
            letras.add(m.charAt(i));

        }

        for (int i = 0; i < letras.size(); i++) {
            if (letras.get(i).toString().equalsIgnoreCase("A")) {
                contemA = true;
                qtdA++;
            }

        }
        if (contemA) {
            System.out.println("O nome contem A e tem " + qtdA + " Letras");
        }

    }

}
