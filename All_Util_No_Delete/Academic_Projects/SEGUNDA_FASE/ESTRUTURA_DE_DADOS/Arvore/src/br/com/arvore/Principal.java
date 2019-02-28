package br.com.arvore;

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
        a.adicionar(15);
        a.adicionar(1);
        a.adicionar(2);

        System.out.println(a);

        if (a.existe(4)) {
            System.out.println("Numero Existe");
        } else {
            System.out.println("Não existe");
        }

        a.imprimirPreOrdem();

    }

}
