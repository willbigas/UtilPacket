package br.com.negocio;

/**
 *
 * @author WILL
 */
public interface Pilha {

    public void empilhar(Object objeto);

    public Object desempilhar();

    public Integer tamanho();

    public Boolean isVazia();
}
