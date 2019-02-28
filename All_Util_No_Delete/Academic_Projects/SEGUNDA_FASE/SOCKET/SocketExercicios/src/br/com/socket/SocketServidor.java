/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class SocketServidor {
    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(8787);
        System.out.println("Servidor Iniciado!!!");
        
        Socket cliente = servidor.accept();
        Scanner entradaDados = new Scanner(cliente.getInputStream());
        String texto = entradaDados.nextLine();
        System.out.println(cliente.getInetAddress().getHostAddress()+" : "+texto);
        servidor.close();
        cliente.close();
        entradaDados.close();
        System.out.println("Servidor Encerrado!");
        
    }
}
