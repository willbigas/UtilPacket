/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaoeprocedimento;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Exercicio09 {

    public static void main(String[] args) {
        String opcao = "";
        do {
            opcao = JOptionPane.showInputDialog("###CONVERSAO DE TEMPERATURA###\r\n"
                    + "\r\n1) C > K"
                    + "\r\n2) C > F"
                    + "\r\n0) SAIR\r\n");
            switch (opcao) {
                case "1":
                    recebeMensagem();
                    break;
                case "2":
                    recebeMensagem2();
                    break;
            }
        } while (!opcao.equals("0"));
    }

    public static void recebeMensagem2() throws NumberFormatException, HeadlessException {
        // Convertendo para Fahrenreit //
        String mensagem2 = JOptionPane.showInputDialog("CELCIUS X FAHRENREIT\r\n\r\n"
                + "Digite o valor");
        Double resultado2 = celciusXFahrenheit(Double.valueOf(mensagem2));
        JOptionPane.showMessageDialog(null, "Resultado é \r\n" + resultado2 + "F");
    }

    public static void recebeMensagem() throws HeadlessException, NumberFormatException {
        // Convertendo para Kelvin //,
        String mensagem = JOptionPane.showInputDialog("CELCIUS X KELVIN\r\n\r\n"
                + "Digite o valor");
        Double resultado = celciusXKelvin(Double.valueOf(mensagem));
        JOptionPane.showMessageDialog(null, "Resultado é \r\n" + resultado + "K");
    }

    public static Double celciusXKelvin(Double valor) {
        Double kelvin = valor + 273.00;
        return kelvin;
    }

    public static Double celciusXFahrenheit(Double valor) {
        Double Fahrenheit = (valor * 1.8) + 32.00;
        return Fahrenheit;
    }

}
