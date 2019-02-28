package br.com.Principal;

import br.com.entidade.Posicao;
import entidadeImpl.Fila;
import entidadeImpl.Pilha;
import java.util.Objects;

/**
 *
 * @author WILL-PC
 */
public class Exercicio04 {

    private static Fila fila;
    private static Pilha pilha;
    private static Integer X;
    private static Integer Y;
    private static Lado ultimoLado;

    private static enum Lado {
        CIMA, BAIXO, DIREITA, ESQUERDA
    }

    public static void main(String[] args) {
        Integer[][] matriz = matrizSimples();
        Posicao posicaoInicial = new Posicao(0, 0);
        Posicao posicaoFinal = new Posicao(matriz.length - 1, matriz[0].length - 1);
        caminhoRobo(matriz, posicaoInicial, posicaoFinal);
    }

    public static void caminhoRobo(Integer[][] matriz, Posicao posicaoInicial, Posicao posicaoFinal) {
        fila = new Fila();
        pilha = new Pilha();
        fila.adicionar(posicaoInicial);
        pilha.empilhar(posicaoInicial);
        X = posicaoInicial.getX();
        Y = posicaoInicial.getY();
        while (!Objects.equals(X, posicaoFinal.getX()) || !Objects.equals(Y, posicaoFinal.getY())) {
            if (ultimoLado != Lado.CIMA) {
                cima(matriz);
            }
            if (ultimoLado != Lado.BAIXO) {
                baixo(matriz);
            }
            if (ultimoLado != Lado.ESQUERDA) {
                esquerda(matriz);
            }
            if (ultimoLado != Lado.DIREITA) {
                direita(matriz);
            }
        }
        System.out.println("#### Caminho Percorrido (Fila) #### \n\n" + fila);
        System.out.println("#### Caminho Percorrido (Pilha) #### \n\n" + pilha);
    }

    private static void cima(Integer[][] matriz) {
        if (X - 1 >= 0) {
            if (matriz[X - 1][Y].equals(0)) {
                X--;
                Posicao posicao = new Posicao(X, Y);
                fila.adicionar(posicao);
                pilha.empilhar(posicao);
                ultimoLado = Lado.BAIXO;
            }
        }
    }

    private static void baixo(Integer[][] matriz) {
        if (X + 1 < matriz.length) {
            if (matriz[X + 1][Y].equals(0)) {
                X++;
                Posicao posicao = new Posicao(X, Y);
                fila.adicionar(posicao);
                pilha.empilhar(posicao);
                ultimoLado = Lado.CIMA;
            }
        }
    }

    private static void direita(Integer[][] matriz) {
        if (Y + 1 < matriz[0].length) {
            if (matriz[X][Y + 1].equals(0)) {
                Y++;
                Posicao posicao = new Posicao(X, Y);
                fila.adicionar(posicao);
                pilha.empilhar(posicao);
                ultimoLado = Lado.ESQUERDA;
            }
        }
    }

    private static void esquerda(Integer[][] matriz) {
        if (Y - 1 >= 0) {
            if (matriz[X][Y - 1].equals(0)) {
                Y--;
                Posicao posicao = new Posicao(X, Y);
                fila.adicionar(posicao);
                pilha.empilhar(posicao);
                ultimoLado = Lado.DIREITA;
            }
        }
    }

    private static Integer[][] matrizSimples() {
        Integer[][] matriz = {
            {0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 0, 0, 0, 0, 0, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 0}};
        return matriz;
    }

}
