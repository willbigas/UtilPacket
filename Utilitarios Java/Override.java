
package UtilPacket;

/**
 *
 * @author William
 */
public class Override {

    /**
     * Sobrescrever CompareTo para comparar Objeto pelo Atributo do Objeto.
     */
     implements Comparable<Jogador> // Colocar na Classe do Objeto
    
        @Override
    public int compareTo(Jogador t) {             // Corpo Do objeto
        return this.nome.compareTo(t.getNome());
    }
	
	
	
    /**
     * Sobrescrever o Equals para Comparar objetos.
     */
    
       @Override
    public boolean equals(Object obj) { // Comparando pelo nome
        if (obj instanceof Contato) {
            Contato c = (Contato) obj;

            return this.nome.equalsIgnoreCase(c.getNome());
        }
        return this.nome.equals(obj.toString());
    }

}