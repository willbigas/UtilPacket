package UtilPacket;

import java.util.List;

/**
 *
 * @author Alunos
 */
public class principal {

    public static void main(String[] args) {

        List<Double> numA = UtilList.numRandom(0.0, 10.0, 45);

        for (int i = 0; i < numA.size(); i++) {
            System.out.println(UtilFormat.decimalFormat(numA.get(i)));

        }

    }

}
