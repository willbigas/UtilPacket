/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilPacket;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class principal {
    
    public static void main(String[] args) {
        List<Double> teste = new ArrayList<>();
        
        teste.add(8.5);
        teste.add(1.3);
        teste.add(1.4);
        teste.add(3.8);
        teste.add(5.7);
        System.out.println("Lista desordenada" + teste);
        List<Double> teste2= UtilList.ordenarListDec(teste);
        
       
        
        System.out.println("Lista Ordenada" + teste2);
        
    }
    
}
