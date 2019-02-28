package br.com.calculasalario;

import java.util.Date;

/**
 *
 * @author William
 */
public class Principal {

    public static void main(String[] args) {
       Funcionario funcionario = new Funcionario("Felipe" , 220.00, 10.60, new Date() , "Analista");
       
       Double salFuncionario = funcionario.calculaSalario();
       
       
       Vigilante vigilante = new Vigilante("William" , 220.00, 5.40, new Date() , "Vigilancia" , 15.00);
       
       Double salVigilante = vigilante.calculaSalario();
       
        System.out.println(funcionario);
        System.out.println("Salario Felipe : "  + salFuncionario);
        System.out.println(vigilante);
        System.out.println("Salario William: " + salVigilante);
    }

}
