/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author William
 */
public class Exercicio02 {

    public static void main(String[] args) throws Exception {

        List<String> umNome = new ArrayList<>();
        umNome = UtilPacket.UtilArquivo.lerArqArrayList("nomes.txt"); // Lendo Arquivo
        
        umNome.add("William Bigas Mauro");
        System.out.println("Desordenado: " + umNome);
        Collections.sort(umNome);
        System.out.println("Ordenado: " + umNome);
        UtilPacket.UtilArquivo.escreverArqConcatArrayList("nomes_ordenado.txt", umNome);

    }

}
