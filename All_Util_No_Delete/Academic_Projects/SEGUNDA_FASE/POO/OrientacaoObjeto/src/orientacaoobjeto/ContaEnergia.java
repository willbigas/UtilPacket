/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoobjeto;

/**
 *
 * @author Alunos
 */
public class ContaEnergia {
    
    private String nome;
    private String tipo;
    private Integer numero;
    private Double pcIcms;
    private Integer leituraAtual;
    private Integer leituraAnterior;
    private Integer media;
    private Double valorConsumoFaturado;
    private Double valorConsumoTotal;
    private Double valorTarifa;
    
    double obterValorTotal() {
        Integer consumo = leituraAtual - leituraAnterior;
        valorConsumoTotal = consumo * valorTarifa;
        return valorConsumoTotal;
    }
    
    public void setNome(String nome) {
        this.nome = "CLIENTE: " + nome;
    }
    
    public String getNome() {
        return this.nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getPcIcms() {
        return pcIcms;
    }

    public void setPcIcms(Double pcIcms) {
        this.pcIcms = pcIcms;
    }

    public Integer getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(Integer leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public Integer getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(Integer leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    public Integer getMedia() {
        return media;
    }

    public void setMedia(Integer media) {
        this.media = media;
    }

    public Double getValorConsumoFaturado() {
        return valorConsumoFaturado;
    }

    public void setValorConsumoFaturado(Double valorConsumoFaturado) {
        this.valorConsumoFaturado = valorConsumoFaturado;
    }

    public Double getValorConsumoTotal() {
        return valorConsumoTotal;
    }

    public void setValorConsumoTotal(Double valorConsumoTotal) {
        this.valorConsumoTotal = valorConsumoTotal;
    }

    public Double getValorTarifa() {
        return valorTarifa;
    }

    public void setValorTarifa(Double valorTarifa) {
        this.valorTarifa = valorTarifa;
    }
    
    
}
