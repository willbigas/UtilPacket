
package Exercicio01;

/**
 *
 * @author William
 */
public abstract class Funcionario {

    public String nome;
    public String id;
    protected Double salario;
    public Double horasTR;
    public Integer anosTR;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getHorasTR() {
        return horasTR;
    }

    public void setHorasTR(Double horasTR) {
        this.horasTR = horasTR;
    }

    public Integer getAnosTR() {
        return anosTR;
    }

    public void setAnosTR(Integer anosTR) {
        this.anosTR = anosTR;
    }

    public Double obterSalario() {
        return this.getSalario();
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", id=" + id + ", salario=" + salario + ", horasTR=" + horasTR + ", anosTR=" + anosTR + '}';
    }
    
    

}
