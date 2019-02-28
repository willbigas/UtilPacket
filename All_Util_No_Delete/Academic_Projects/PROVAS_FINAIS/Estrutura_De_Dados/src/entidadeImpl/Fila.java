package entidadeImpl;

import br.com.entidade.No;

/**
 *
 * @author WILL-PC
 */
public class Fila implements br.com.negocio.Fila{
    private No inicio;
    private Integer tamanho;
    
    public Fila() {
        tamanho = 0;
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
    public Object remover() {
        Object elemento = inicio.getElemento();
        inicio = inicio.getProximo();
        tamanho--;
        return elemento;
    }

    @Override
    public Integer tamanho() {
        return this.tamanho;
    }

    @Override
    public Boolean isVazia() {
        return inicio == null;
    }

    @Override
    public String toString() {
        String mensagem = "";
        No auxiliar = inicio;
        while (auxiliar != null) {
            mensagem += auxiliar.getElemento() + "\n";
            auxiliar = auxiliar.getProximo();
        }
        return mensagem;
    }
}
