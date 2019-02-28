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
public class OrientacaoObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Celular samsung = new Celular();
        samsung.estadoAtual();
        samsung.marca = "Samsung";
        samsung.modelo = "S7";
        samsung.ligado = false;
        samsung.estadoAtual();
        
        Celular apple = new Celular();
        apple.marca = "Apple";
        apple.modelo = "Iphone";
        apple.ligado = true;
        apple.ligarCelular();
        apple.estadoAtual();
    }
    
}
