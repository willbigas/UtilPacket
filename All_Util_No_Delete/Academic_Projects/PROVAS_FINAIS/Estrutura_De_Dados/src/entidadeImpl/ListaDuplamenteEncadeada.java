package entidadeImpl;

import br.com.entidade.NoDuplo;
import br.com.negocio.ListaDupla;

/**
 *
 * @author WILL-PC
 */
public class ListaDuplamenteEncadeada implements ListaDupla {

    private Integer tamanho;
    private NoDuplo inicio;

    public ListaDuplamenteEncadeada() {
        this.tamanho = 0;
    }

    @Override
    public void adicionar(Object objeto) {
        NoDuplo novoElemento = new NoDuplo();
        novoElemento.setElemento(objeto);
        if (null == inicio) {
            inicio = novoElemento;
            tamanho++;
        } else {
            NoDuplo auxiliar = inicio;
            while (auxiliar.getProximo() != null) {
                auxiliar = auxiliar.getProximo();
            }
            auxiliar.setProximo(novoElemento);
            novoElemento.setAnterior(auxiliar);
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
            NoDuplo auxiliar = inicio;
            inicio = novoElemento;
            inicio.setProximo(auxiliar);
            auxiliar.setAnterior(inicio);
            tamanho++;
        } else {
            NoDuplo auxiliar = inicio;
            Integer indice = 1;
            while (!posicao.equals(indice + 1)) {
                auxiliar = auxiliar.getProximo();
                indice++;
            }
            NoDuplo temporario = auxiliar.getProximo();
            novoElemento.setProximo(temporario);
            if (temporario != null) {
                temporario.setAnterior(novoElemento);
            }
            auxiliar.setProximo(novoElemento);
            novoElemento.setAnterior(auxiliar);
            tamanho++;
        }
    }

    @Override
    public Boolean remover(Integer posicao) {
        if (posicao > tamanho || posicao <= 0 || tamanho <= 0) {
            return false;
        }

        if (posicao.equals(1)) {
            inicio = inicio.getProximo();
            if (inicio != null) {
                inicio.setAnterior(null);
            }
            tamanho--;
        } else {
            NoDuplo auxiliar = inicio;
            Integer indice = 1;
            while (!posicao.equals(indice)) {
                auxiliar = auxiliar.getProximo();
                indice++;
            }
            auxiliar.getAnterior().setProximo(auxiliar.getProximo());
            if (auxiliar.getProximo() != null) {
                auxiliar.getProximo().setAnterior(auxiliar.getAnterior());
            }
            tamanho--;
        }
        return true;
    }

    @Override
    public String inverso() {
        String texto = "";
        NoDuplo auxiliar = inicio;
        while (auxiliar.getProximo() != null) {
            auxiliar = auxiliar.getProximo();
        }
        while (auxiliar != null) {
            texto += auxiliar.getElemento().toString() + ", ";
            auxiliar = auxiliar.getAnterior();
        }
        if (texto.length() > 0) {
            texto = texto.substring(0, texto.length() - 1);
        }
        return texto;
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
            while (auxiliar.getProximo() != null) {
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
            while (auxiliar != null) {
                texto += auxiliar.getElemento().toString() + " > ";
                auxiliar = auxiliar.getProximo();
            }
            if (texto.length() > 0) {
                texto = texto.substring(0, texto.length() - 2);
            }
        }
        return texto;
    }

}
