package br.com.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class SocketCliente {

    public static void main(String[] args) throws IOException {
        Socket cliente = new Socket("localhost", 8787);

        PrintStream output = new PrintStream(cliente.getOutputStream());

        Scanner s = new Scanner(System.in);
        output.println(s.nextLine());
        cliente.close();
        s.close();
        output.close();
    }

}
