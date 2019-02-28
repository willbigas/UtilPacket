package UtilPacket;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class principal {

    public static void main(String[] args) throws Exception {
        
        List<String> teste = new ArrayList<>();
        
        teste.add("William");
        teste.add("Gabriel");
        teste.add("Felipe");
        teste.add("Junior");
        
        
        System.out.println("LISTA" + teste);
           
        UtilSerializar.escreverSerializando("teste.txt", teste);
        
                                                    List lerObjStream = UtilSerializar.lerSerializando("teste.txt", teste);
        
        
        System.out.println("LISTA LIDA DO ARQUIVO TESTE.TXT" + lerObjStream);
    }

}
