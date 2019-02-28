package br.com.negocio;

/**
 *
 * @author WILL
 */
public interface Fila {

    public void adicionar(Object objeto);

    public Object remover();

    public Integer tamanho();
    
    public Boolean isVazia();
}
