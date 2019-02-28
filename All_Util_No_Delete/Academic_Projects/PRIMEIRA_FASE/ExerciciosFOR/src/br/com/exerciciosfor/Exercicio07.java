/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exerciciosfor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Will
 */
public class Exercicio07 {
    public static void main(String[] args) {
        List<Integer> numerosAleatorios = new ArrayList<>();
        
        
       String mensagem = JOptionPane.showInputDialog("Digite um numero");
       Integer numero = Integer.valueOf(mensagem);
        Random r = new Random();
        for (int i = 0; i < numero; i++) {
           numerosAleatorios.add(r.nextInt(10000));
            System.out.println(numerosAleatorios.get(i));
           
        }
        System.out.println("Maior numero: " + Collections.max(numerosAleatorios));
        System.out.println("Menor numero: " + Collections.min(numerosAleatorios));
        System.out.println("Media dos numeros: " + UtilPacket.UtilMath.mediaArrayListInt(numerosAleatorios));
    }
}
