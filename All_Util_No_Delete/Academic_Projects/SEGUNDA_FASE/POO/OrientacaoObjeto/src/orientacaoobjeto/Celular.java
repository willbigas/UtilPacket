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
public class Celular {

    String marca;
    String modelo;
    double altura;
    double largura;
    int bateria;
    boolean ligado;
    boolean sinal;

    void fazerLigacao() {
        if (ligado && sinal && bateria > 0) {
            System.out.println("Ligacao recebida!");
        } else {
            System.out.println("Celular desligado, "
                    + " sem sinal ou sem bateria");
        }
    }

    void ligarCelular() {
        if (ligado) {
            System.out.println("Celular ja ligado");
        } else {
            ligado = true;
        }
    }

    void desligarCelular() {
        if (!ligado) {
            System.out.println("Celular ja desligado");
        } else {
            ligado = false;
        }
    }

    void carregar() {
        while (bateria < 100) {
            System.out.print("... " + bateria);
            bateria++;
        }
        System.out.println("\nCarga completa!");
    }

    void estadoAtual() {
        System.out.println("############ STATUS ############");
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("altura: " + altura);
        System.out.println("largura: " + largura);
        System.out.println("bateria: " + bateria);
        System.out.println("ligado: " + ligado);
        System.out.println("sinal: " + sinal);
    }
}
