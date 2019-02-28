package br.com.listas;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ListaEncadeada l = new ListaEncadeada();
        l.adicionar("teste");
        l.adicionar(0, "teste 3");
        
        System.out.println(l);
    }

}
