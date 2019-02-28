/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outrathread;

/**
 *
 * @author Alunos
 */
public class MeuProcesso implements Runnable {

    private Long inicio;
    private Long fim;
    private Long soma;

    public Long getInicio() {
        return inicio;
    }

    public void setInicio(Long inicio) {
        this.inicio = inicio;
    }

    public Long getFim() {
        return fim;
    }

    public void setFim(Long fim) {
        this.fim = fim;
    }

    public Long getSoma() {
        return soma;
    }

    public void setSoma(Long soma) {
        this.soma = soma;
    }

    public MeuProcesso(Long inicio, Long fim) {
        this.inicio = inicio;
        this.fim = fim;
        this.soma = 0L;
    }

    @Override
    public void run() {
        System.out.println("Iniciando " + soma);
        for (long i = inicio; i <= fim; i++) {
            soma += i;
        }
    }

}
