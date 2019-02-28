package entidadeImpl;

import br.com.entidade.No;

/**
 *
 * @author WILL-PC
 */
public class Pilha implements br.com.negocio.Pilha{

    private No topo;
    private Integer tamanho;

    public Pilha() {
        tamanho = 0;
    }

    @Override
    public void empilhar(Object objeto) {
        No novoElemento = new No();
        novoElemento.setElemento(objeto);
        if (isVazia()) {
            topo = novoElemento;
        } else {
            No auxiliar = topo;
            novoElemento.setProximo(auxiliar);
            topo = novoElemento;
            tamanho++;
        }

    }

    @Override
    public Object desempilhar() {
        Object elemento = topo.getElemento();
        topo = topo.getProximo();
        tamanho--;
        return elemento;
    }

    @Override
    public Integer tamanho() {
        return this.tamanho;
    }

    @Override
    public Boolean isVazia() {
        return topo == null;
    }

    @Override
    public String toString() {
        String mensagem = "";
        No auxiliar = topo;
        while (auxiliar != null) {
            mensagem += auxiliar.getElemento() + "\n";
            auxiliar = auxiliar.getProximo();
        }
        return mensagem;
    }
}
