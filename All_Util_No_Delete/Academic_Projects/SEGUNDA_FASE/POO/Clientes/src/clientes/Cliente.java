/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.util.Date;

/**
 *
 * @author Alunos
 */
public class Cliente {

    private String nmCliente;
    private String nuCpf;
    private Date dtNascimento;

    public Cliente(String str) {
        this.nmCliente = str;
    }
    
    public Cliente(String str, String numeroCpf) {
        this.nmCliente = str;
        this.nuCpf = numeroCpf;
    }
    
    public Cliente(String str, String numeroCpf, Date data) {
        this.nmCliente = str;
        this.nuCpf = numeroCpf;
        this.dtNascimento = data;
    }
    
    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public String getNuCpf() {
        return nuCpf;
    }

    public void setNuCpf(String nuCpf) {
        this.nuCpf = nuCpf;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cliente) {
            Cliente c = (Cliente) obj;
            return this.nuCpf.equals(c.getNuCpf())
                    && this.nmCliente.equalsIgnoreCase(c.getNmCliente());
        }
        return this.nuCpf.equals(obj.toString());
    }
    
}
