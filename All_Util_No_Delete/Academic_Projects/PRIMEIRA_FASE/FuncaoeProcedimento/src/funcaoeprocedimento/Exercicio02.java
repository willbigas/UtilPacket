package funcaoeprocedimento;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        List<String> NOMES = new ArrayList<>();
        List<Integer> posicoes = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            NOMES.add(JOptionPane.showInputDialog("Digite o nome da uma Pessoa"));

        }
        for (int i = 0; i < NOMES.size(); i++) {
            String get = NOMES.get(i);
            System.out.println(get);
            for (int j = 0; j < get.length(); j++) {
                String aux = String.valueOf(get.charAt(j));
                if(aux.equalsIgnoreCase("A")){
                    posicoes.add(j+1);
                }
            }

        }
        
        System.out.println("O nome que você digitou tem letra A na letra " + posicoes );

    }
}
