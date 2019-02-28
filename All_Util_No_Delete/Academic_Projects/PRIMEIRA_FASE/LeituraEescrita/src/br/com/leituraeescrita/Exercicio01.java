package br.com.leituraeescrita;

import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {
            
    public static void main(String[] args) throws Exception {
        
        List<String> NOMES =  new ArrayList<>();
        List<String> MATRICULAS =  new ArrayList<>();
        List<String> N1T1 =  new ArrayList<>();
        List<String> N2T1 =  new ArrayList<>();
        List<String> N3T1 =  new ArrayList<>();
       

        String linhas[] = utilpacket.UtilArquivo.lerArqArray("diario.txt");
        for (int i = 0; i < linhas.length; i++) {
            String linha = linhas[i];
            System.out.println(linha);
        }

    }

}
