/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author William
 */
public class Principal {

    private static final List<Jogador> listaJogadores = new ArrayList<Jogador>();

    private static final List<String> LINHALIMPA = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        List<String> linhaSuja = UtilPacket.UtilArquivo.lerArqArrayList("cestinhas.txt");
        Map<String, Integer> totalDeCestasJogadores = new HashMap<>();

        /**
         * Tirando Titulo das Linhas
         */
        for (int i = 0; i < linhaSuja.size(); i++) {
            if (!linhaSuja.get(i).startsWith("-")) {
                LINHALIMPA.add(linhaSuja.get(i));
            }
        }

        for (int i = 0; i < LINHALIMPA.size(); i++) {
            String umCampo[] = LINHALIMPA.get(i).split(";");

            listaJogadores.add(new Jogador());
            listaJogadores.get(i).setNome(umCampo[0]);
            listaJogadores.get(i).setPontos(Integer.valueOf(umCampo[1]));

        }
        
        System.out.println("Lista Desordenada: " + listaJogadores);
        Collections.sort(listaJogadores);

        System.out.println("Lista Ordenada por Nome: " + listaJogadores);

        listaJogadores.sort((Jogador t, Jogador t1) -> t.getPontos().compareTo(t1.getPontos()));
        
        System.out.println("Lista Ordenada por Pontos" + listaJogadores);

    }

}
