package br.com.time;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import objetos.Partida;
import objetos.Time;

public class ManterPartidaNegocio {

    public static void adicListaDeNomesAListaDeTimes(List<Time> umTime, List<String> nomes) {
        for (int i = 0; i < 10; i++) {
            umTime.add(i, new Time(nomes.get(i), "A"));
        }
    }

    public static void imprimindoResultado(List<Time> resultado) {
        for (int i = 0; i < resultado.size(); i++) {

            System.out.println(resultado.get(i).getNome() + "|" + resultado.get(i).getPontos() + "|" + resultado.get(i).getVitorias());

        }
    }

    public static List<Time> gerandoResultado(List<Time> umTime) {
        List<Time> resultado = new ArrayList<>();
        for (int i = 0; i < umTime.size(); i++) {
            resultado.add(i, umTime.get(i));

        }
        return resultado;
    }

    public static void gerandoSegundaRodada(List<Time> umTime, Partida partida) {
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < umTime.size(); j++) {
                System.out.println("||||PARTIDA|||");
                partida.marcarJogo(umTime.get(i), umTime.get(j), new Date(), i);
                partida.jogar();
                System.out.println("Rodada 2 :" + umTime.get(i).getNome() + " Vitorias " + umTime.get(i).getVitorias().toString());
                System.out.println("Rodada 2 :" + umTime.get(j).getNome() + " Vitorias " + umTime.get(j).getVitorias().toString());
            }
        }
    }

    public static void gerandoPrimeiraRodada(List<Time> umTime, Partida partida) {
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < umTime.size(); j++) {
                System.out.println("||||PARTIDA|||");
                partida.marcarJogo(umTime.get(i), umTime.get(j), new Date(), i);
                partida.jogar();
                System.out.println("Rodada 1 :" + umTime.get(i).getNome() + " Vitorias " + umTime.get(i).getVitorias().toString());
                System.out.println("Rodada 1 :" + umTime.get(j).getNome() + " Vitorias " + umTime.get(j).getVitorias().toString());

            }
        }
    }

    public static void adicNomesAListaDeNomes(List<String> nomes) {
        nomes.add("Brasil");
        nomes.add("Belgica");
        nomes.add("Russia");
        nomes.add("Australia");
        nomes.add("Egito");
        nomes.add("Costa Rica");
        nomes.add("Uruguai");
        nomes.add("Brasil");
        nomes.add("Argentina");
        nomes.add("Peru");
    }

}
