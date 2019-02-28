package buscabinaria;

/**
 *
 * @author Alunos
 */
public class BuscaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] array = new Integer[500];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        Integer busca = 250;
        Integer indiceInicio = 0;
        Integer indiceFinal = array.length - 1;
        Boolean encontrou = false;
        while (!encontrou && indiceInicio <= indiceFinal) {
            Integer meio = (indiceInicio + indiceFinal) / 2;
            if (array[meio].equals(busca)) {
                encontrou = true;
            }
            if (array[meio] > busca) {
                indiceFinal = meio - 1;
            } else {
                indiceInicio = meio + 1;
            }

            if (encontrou) {
                System.out.println("Achou na posicao " + meio);
            }
        }

    }

}
