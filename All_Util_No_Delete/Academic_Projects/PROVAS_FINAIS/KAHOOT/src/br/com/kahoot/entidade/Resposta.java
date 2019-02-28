package br.com.kahoot.entidade;

/**
 *
 * @author Alunos
 */
public class Resposta {

    private Integer id;
    private String resposta;
    private Boolean correta;
    private Pergunta pergunta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Boolean getCorreta() {
        return correta;
    }

    public void setCorreta(Boolean correta) {
        this.correta = correta;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    @Override
    public String toString() {
        return "Resposta{" + "id=" + id + ", resposta=" + resposta + ", correta=" + correta + '}';
    }

}
