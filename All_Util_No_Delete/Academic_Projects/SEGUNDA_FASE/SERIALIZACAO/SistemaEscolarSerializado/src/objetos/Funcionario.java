/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.io.Serializable;

/**
 *
 * @author Alunos
 */
public class Funcionario extends Pessoa implements Serializable {

    private Integer pis;
    private String setor;

    public Funcionario(Integer pis, String setor) {
        this.pis = pis;
        this.setor = setor;
    }
    

    public Integer getPis() {
        return pis;
    }

    public void setPis(Integer pis) {
        this.pis = pis;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void alteraSetor(String novoSetor) {
        this.setSetor(novoSetor);
    }

    @Override
    public String toString() {
        return "Funcionario{" + "pis=" + pis + ", setor=" + setor + '}';
    }

    
    
    
}
