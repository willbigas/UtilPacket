package br.com.entidade;

/**
 *
 * @author WILL-PC
 */
public class No {
    private Object elemento;
    private No proximo;

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object nome) {
        this.elemento = nome;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
