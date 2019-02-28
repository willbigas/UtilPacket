/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.util.Date;

/**
 *
 * @author Alunos
 */
public class Principal {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Felipe", "000111222-55", new Date());
        Cliente c2 = new Cliente("Felipe", "000111222-55", new Date());
        if (c1.equals(c2)) {
            System.out.println("são iguais!");
        } else {
            System.out.println("são diferentes!");
        }
        
        
        
        
        
        
        
        

        comparacao("aline", "joao");
        comparacao("maria", "maria");
        comparacao("maria", "Maria");
        comparacao("maria", "bruno");
    }

    private static void comparacao(String aluno1, String aluno2) {
        System.out.println("Comparando " + aluno1 + " e " + aluno2 + " --> " + aluno1.compareToIgnoreCase(aluno2));
    }

}
