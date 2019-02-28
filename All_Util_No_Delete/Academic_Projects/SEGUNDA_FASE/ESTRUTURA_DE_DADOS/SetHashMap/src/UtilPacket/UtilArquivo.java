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
 * Utilitario para Leitura e Escrita de Arquivo
 *
 * @author William
 */
public class UtilArquivo {

    /**
     * Leitura Simples de arquivo concatenando em Linhas
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
        String conteudo;
        try (BufferedReader buffer = new BufferedReader(leitor)) {
            String linha = buffer.readLine();
            conteudo = "";
            while (linha != null) {
                conteudo += linha + "\r\n";
                linha = buffer.readLine();
            }
        }
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
        for (String linha : linhas) {
            umaLinha.add(linha);
        }
        return umaLinha;
    }

    /**
     * Escreve em arquivo, sobreescrevendo o conteudo ja escrito, se existir.
     *
     * @param enderecoArq
     * @param conteudo
     * @throws Exception
     */
    public static void escreverArq(String enderecoArq, String conteudo) throws Exception {
        FileWriter escritor = new FileWriter(enderecoArq);
        try (BufferedWriter buffer = new BufferedWriter(escritor)) {
            buffer.append(conteudo);
        }
    }

    /**
     * Escreve em arquivo, concatenando o conteudo ja escrito.
     *
     * @param enderecoArq
     * @param conteudo
     * @throws Exception
     */
    public static void escreverArqConcat(String enderecoArq, String conteudo) throws Exception {
        FileWriter escritor = new FileWriter(enderecoArq, true);
        try (BufferedWriter buffer = new BufferedWriter(escritor)) {
            buffer.append(conteudo + "\r\n");
        }
    }

    /**
     * Escrever Arquivo concatenando recebendo por parametro (Arraylist)
     *
     * @param nmArquivo
     * @param conteudo
     * @throws Exception
     */
    public static void escreverArqConcatArrayList(String enderecoArq, List<String> conteudo) throws Exception {
        FileWriter escritor = new FileWriter(enderecoArq, true);
        try (BufferedWriter buffer = new BufferedWriter(escritor)) {
            buffer.append(conteudo + "\r\n");
        }
    }

}
