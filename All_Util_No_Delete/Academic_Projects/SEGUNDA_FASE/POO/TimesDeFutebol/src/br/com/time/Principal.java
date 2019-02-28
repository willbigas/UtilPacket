package br.com.time;

import objetos.Time;
import objetos.Partida;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<Time> umTime = new ArrayList<>();
        Partida partida = new Partida();

        ManterPartidaNegocio.adicNomesAListaDeNomes(nomes);
        ManterPartidaNegocio.adicListaDeNomesAListaDeTimes(umTime, nomes);
        ManterPartidaNegocio.gerandoPrimeiraRodada(umTime, partida);
        System.out.println("|||||||  RETURNO  |||||\r\n");
        ManterPartidaNegocio.gerandoSegundaRodada(umTime, partida);
        List<Time> resultado = ManterPartidaNegocio.gerandoResultado(umTime);
        Collections.sort(resultado);
        System.out.println("\r\n||PONTOS||\r\n");
        System.out.println("|Nome||P||V|");
        ManterPartidaNegocio.imprimindoResultado(resultado);
    }

}
