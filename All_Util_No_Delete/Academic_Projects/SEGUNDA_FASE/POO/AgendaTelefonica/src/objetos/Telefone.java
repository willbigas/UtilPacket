/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.io.Serializable;

/**
 *
 * @author William
 */
public class Telefone implements Serializable{
    private String telefone;
    private String ddd;
    private String numero;

    public Telefone(String telefone, String ddd, String numero) {
        this.telefone = telefone;
        this.ddd = ddd;
        this.numero = numero;
    }
    
    

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + ddd + ")" + telefone + "," + numero;
    }
    
    
    
    
}
