package arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

/**
 *
 * @author William
 */
public class EscreverArquivo {
    
    
    /**
     * Escreve em arquivo, sobreescrevendo o conteudo ja escrito, se existir.
     *
     * @param enderecoArq - String de endereco do arquivo "pasta/pasta.txt" e
     * String de Conteudo
     * @param conteudo
     * @throws Exception
     */
    public static void escreverArqParaDesktop(String enderecoArq, String conteudo) throws Exception {
        FileWriter escritor = new FileWriter(enderecoArq);
        try (BufferedWriter buffer = new BufferedWriter(escritor)) {
            buffer.append(conteudo);
        }
    }

    /**
     * Escreve em arquivo, concatenando uma String
     *
     * @param enderecoArq - String de endereco do arquivo "pasta/pasta.txt" e
     * String de Conteudo
     * @param conteudo
     * @throws Exception
     */
    public static void escreverArqConcatParaDesktop(String enderecoArq, String conteudo) throws Exception {
        FileWriter escritor = new FileWriter(enderecoArq, true);
        try (BufferedWriter buffer = new BufferedWriter(escritor)) {
            buffer.append(conteudo + "\r\n");
        }
    }

    /**
     * Escreve em Arquivo concatenando uma Arraylist
     *
     * @param enderecoArq String de endereco do arquivo "pasta/pasta.txt" e uma
     * Lista de Strings do Conteudo
     * @param conteudo
     * @throws Exception
     */
    public static void escreverArqConcatParaDesktop(String enderecoArq, List<String> conteudo) throws Exception {
        FileWriter escritor = new FileWriter(enderecoArq, true);
        try (BufferedWriter buffer = new BufferedWriter(escritor)) {
            buffer.append(conteudo + "\r\n");
        }
    }
    
}
