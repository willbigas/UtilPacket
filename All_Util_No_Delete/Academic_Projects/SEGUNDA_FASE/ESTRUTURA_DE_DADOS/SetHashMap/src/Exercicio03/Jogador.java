/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio03;

/**
 *
 * @author William
 */
public class Jogador implements Comparable<Jogador> {

    private String nome;
    private Integer pontos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    @Override
    public int compareTo(Jogador t) {
        return this.nome.compareTo(t.getNome());

    }

    @Override
    public String toString() {      // Corpo do Objeto
        return this.nome + " (" + this.pontos + ")";
    }

    /**
     * Sobrescrever o Equals para Comparar objetos.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Jogador) {
            Jogador c = (Jogador) obj;

            return this.nome.equalsIgnoreCase(c.getNome());
        }
        return this.nome.equals(obj.toString());
    }

}
