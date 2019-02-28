package br.com.Principal;

import entidadeImpl.ListaCircular;
import entidadeImpl.ListaDuplamenteEncadeada;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author WILL-PC
 */
public class Exercicio07 {

    private static ListaCircular lista;
    private static ListaDuplamenteEncadeada chutes;
    private static Integer acerto;
    private static Integer erro;
    private static Integer[] palavraControle;
    private static String palavraSorteada;

    public static void main(String[] args) {
        iniciar();

        String mensagem = joga("");
        System.out.println(palavraSorteada);
        while (acerto < palavraSorteada.length() && erro < 5) {
            String letra = JOptionPane.showInputDialog(mensagem);
            if (letra.length() > 1 || letra.length() == 0) {
                JOptionPane.showMessageDialog(null, "Insira apenas uma letra!");
            } else {
                if (chutes.existe(letra)) {
                    JOptionPane.showMessageDialog(null, "Você já inseriu essa letra!");
                } else {
                    chutes.adicionar(letra);
                    mensagem = joga(letra);
                }               
            }
        }
        if(acerto < palavraSorteada.length()){
            JOptionPane.showMessageDialog(null, "Você perdeu!\n" + chutes.inverso());
        }else{
            JOptionPane.showMessageDialog(null, "Você ganhou!\n" + chutes.inverso());
        }
    }

    private static String joga(String letra) {
        String display = "";
        if (letra.length() > 0) {
            if (palavraSorteada.contains(letra)) {
                for (int i = 0; i < palavraSorteada.length(); i++) {
                    if (String.valueOf(palavraSorteada.charAt(i)).equals(letra)) {
                        palavraControle[i] = 1;
                        acerto++;
                    }
                }
            } else {
                erro++;
            }
        }

        for (int i = 0; i < palavraControle.length; i++) {
            if (palavraControle[i].equals(1)) {
                display += " " + palavraSorteada.charAt(i) + " ";
            } else {
                display += " _ ";
            }
        }
        display += "\n\nAcertos: " + acerto + " | Erros: " + erro;
        display += "\nLetras: " + chutes;
        return display;
    }

    private static void iniciar() {
        lista = new ListaCircular();
        chutes = new ListaDuplamenteEncadeada();
        lerArquivo();
        palavraSorteada = sortearPalavra();
        palavraControle = new Integer[palavraSorteada.length()];
        for (int i = 0; i < palavraControle.length; i++) {
            palavraControle[i] = 0;
        }
        acerto = 0;
        erro = 0;
    }

    private static void lerArquivo() {
        File arquivo = new File("palavras.txt");
        if (!arquivo.exists()) {
            JOptionPane.showMessageDialog(null, "Arquivo 'palavras.txt' não encontrado!");
            return;
        }
        FileReader leitor;
        try {
            leitor = new FileReader(arquivo);
            BufferedReader buffer = new BufferedReader(leitor);
            String linhaInteira = buffer.readLine();
            while (linhaInteira != null) {
                lista.adicionar(linhaInteira);
                linhaInteira = buffer.readLine();
            }
        } catch (Exception ex) {
            Logger.getLogger(Exercicio07.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static String sortearPalavra() {
        Random r = new Random();

        if (lista.tamanho() > 0) {
            Integer num = r.nextInt(lista.tamanho());
            num++;
            return (String) lista.buscar(num);
        } else {
            return null;
        }
    }

}
