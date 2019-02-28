/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilPacket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author William
 */
public class UtilArquivo {

    /**
     * Leitura de arquivo concatenando em Linhas
     *
     * @param enderecoArq
     * @return String
     * @throws Exception
     */
    public static String lerArq(String enderecoArq) throws Exception {
        File arquivo = new File(enderecoArq);
        if (!arquivo.exists()) {
            return "";
        }
        FileReader leitor = new FileReader(enderecoArq);
        BufferedReader buffer = new BufferedReader(leitor);
        String linha = buffer.readLine();
        String conteudo = "";
        while (linha != null) {
            conteudo += linha + "\r\n";
            linha = buffer.readLine();
        }
        buffer.close();
        return conteudo;
    }

    /**
     * Leitura de arquivo concatentando em linhas e retornando Array
     *
     * @param enderecoArq
     * @return String[]
     * @throws Exception
     */
    public static String[] lerArqArray(String enderecoArq) throws Exception {
        String conteudo = lerArq(enderecoArq);
        String[] linhas = conteudo.split("\r\n");
        return linhas;
    }
    
    public static List<String> lerArqArrayList(String enderecoArq) throws Exception {
        String conteudo = lerArq(enderecoArq);
        List<String> umaLinha = new ArrayList<>();
        String[] linhas = conteudo.split("\r\n");
        for (int i = 0; i < linhas.length; i++) {
            umaLinha.add(linhas[i]);
            
        }
        return umaLinha;
    }

    /**
     * Escreve em arquivo, sobreescrevendo o conteudo ja existente , se houver.
     *
     * @param enderecoArq
     * @param conteudo
     * @throws Exception
     */
    public static void escreverArq(String enderecoArq, String conteudo) throws Exception {
        FileWriter escritor = new FileWriter(enderecoArq);
        BufferedWriter buffer = new BufferedWriter(escritor);
        buffer.append(conteudo);
        buffer.close();
    }

    /**
     * Escreve em arquivo, concatenando o conteudo atual
     *
     * @param enderecoArq
     * @param conteudo
     * @throws Exception
     */
    public static void escreverArqConcat(String enderecoArq, String conteudo) throws Exception {
        FileWriter escritor = new FileWriter(enderecoArq, true);
        BufferedWriter buffer = new BufferedWriter(escritor);
        buffer.append(conteudo + "\r\n");
        buffer.close();
    }

    /**
     * Escrever Arquivo concatenando com Recebimento de Arraylist
     *
     * @param nmArquivo
     * @param conteudo
     * @throws Exception
     */
    public static void escreverArqConcatArrayList(String enderecoArq, List<String> conteudo) throws Exception {
        FileWriter escritor = new FileWriter(enderecoArq, true);
        BufferedWriter buffer = new BufferedWriter(escritor);
        buffer.append(conteudo + "\r\n");
        buffer.close();
    }

}
