package colecoes;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author William
 */
public class Map {

    /**
     * Faz Contagem de frequencia de valores e retorna um Map < Key,Value >
     *
     * @param objetos Recebe como parametro uma lista de objetos
     * @return Map - Retorna um Map < Key , Value >
     */
    public static java.util.Map mapearFreqObj(List objetos) {
        java.util.Map<String, Integer> contFreq = new HashMap<>();
        Iterator<Integer> it = objetos.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            int frequency = Collections.frequency(objetos, obj);
            contFreq.put(String.valueOf(obj), frequency);
        }

        return contFreq;

    }
}
