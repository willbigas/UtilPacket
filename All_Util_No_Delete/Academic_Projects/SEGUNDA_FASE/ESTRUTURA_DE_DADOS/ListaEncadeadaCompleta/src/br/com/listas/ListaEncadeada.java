package br.com.listas;

/**
 *
 * @author Alunos
 */
public class ListaEncadeada implements Lista {

    private Integer quantidade;
    private No inicio;
    private No fim;

    public ListaEncadeada() {
        this.quantidade = 0;

    }

    @Override
    public void adicionar(Object object) {
        No novo = new No();
        novo.setElemento(object);
        if (isVazio()) {
            novo.setAnterior(null);
            novo.setProximo(null);
            inicio = novo;
            fim = novo;
            quantidade++;
            return;
        }
        No atual = inicio;
        No proximo = atual.getProximo();
        No anterior = null;
        while (atual != null) {
            if (atual.getElemento() == object) {
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
            if (atual == null) {
                proximo = null;
            } else {
                proximo = atual.getProximo();
            }
        }
        if (anterior == null) { // se o nó for inserido no começo
            novo.setProximo(inicio);
            novo.setAnterior(null);
            inicio.setAnterior(novo);
            inicio = novo;
            quantidade++;
        } else if (atual == null) { // se o nó for inserido no final
            novo.setProximo(null);
            anterior.setProximo(novo);
            novo.setAnterior(anterior);
            fim = novo;
            quantidade++;
        } else { // Se o nó for inserido no meio
            novo.setProximo(atual);
            novo.setAnterior(anterior);
            atual.setAnterior(novo);
            anterior.setProximo(novo);
            quantidade++;
        }
    }

    @Override
    public void adicionar(Integer posicao, Object object) {
        if (posicao < 0) { // Se posicao for < 0 , sai do metodo
            System.out.println("Posicao Não existente na lista!");
            return;
        }
        if (posicao > quantidade) {
            System.out.println("Posicao Maior que a quantidade de elementos da lista!");
            return;
        }
        No novo = new No();
        novo.setElemento(object);

        if (posicao == 0) { // se for na primeira posicao
            novo.setProximo(inicio);
            novo.setAnterior(null);
            inicio.setAnterior(novo);
            inicio = novo;
            quantidade++;
            return;
        }

        // Posicionando atual e proximo na posicao que se deseja inserir o item//
        No atual, proximo;
        atual = inicio;
        proximo = atual.getProximo();
        for (int i = 1; i < posicao && atual.getProximo() != null; i++) {
            atual = atual.getProximo();
            proximo = atual.getProximo();
        }

        // Ajusta a ligação do novo Nó //
        novo.setProximo(atual.getProximo());
        novo.setAnterior(atual);
        atual.setProximo(novo);
        quantidade++;
        /**
         * Caso for no final ajusta o Nó no final e caso for meio ajusta o nó
         * anterior*
         */
        if (novo.getProximo() == null) {
            fim = novo;
        } else {
            proximo.setAnterior(novo);
        }

    }

    @Override
    public void adicionarUltimo(Object object) {
        No novo = new No();
        novo.setElemento(object);
        novo.setProximo(null);
        if (isVazio()) {
            novo.setAnterior(null);
            inicio = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);

        }
        this.fim = novo;
        this.quantidade++;

    }

    @Override
    public Object buscar(Object object) {
        No auxiliar = inicio;
        while (auxiliar != null) {
            if (auxiliar.getElemento().equals(object)) {
                return auxiliar.getElemento();
            }
            auxiliar = auxiliar.getProximo();
        }
        return null;
    }

    @Override
    public Object buscar(Integer posicao) {
        No auxiliar = inicio;
        Integer numero = 0;
        while (auxiliar != null) {
            if (posicao.equals(numero)) {
                return auxiliar.getElemento();

            } else {
                numero++;
                auxiliar = auxiliar.getProximo();
            }

        }

        return null;
    }

    @Override
    public boolean removerInicio() {
        No auxiliar = inicio;
        while (auxiliar != null) {

            inicio = auxiliar.getProximo();
            return true;
        }
        return false;
    }

    @Override
    public boolean remover(Object object) {
        No atual, anterior, proximo;
        anterior = null;
        atual = inicio;
        proximo = atual.getProximo();
        while (atual != null) {
            if (atual.getElemento() == object) {
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
            if (atual != null) {
                proximo = atual.getProximo();
            }
        }
        if (atual == null) {
            return false;
        }
        if (atual == inicio && atual == fim) {
            inicio = fim = null;
        } else if (atual == inicio) {
            inicio = inicio.getProximo();
            inicio.setAnterior(null);
            return true;
        } else if (atual.getProximo() == null) {
            fim = anterior;
            fim.setProximo(null);
            return true;
        } else {
            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
            return true;
        }
        return false;
    }

    @Override
    public boolean remover(Integer posicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer tamanho() {
        Integer tamanho = this.quantidade;
        return tamanho;
    }

    @Override
    public String toString() {
        return "inicio - >" + inicio + '}';
    }

    @Override
    public boolean isVazio() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    @Override
    public Object inicio() {
        return inicio.getElemento();
    }

    @Override
    public Object fim() {
        return fim.getElemento();
    }

    @Override
    public void imprimirDoInicio() {
        No aux = inicio;
        while (aux != null) {
            System.out.println(" {" + aux.getElemento() + "} ");
            aux = aux.getProximo();
        }
        System.out.println("");
    }

    @Override
    public void imprimirDoFim() {
        No aux = fim;
        while (aux != null) {
            System.out.println(" {" + aux.getElemento() + "} ");
            aux = aux.getAnterior();
        }
        System.out.println("");
    }

}
