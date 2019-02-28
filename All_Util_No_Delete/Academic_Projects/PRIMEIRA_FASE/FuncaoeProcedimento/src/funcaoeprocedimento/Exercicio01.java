package funcaoeprocedimento;

import java.util.List;
import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        List<Integer> numA = UtilPacket.UtilList.numRandom(0, 50, 20);
        String mensagem  = JOptionPane.showInputDialog("Digite um numero");
        System.out.println("LISTA DE NUMEROS");
        System.out.println(numA);
        verificaNumero(mensagem, numA);
        
    }
    
    public static void verificaNumero(String mensagem , List<Integer> numeros){
        if(numeros.contains(Integer.valueOf(mensagem))){
            System.out.println("Numero se encontra no Array");
        } else {
            System.out.println("Numero não se encontra no Array");
        }
    }

}
