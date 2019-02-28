package br.com.listas;

/**
 *
 * @author Alunos
 */
public class No {

    private Object elemento;
    private No anterior;
    private No proximo;

    public No() {
    }

    public No(Object object) {
        this.elemento = object;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return elemento + " -> " + proximo;
    }

}
