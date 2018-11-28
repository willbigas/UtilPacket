
package utilpacket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Metodos Utilitarios para transmissao de dados via Rede - Swing
 *
 * @author William
 */
public class Util_Socket {
    
    
    /**
     * Metodo que fica esperando um cliente entrar numa porta especifica 
     * para recepcionar objetos
     * @param porta
     * @return Object
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws InterruptedException 
     */
    
    public static Object recebendoDadosViaSocket_Servidor(Integer porta) throws IOException, ClassNotFoundException, InterruptedException {
        ServerSocket servidor = new ServerSocket(porta);
        Socket entradaDados = servidor.accept();
        ObjectInputStream input = new ObjectInputStream(entradaDados.getInputStream());
        Object objRecebido = input.readObject();
        servidor.close();
        entradaDados.close();
        return objRecebido;
    }
    
    /**
     * Funcao que envia Dados via Socket para um Determinado servidor 
     * atraves de um endereco ip e uma porta
     * @param enderecoIp
     * @param porta
     * @param objParaEnviar
     * @throws Exception 
     */

    public static void enviandoDadosViaSocket_Cliente(String enderecoIp, Integer porta, Object objParaEnviar) throws Exception {
        InetAddress endereco = InetAddress.getByName(enderecoIp);
        Socket saidaDados = new Socket(endereco, porta);
        ObjectOutputStream saida = new ObjectOutputStream(saidaDados.getOutputStream()); // saida de objeto da classe cliente
        saida.flush();
        saida.writeObject(objParaEnviar);
        saida.close();
        saidaDados.close(); // fechando acesso ao servidor

    }
    
}
