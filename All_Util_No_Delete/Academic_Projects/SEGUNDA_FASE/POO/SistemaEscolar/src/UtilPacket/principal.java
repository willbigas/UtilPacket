
package UtilPacket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class principal {

    public static void main(String[] args) {
        
        List<Integer> teste = new ArrayList<>();
        
        teste.add(2);
        teste.add(4);
        teste.add(6);
        
       Integer teste2 = Collections.max(teste);
       Integer teste3 = Collections.min(teste);
        System.out.println(teste3);
        
      
        
        
        
        
    }

}
