package br.com.Principal;

import br.com.entidade.Processo;
import entidadeImpl.ListaCircular;

/**
 *
 * @author WILL-PC
 */
public class Exercicio03 {

    private static ListaCircular LISTA_CIRCULAR;

    public static void main(String[] args) {
        listarProcessos();
        processar();

    }

    private static void listarProcessos() {
        Processo processoA = new Processo("Processo A", 72);
        Processo processoB = new Processo("Processo B", 90);
        Processo processoC = new Processo("Processo C", 68);
        Processo processoD = new Processo("Processo D", 55);
        Processo processoE = new Processo("Processo E", 47);

        LISTA_CIRCULAR = new ListaCircular();
        LISTA_CIRCULAR.adicionar(processoA);
        LISTA_CIRCULAR.adicionar(processoB);
        LISTA_CIRCULAR.adicionar(processoC);
        LISTA_CIRCULAR.adicionar(processoD);
        LISTA_CIRCULAR.adicionar(processoE);
    }

    private static void processar() {
        Object elemento = LISTA_CIRCULAR.pegarProximo();
        while (elemento != null) {
            Processo processo = (Processo) elemento;
            if (processo.getTempo() < 10) {
                processo.setTempo(processo.getTempo() - (processo.getTempo() % 10));
            } else {
                processo.setTempo(processo.getTempo() - 10);
                LISTA_CIRCULAR.adicionar(processo);
            }
            System.out.println(processo.getNome() + " |>> " + processo.getTempo());

            elemento = LISTA_CIRCULAR.pegarProximo();
        }

    }
}
