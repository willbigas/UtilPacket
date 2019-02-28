package br.com.Principal;

import entidadeImpl.ListaDuplamenteEncadeada;

/**
 *
 * @author WiLL-PC
 */
public class Exercicio01 {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
        l.adicionar("João");
        System.out.println("João Adicionado - " + l);
        l.adicionar("Maria");
        System.out.println("Maria Adicionada - " + l);
        l.adicionar("Paula");
        System.out.println("Paula Adicionada - " + l);
        l.adicionar("Pedro"); 
        System.out.println("Pedro Adicionado - " + l);
        l.remover(1);
        System.out.println("Depois de remover o Primeiro - " + l);
        l.adicionar("José");
        System.out.println("José Adicionado - " + l);
        l.remover(1);
        System.out.println("Depois de remover o primeiro novamente. - " + l);
        l.adicionar("João");
        System.out.println("João Adicionado - " + l);
        l.adicionar("Marcelo");
        System.out.println("Marcelo Adicionado - " + l);
        l.adicionar("Maria", 1);
        System.out.println("Maria Adicionada - " + l);

        System.out.println(l);
        System.out.println(l.inverso());
    }
}
