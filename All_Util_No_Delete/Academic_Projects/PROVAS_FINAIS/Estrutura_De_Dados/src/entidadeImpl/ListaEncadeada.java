
package entidadeImpl;

import br.com.negocio.Lista;
import br.com.entidade.No;

/**
 *
 * @author WILL-PC
 */
public class ListaEncadeada implements Lista {

    private No inicio;
    private Integer tamanho;

    public Object getProximo() {
        if (inicio != null) {
            Object auxiliar = inicio.getElemento();
            remover(inicio.getElemento());
            return auxiliar;
        } else {
            return null;
        }
    }

    public ListaEncadeada() {
        this.tamanho = 0;
    }

    @Override
    public void adicionar(Object objeto) {
        No novoElemento = new No();
        novoElemento.setElemento(objeto);
        if (null == inicio) {
            inicio = novoElemento;
            tamanho++;
        } else {
            No auxiliar = inicio;
            while (auxiliar.getProximo() != null) {
                auxiliar = auxiliar.getProximo();
            }
            auxiliar.setProximo(novoElemento);
            tamanho++;
        }
    }

    @Override
    public void adicionar(Object objeto, Integer posicao) {
        No novoElemento = new No();
        novoElemento.setElemento(objeto);

        if (posicao > tamanho) {
            throw new UnsupportedOperationException("Posição inexistente.");
        }

        if (posicao.equals(1)) {
            No auxiliar = inicio;
            inicio = novoElemento;
            inicio.setProximo(auxiliar);
            tamanho++;
        } else {
            No auxiliar = inicio;
            Integer indice = 1;
            while (!posicao.equals(indice + 1)) {
                auxiliar = auxiliar.getProximo();
                indice++;
            }
            No temporario = auxiliar.getProximo();
            novoElemento.setProximo(temporario);
            auxiliar.setProximo(novoElemento);
            tamanho++;
        }
    }

    @Override
    public Object buscar(Object objeto) {
        if (inicio == null) {
            return null;
        }
        No auxiliar = inicio;
        if (objeto.equals(auxiliar.getElemento())) {
            return auxiliar.getElemento();
        } else {
            while (auxiliar.getProximo() != null) {
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
        No auxiliar = inicio;
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
        No auxiliar = inicio;
        while (posicao <= tamanho) {
            if (auxiliar.getElemento().equals(objeto)) {
                remover(posicao);
                posicao = tamanho;
            }
            auxiliar = auxiliar.getProximo();
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
            inicio = inicio.getProximo();
            tamanho--;
        } else {
            No anterior = null;
            No auxiliar = inicio;
            Integer indice = 1;
            while (!posicao.equals(indice)) {
                anterior = auxiliar;
                auxiliar = auxiliar.getProximo();
                indice++;
            }
            anterior.setProximo(auxiliar.getProximo());
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
        No auxiliar = inicio;
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
            No auxiliar = inicio;
            while (auxiliar != null) {
                texto += auxiliar.getElemento().toString() + ",";
                auxiliar = auxiliar.getProximo();
            }
            if (texto.length() > 0) {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        return texto;
    }

    public boolean isVazio() {
        if (inicio == null) {
            return true;
        }
        return false;
    }
    
    public void vizualizarFila() {
        No aux = inicio;
        while (aux != null) {
            System.out.print(" {" + aux.getElemento() + "} ");
            aux = aux.getProximo();
        }
        System.out.println("");
    }

}
