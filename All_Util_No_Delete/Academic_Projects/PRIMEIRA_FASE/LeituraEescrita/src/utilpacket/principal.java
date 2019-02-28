package utilpacket;

/**
 *
 * @author Alunos
 */
public class principal {

    public static void main(String[] args) {

        for (int i = 0; i < 25; i++) {
            if (UtilMath.numeroPrimo(i)) {
                System.out.println("Numero " + i + " é primo");
            } else {
                System.out.println("Numero " + i + " não é primo");
            }
        }

    }

}
