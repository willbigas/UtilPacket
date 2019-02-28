/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        FileOutputStream arqSaida = new FileOutputStream("teste.txt");
        DataOutputStream dadosOut = new DataOutputStream(arqSaida);
        dadosOut.writeUTF("Programacao Orientada a Objetos");
        dadosOut.writeInt(2018);
        arqSaida.close();

        FileInputStream arqEntrada = new FileInputStream("teste.txt");
        DataInputStream dadosIn = new DataInputStream(arqEntrada);
        System.out.println(dadosIn.readUTF());
        System.out.println(dadosIn.readInt());
        arqEntrada.close();
    }

    public void escreverStringStream(String enderecoArq, String conteudo) throws Exception {
        FileOutputStream arqSaida = new FileOutputStream("enderecoArq");
        DataOutputStream dadosOut = new DataOutputStream(arqSaida);
        dadosOut.writeUTF("conteudo");
        arqSaida.close();

    }

    public void lerStringStream(String enderecoArq, String conteudo) throws Exception {
        FileInputStream arqEntrada = new FileInputStream("enderecoArq");
        DataInputStream dadosIn = new DataInputStream(arqEntrada);
        dadosIn.readUTF();

    }

    

}
