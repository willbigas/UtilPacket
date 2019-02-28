package objetos;

import java.util.Date;
import java.util.Random;

public class Partida {

    private Date data;
    private String situacao;
    private Integer rodada;
    private Time mandante;
    private Time visitante;

    public Partida() {
        this.situacao = "pendente";

    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Integer getRodada() {
        return rodada;
    }

    public void setRodada(Integer rodada) {
        this.rodada = rodada;
    }

    public Time getMandante() {
        return mandante;
    }

    public void setMandante(Time mandante) {
        this.mandante = mandante;
    }

    public Time getVisitante() {
        return visitante;
    }

    public void setVisitante(Time visitante) {
        this.visitante = visitante;
    }

    public void marcarJogo(Time mandante, Time visitante, Date data, Integer rodada) {
        if (!mandante.getSerie().equalsIgnoreCase(visitante.getSerie())) {
            System.out.println("Não pode haver jogo entre times de série diferente");
            return;

        }
        if (mandante.getNome().equalsIgnoreCase(visitante.getNome())) {
            System.out.println("não pode haver jogo entre o mesmo Time");
            return;
        }

        this.rodada = rodada;
        this.data = data;
        this.mandante = mandante;
        this.visitante = visitante;
        this.situacao = "Confirmado";

    }

    public void jogar() {
        if (this.getSituacao().equals("Confirmado")) {
            Random r = new Random();
            Integer random = r.nextInt(3);

            switch (random) {
                case 0:
                    mandante.ganhaJogo();
                    visitante.perdeJogo();
                    System.out.println("Mandante " + mandante.getNome() + " Ganhou!");
                    System.out.println("Visitante " + visitante.getNome() + " Perdeu");
                    break;
                case 1:
                    mandante.perdeJogo();
                    visitante.ganhaJogo();
                    System.out.println("Mandante " + mandante.getNome() + " Perdeu!");
                    System.out.println("Visitante " + visitante.getNome() + " Ganhou!");
                    break;
                case 2:
                    mandante.empataJogo();
                    visitante.empataJogo();
                    System.out.println("Empatou!");
                    break;
            }
        } else {
            System.out.println("A partida não pode ser disputada!");
        }

    }

    public void verificarSeJogou() {

    }

}
