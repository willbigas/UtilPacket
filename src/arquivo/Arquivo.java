package arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Utilitario para Leitura e Escrita de Arquivo
 *
 * @author William Bigas Mauro
 * @since 29/08/2018
 */
public class Arquivo {


    /**
     * Pegando a quantidade de linhas de um Arquivo
     *
     * @param nomeArquivo - Endereco do Arquivo "pasta/arquivo.txt"
     * @return Integer
     * @throws Exception
     */
    public static Integer pegaQtdLinhasArquivo(String nomeArquivo) throws Exception {
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
