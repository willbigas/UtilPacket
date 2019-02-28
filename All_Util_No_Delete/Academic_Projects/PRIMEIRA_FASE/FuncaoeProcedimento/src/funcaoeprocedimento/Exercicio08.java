/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaoeprocedimento;

/**
 *
 * @author William
 */
public class Exercicio08 {

    public static void main(String[] args) {
        
        
        for (int i = 0; i < 25; i++) {
            if(numeroPrimo(i)){
                System.out.println("Numero " + i + " é primo");
        } else {
               System.out.println("Numero " + i + " não é primo");
            }
        }
        

    }

    private static boolean numeroPrimo(Integer numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }

}
