/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author Alunos
 */
public class Principal {

    public static void main(String[] args) {
       
        comparacao("aline", "joao");
        comparacao("maria", "maria");
        comparacao("maria", "Maria");
        comparacao("maria", "bruno");
    }

    private static void comparacao(String aluno1, String aluno2) {
        System.out.println("Comparando " + aluno1 + " e " + aluno2 + " --> " + aluno1.compareToIgnoreCase(aluno2));
    }

}
