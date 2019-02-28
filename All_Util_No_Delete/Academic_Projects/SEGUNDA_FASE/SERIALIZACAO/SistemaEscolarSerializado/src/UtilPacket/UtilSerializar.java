/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilPacket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author WILL
 */
public class UtilSerializar {

    /**
     * Le um objeto serializado através de Stream
     *
     * @param enderecoArq
     * @param objeto
     * @return
     * @throws FileNotFoundException
     * @throws Exception
     */
    public static Object lerSerializando(String enderecoArq, Object objeto) throws FileNotFoundException, Exception {
        FileInputStream arqEntrada = new FileInputStream(enderecoArq);
        ObjectInputStream in = new ObjectInputStream(arqEntrada);
        objeto = (Object) in.readObject();
        in.close();
        return objeto;
    }

    /**
     * Le uma Lista de Objetos serializando através de Stream
     *
     * @param enderecoArq
     * @param lista
     * @return
     * @throws FileNotFoundException
     * @throws Exception
     */
    public static List lerSerializando(String enderecoArq, List lista) throws FileNotFoundException, Exception {
        FileInputStream arqEntrada = new FileInputStream(enderecoArq);
        ObjectInputStream in = new ObjectInputStream(arqEntrada);
        lista = (List) in.readObject();
        in.close();
        return lista;
    }

    /**
     * Le uma String de Arquivo Serializado
     *
     * @param enderecoArq
     * @param conteudo
     * @return
     * @throws Exception
     */
    public static String lerSerializando(String enderecoArq, String conteudo) throws Exception {
        FileInputStream arqEntrada = new FileInputStream(enderecoArq);
        DataInputStream dadosIn = new DataInputStream(arqEntrada);
        String resultado = dadosIn.readUTF();
        arqEntrada.close();
        return resultado;

    }

    /**
     * Le uma Integer de Arquivo Serializado
     *
     * @param enderecoArq
     * @param conteudo
     * @return
     * @throws Exception
     */
    public static Integer lerSerializando(String enderecoArq, Integer conteudo) throws Exception {
        FileInputStream arqEntrada = new FileInputStream(enderecoArq);
        DataInputStream dadosIn = new DataInputStream(arqEntrada);
        Integer resultado = dadosIn.readInt();
        arqEntrada.close();
        return resultado;

    }

    /**
     * Le um Double de Arquivo Serializado
     *
     * @param enderecoArq
     * @param conteudo
     * @return
     * @throws Exception
     */
    public static Double lerSerializando(String enderecoArq, Double conteudo) throws Exception {
        FileInputStream arqEntrada = new FileInputStream(enderecoArq);
        DataInputStream dadosIn = new DataInputStream(arqEntrada);
        Double resultado = dadosIn.readDouble();
        arqEntrada.close();
        return resultado;

    }

    /// ESCRITA DE ARQUIVO ///
    /**
     * Escreve um Objeto em Arquivo Serializando.
     *
     * @param enderecoArq
     * @param objeto
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void escreverSerializando(String enderecoArq, Object objeto) throws FileNotFoundException, IOException {
        FileOutputStream arqEntrada = new FileOutputStream(enderecoArq);
        ObjectOutputStream out = new ObjectOutputStream(arqEntrada);
        out.writeObject(objeto);
        out.close();

    }

    /**
     * Escreve uma Lista de Objetos em Arquivo serializando
     *
     * @param enderecoArq
     * @param lista
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void escreverSerializando(String enderecoArq, List lista) throws FileNotFoundException, IOException {
        FileOutputStream arqEntrada = new FileOutputStream(enderecoArq);
        ObjectOutputStream out = new ObjectOutputStream(arqEntrada);
        out.writeObject(lista);
        out.close();

    }

    /**
     * Escreve uma String em Arquivo Serializando
     *
     * @param enderecoArq
     * @param conteudo
     * @throws Exception
     */
    public static void escreverSerializando(String enderecoArq, String conteudo) throws Exception {
        FileOutputStream arqSaida = new FileOutputStream(enderecoArq);
        DataOutputStream dadosOut = new DataOutputStream(arqSaida);
        dadosOut.writeUTF(conteudo);
        arqSaida.close();

    }

    /**
     * Escreve um Integer em Arquivo Serializando
     *
     * @param enderecoArq
     * @param conteudo
     * @throws Exception
     */
    public static void escreverSerializando(String enderecoArq, Integer conteudo) throws Exception {
        FileOutputStream arqSaida = new FileOutputStream(enderecoArq);
        DataOutputStream dadosOut = new DataOutputStream(arqSaida);
        dadosOut.writeInt(conteudo);
        arqSaida.close();

    }

}
