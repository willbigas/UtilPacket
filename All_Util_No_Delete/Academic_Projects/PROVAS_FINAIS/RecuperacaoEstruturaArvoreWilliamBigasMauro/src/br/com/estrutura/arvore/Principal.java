package br.com.estrutura.arvore;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Arvore a = new Arvore();
        a.adicionar(1);
        a.adicionar(3);
        a.adicionar(5);
        a.adicionar(7);

        System.out.println(a);

        if (a.existe(1)) {
            System.out.println("Numero Existe");
        } else {
            System.out.println("Não existe");
        }

        a.imprimirPreOrdem();

    }

}
