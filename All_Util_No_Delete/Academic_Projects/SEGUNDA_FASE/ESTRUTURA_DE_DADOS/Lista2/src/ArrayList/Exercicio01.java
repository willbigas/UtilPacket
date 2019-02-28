/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Exercicio01 {

    public static void main(String[] args) {

        List<Integer> numA = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numA.add(i);

        }
        Collections.shuffle(numA);

        System.out.println("Lista de numeros Aleatórios \r\n" + numA);
        String msg = JOptionPane.showInputDialog(null, "Digite um numero: ");
        Integer num = UtilPacket.UtilFormat.strForInt(msg);
        Integer numMenor = 0;
        Integer numMaior = 0;
        Integer numIgual = 0;
        for (int i = 0; i < numA.size(); i++) {
            if (num > numA.get(i)) {
                numMenor++;
            }
            if (num < numA.get(i)) {
                numMaior++;
            }
            if (num.compareTo(numA.get(i)) == 0) {
                numIgual++;
            }

        }
        System.out.println("Quantidade de Numeros Menores: " + numMenor);
        System.out.println("Quantidade de Numeros Maiores: " + numMaior);
        System.out.println("Quantidade de Numeros Iguais: " + numIgual);
    }

}
