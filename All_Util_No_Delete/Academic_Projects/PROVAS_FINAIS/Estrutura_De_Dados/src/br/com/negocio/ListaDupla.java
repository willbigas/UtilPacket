package br.com.negocio;

/**
 *
 * @author WILL-PC
 */
public interface ListaDupla {

    public void adicionar(Object objeto);

    public void adicionar(Object objeto, Integer posicao);

    public Boolean remover(Integer posicao);

    public String inverso();

    public Boolean existe(Object objeto);

}
