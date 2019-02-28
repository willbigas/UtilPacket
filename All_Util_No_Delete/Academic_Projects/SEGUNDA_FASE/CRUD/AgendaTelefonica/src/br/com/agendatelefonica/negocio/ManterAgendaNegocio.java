package br.com.agendatelefonica.negocio;

import br.com.agendatelefonica.dominio.Contato;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class ManterAgendaNegocio {

    private static List<Contato> CONTATOS = new ArrayList();

    public static void adicionar(Contato contato) {
        CONTATOS.add(contato);
    }

    public static List<Contato> pesquisar(String termo) {
        List<Contato> retorno = new ArrayList();
        for (Contato contato : CONTATOS) {
            if (contato.getNome().toLowerCase().contains(termo.toLowerCase())) {
                retorno.add(contato);
            }
        }
        return retorno;
    }

}
