package files;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author William
 */
public class LerArquivo {

    /**
     * Leitura Simples de arquivo concatenando em Linhas
     *
     * @param enderecoArq String do endereco do arquivo "pasta/pasta.txt"
     * @return String
     * @throws Exception
     */
    public static String lerArqParaJava(String enderecoArq) throws Exception {
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
     * @param enderecoArq - String do endereco do arquivo "pasta/pasta.txt"
     * @return String[]
     * @throws Exception
     */
    public static String[] lerArqArrayParaJava(String enderecoArq) throws Exception {
        String conteudo = lerArqParaJava(enderecoArq);
        String[] linhas = conteudo.split("\r\n");
        return linhas;
    }

    /**
     * Leitura de arquivo concatentando em linhas e retornando ArrayList
     *
     * @param enderecoArq - String de endereco do arquivo "pasta/pasta.txt"
     * @return List <String>
     * @throws Exception
     */
    public static List<String> lerArqArrayListParaJava(String enderecoArq) throws Exception {
        String conteudo = lerArqParaJava(enderecoArq);
        List<String> umaLinha = new ArrayList<>();
        String[] linhas = conteudo.split("\r\n");
        umaLinha.addAll(Arrays.asList(linhas));
        return umaLinha;
    }

    /**
     * Le Um Endereco de arquivo dentro do diretorio do projeto!
     *
     * @param classe Classe que está chamando o projeto.
     * @param enderecoArq Valor em String [SRC para frente] ex :
     * "/projeto/algo.txt"
     * @return
     */
    public static File lerEnderecoDeArquivo(Class classe, String enderecoArq) {
        File arquivo = new File(classe.getClass().getResource(enderecoArq).getFile());
        return arquivo;
    }

    /**
     * Abre um arquivo no Sistema Operacional, o SO se encarrega de decidir quem
     * vai abrir o arquivo baseado na extensão.
     *
     * @param arquivo
     */
    public static void abrirArquivo(File arquivo) {
        try {
            Desktop.getDesktop().open(arquivo);
        } catch (IOException iOException) {
        }
    }

    /**
     * Le um arquivo de um Endereco dentro do projeto e abre no Sistema
     * Operacional
     *
     * @param classe
     * @param enderecoArq
     */
    public static void leArqEAbreNoSO(Class classe, String enderecoArq) {
        File arquivo = lerEnderecoDeArquivo(classe, enderecoArq);
        abrirArquivo(arquivo);
    }

}
