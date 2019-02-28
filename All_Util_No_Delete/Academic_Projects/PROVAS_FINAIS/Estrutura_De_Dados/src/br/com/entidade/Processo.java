package br.com.entidade;

/**
 *
 * @author WILL-PC
 */
public class Processo {

    private String nome;
    private Integer tempo;

    public Processo(String nome, Integer tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }
}
