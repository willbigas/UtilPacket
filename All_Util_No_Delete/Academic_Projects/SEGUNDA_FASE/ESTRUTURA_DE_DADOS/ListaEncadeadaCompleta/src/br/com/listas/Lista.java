package br.com.listas;

/**
 *
 * @author Alunos
 */
public interface Lista {

    public void adicionar(Object object);

    public void adicionar(Integer posicao, Object object);

    public void adicionarUltimo(Object object);

    public Object buscar(Object object);

    public Object buscar(Integer posicao);

    public boolean remover(Object object);

    public boolean remover(Integer posicao);

    public boolean removerInicio();

    public Integer tamanho();

    public String toString();

    public boolean isVazio();

    public Object inicio();

    public Object fim();
    
    public void imprimirDoInicio();
    
    public void imprimirDoFim();

}
