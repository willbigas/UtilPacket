/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sethashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Exercicio02 {

    private static List<String> LINHALIMPA = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        List<String> linhaSuja = UtilPacket.UtilArquivo.lerArqArrayList("cestinhas.txt");

        /**
         * Tirando Titulo das Linhas
         */
        for (int i = 0; i < linhaSuja.size(); i++) {
            if (!linhaSuja.get(i).startsWith("-")) {
                LINHALIMPA.add(linhaSuja.get(i));
            }
        }

        String mensagemJogador = JOptionPane.showInputDialog(null, "Qual Jogador você quer pesquisar?");
        String mensagemRodada = JOptionPane.showInputDialog(null, "Qual Rodada você quer pesquisar?");
        Integer rodada = Integer.valueOf(mensagemRodada);

        List<String> rodadasPesquisa = new ArrayList<>();
        for (int i = 0; i < LINHALIMPA.size(); i++) {
            if (LINHALIMPA.get(i).startsWith(mensagemJogador)) {

                rodadasPesquisa.add(LINHALIMPA.get(i));
            }

        }
        String resultado = null;
        String resultadoPesquisa = null;
        System.out.println("|| PESQUISA DE JOGADORES ||");
        for (int i = 0; i < rodadasPesquisa.size(); i++) {
            resultado = rodadasPesquisa.get(rodada - 1);
            String camposDoResultado[] = resultado.split(";");
            resultadoPesquisa = "O Jogador: " + camposDoResultado[0] + " Nesta rodada fez " + camposDoResultado[1] + " Gols";
        }

        System.out.println(resultadoPesquisa + "\r\n");

    }
}
