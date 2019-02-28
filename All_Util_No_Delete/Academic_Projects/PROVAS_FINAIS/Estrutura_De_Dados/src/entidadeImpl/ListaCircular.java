package entidadeImpl;

import br.com.entidade.NoDuplo;
import br.com.negocio.Lista;

/**
 *
 * @author WILL-PC
 */
public class ListaCircular implements Lista {

    private Integer tamanho;
    private NoDuplo inicio;

    public ListaCircular() {
        this.tamanho = 0;
    }

    public Object pegarProximo() {
        if (inicio != null) {
            Object auxiliar = inicio.getElemento();
            remover(inicio.getElemento());
            return auxiliar;
        } else {
            return null;
        }
    }

    @Override
    public void adicionar(Object objeto) {
        NoDuplo novoElemento = new NoDuplo();
        novoElemento.setElemento(objeto);
        if (null == inicio) {
            inicio = novoElemento;
            inicio.setAnterior(inicio);
            inicio.setProximo(inicio);
            tamanho++;
        } else {
            NoDuplo auxiliar = inicio;
            for (int i = 1; i < tamanho; i++) {
                auxiliar = auxiliar.getProximo();
            }
            auxiliar.setProximo(novoElemento);
            novoElemento.setAnterior(auxiliar);
            novoElemento.setProximo(inicio);
            inicio.setAnterior(novoElemento);
            tamanho++;
        }
    }

    @Override
    public void adicionar(Object objeto, Integer posicao) {
        NoDuplo novoElemento = new NoDuplo();
        novoElemento.setElemento(objeto);

        if (posicao > tamanho) {
            throw new UnsupportedOperationException("Posição inexistente.");
        }

        if (posicao.equals(1)) {
            NoDuplo proximo = inicio;
            NoDuplo anterior = inicio.getAnterior();
            inicio = novoElemento;
            inicio.setProximo(proximo);
            inicio.setAnterior(anterior);
            anterior.setProximo(inicio);
            proximo.setAnterior(inicio);
            tamanho++;
        } else {
            NoDuplo auxiliar = inicio;
            for (int i = 1; i < tamanho; i++) {
                auxiliar = auxiliar.getProximo();
            }

            NoDuplo proximo = auxiliar;
            NoDuplo anterior = auxiliar.getAnterior();
            auxiliar = novoElemento;
            auxiliar.setProximo(proximo);
            auxiliar.setAnterior(anterior);
            anterior.setProximo(auxiliar);
            proximo.setAnterior(auxiliar);
            tamanho++;
        }
    }

    @Override
    public Object buscar(Object objeto) {
        if (inicio == null) {
            return null;
        }
        NoDuplo auxiliar = inicio;
        if (objeto.equals(auxiliar.getElemento())) {
            return auxiliar.getElemento();
        } else {
            for (int i = 1; i < tamanho; i++) {
                auxiliar = auxiliar.getProximo();
                if (objeto.equals(auxiliar.getElemento())) {
                    return auxiliar.getElemento();
                }
            }
        }
        return null;
    }

    @Override
    public Object buscar(Integer posicao) {
        if (posicao > tamanho || posicao <= 0 || tamanho <= 0) {
            return null;
        }
        NoDuplo auxiliar = inicio;
        Integer indice = 1;
        while (!indice.equals(posicao)) {
            auxiliar = auxiliar.getProximo();
            indice++;
        }
        return auxiliar.getElemento();
    }

    @Override
    public Boolean remover(Object objeto) {
        if (inicio == null) {
            return false;
        }
        Integer posicao = 1;
        NoDuplo auxiliar = inicio;
        while (posicao <= tamanho) {
            if (auxiliar.getElemento().equals(objeto)) {
                remover(posicao);
                posicao = tamanho;
            } else {
                auxiliar = auxiliar.getProximo();
            }
            posicao++;
        }
        return true;
    }

    @Override
    public Boolean remover(Integer posicao) {
        if (posicao > tamanho || posicao <= 0 || tamanho <= 0) {
            return false;
        }

        if (posicao.equals(1)) {
            if (tamanho == 1) {
                inicio = null;
                tamanho = 0;
            } else {
                NoDuplo anterior = inicio.getAnterior();
                inicio = inicio.getProximo();
                inicio.setAnterior(anterior);
                anterior.setProximo(inicio);
                tamanho--;
            }
        } else {
            NoDuplo auxiliar = inicio;
            Integer indice = 1;
            while (!posicao.equals(indice)) {
                auxiliar = auxiliar.getProximo();
                indice++;
            }
            auxiliar.getAnterior().setProximo(auxiliar.getProximo());
            auxiliar.getProximo().setAnterior(auxiliar.getAnterior());
            tamanho--;
        }
        return true;
    }

    @Override
    public Integer tamanho() {
        return tamanho;
    }

    @Override
    public Boolean existe(Object objeto) {
        if (inicio == null) {
            return false;
        }
        NoDuplo auxiliar = inicio;
        if (objeto.equals(auxiliar.getElemento())) {
            return true;
        } else {
            for (int i = 1; i < tamanho; i++) {
                auxiliar = auxiliar.getProximo();
                if (objeto.equals(auxiliar.getElemento())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String texto = "";
        if (this.tamanho > 0) {
            NoDuplo auxiliar = inicio;
            for (int i = 0; i < tamanho; i++) {
                texto += auxiliar.getElemento().toString() + ", ";
                auxiliar = auxiliar.getProximo();
            }
        }
        if (texto.length() > 0) {
            texto = texto.substring(0, texto.length() - 2);
        }
        return texto;
    }

}
