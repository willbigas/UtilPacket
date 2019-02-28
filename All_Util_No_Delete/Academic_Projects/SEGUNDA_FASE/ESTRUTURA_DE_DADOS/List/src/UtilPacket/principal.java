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
        List<Integer> teste = new ArrayList<>();
        
        teste.add(8);
        teste.add(1);
        teste.add(15);
        teste.add(3);
        teste.add(5);
        System.out.println("Lista desordenada" + teste);
        List<Integer> teste2= UtilList.ordenarBubbleSort(teste);
        
       
        
        System.out.println("Lista Ordenada" + teste2);
        
    }
    
}
