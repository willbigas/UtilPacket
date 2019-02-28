/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.banco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Felipe
 */
public class UtilArquivo {

    public static void sobreescreverEmArquivo(String nomeArquivo, String conteudoArquivo) throws Exception {
        escreverArquivo(nomeArquivo, conteudoArquivo, Boolean.FALSE);
    }
    
    public static void escreverEmArquivo(String nomeArquivo, String conteudoArquivo) throws Exception {
        escreverArquivo(nomeArquivo, conteudoArquivo + "\r\n", Boolean.TRUE);
    }
    
    private static void escreverArquivo(String nomeArquivo, String conteudoArquivo, Boolean appendConteudo) throws Exception {
        FileWriter escritor = new FileWriter(nomeArquivo, appendConteudo);
        BufferedWriter buffer = new BufferedWriter(escritor);
        buffer.append(conteudoArquivo);
        buffer.close();
    }

    public static String lerArquivo(String nomeArquivo) throws Exception {
        File arquivo = new File(nomeArquivo);
        if (!arquivo.exists()) {
            return null;
        }
        FileReader leitor = new FileReader(nomeArquivo);
        BufferedReader buffer = new BufferedReader(leitor);
        String linha = buffer.readLine();
        String conteudo = "";
        while (linha != null) {
            conteudo += linha + "\n";
            linha = buffer.readLine();
        }
        buffer.close();
        return conteudo;
    }
    
    public static String[] lerArquivoEmLinhas(String nomeArquivo) throws Exception {
        File arquivo = new File(nomeArquivo);
        if (!arquivo.exists()) {
            return null;
        }
        String[] linhas = new String[getQuantidadeLinhasArquivo(nomeArquivo)];
        FileReader leitor = new FileReader(nomeArquivo);
        BufferedReader buffer = new BufferedReader(leitor);
        String linha = buffer.readLine();
        Integer indice = 0;
        while (linha != null) {
            linhas[indice] = linha;
            indice++;
            linha = buffer.readLine();
        }
        buffer.close();
        return linhas;
    }
    
    public static Integer getQuantidadeLinhasArquivo(String nomeArquivo) throws Exception {
        File arquivo = new File(nomeArquivo);
        if (!arquivo.exists()) {
            return null;
        }
        FileReader leitor = new FileReader(nomeArquivo);
        BufferedReader buffer = new BufferedReader(leitor);
        Integer qtdLinhas = 0;
        String linha = buffer.readLine();
        while (linha != null) {
            qtdLinhas++;
            linha = buffer.readLine();
        }
        return qtdLinhas;
    }

}
