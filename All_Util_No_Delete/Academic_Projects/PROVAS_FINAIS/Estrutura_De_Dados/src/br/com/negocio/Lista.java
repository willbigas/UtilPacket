package br.com.negocio;

/**
 *
 * @author WILL-PC
 */
public interface Lista {
    public void adicionar(Object objeto);
    public void adicionar(Object objeto, Integer posicao);
    public Object buscar(Object objeto);
    public Object buscar(Integer posicao);
    public Boolean remover(Object objeto);
    public Boolean remover(Integer posicao);
    public Integer tamanho();
    public String toString();
    public Boolean existe(Object objeto);
}
