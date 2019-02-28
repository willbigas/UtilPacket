/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.entidade;

/**
 *
 * @author Felipe
 */
public class Telefone {

    private Integer id;
    private String numero;
    private String tipo;
    private Integer ddd;
    private Usuario usuario;

    public Telefone() {
        
    }
    public Telefone(String numero, String tipo, Integer ddd) {
        this.numero = numero;
        this.tipo = tipo;
        this.ddd = ddd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return this.tipo + ": (" + this.ddd + ") " + this.numero;
    }

    
}
