package objetos;

public class Time implements Comparable<Time> {

    private String nome;
    private Integer pontos;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;
    private String serie;

    public Time(String nome, String serie) {
        this.nome = nome;
        this.pontos = 0;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.serie = serie;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPontos() {
        return pontos;
    }

    private void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    private void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    private void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void ganhaJogo() {
        setVitorias(getVitorias() + 1);
        setPontos(getPontos() + 3);
    }

    public void empataJogo() {
        setEmpates(getEmpates() + 1);
        setPontos(getPontos() + 1);
    }

    public void perdeJogo() {
        setDerrotas(getDerrotas() + 1);

    }

    @Override
    public String toString() {
        return "Time{" + "nome=" + nome + ", pontos=" + pontos + ", vitorias=" + vitorias + ", derrotas=" + derrotas + ", empates=" + empates + ", serie=" + serie + '}';
    }

    @Override
    public int compareTo(Time obj) {
        if (this.pontos <= ((Time) obj).getPontos()) {
            return 1;
        }
        return -1;
    }

}
