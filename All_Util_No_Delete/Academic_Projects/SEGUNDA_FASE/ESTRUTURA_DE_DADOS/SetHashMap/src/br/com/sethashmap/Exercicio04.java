package br.com.sethashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) throws Exception {
        List<String> linhas = UtilPacket.UtilArquivo.lerArqArrayList("distancias.txt");
        Map<String, Integer> origemA = new HashMap<>();
        Map<String, Integer> origemB = new HashMap<>();
        Map<String, Integer> origemC = new HashMap<>();
        Map<String, Integer> origemD = new HashMap<>();

        for (int i = 1; i < linhas.size(); i++) {
            if (linhas.get(i).startsWith("A")) {
                String[] campo = linhas.get(i).split(";");
                origemA.put(campo[0], Integer.valueOf(campo[1]));
            }
            if (linhas.get(i).startsWith("B")) {
                String[] campo = linhas.get(i).split(";");
                origemB.put(campo[0], Integer.valueOf(campo[1]));
            }
            if (linhas.get(i).startsWith("C")) {
                String[] campo = linhas.get(i).split(";");
                origemC.put(campo[0], Integer.valueOf(campo[1]));
            }
            if (linhas.get(i).startsWith("D")) {
                String[] campo = linhas.get(i).split(";");
                origemD.put(campo[0], Integer.valueOf(campo[1]));
            }

        }
        System.out.println("A:" + origemA);
        System.out.println("B:" + origemB);
        System.out.println("C:" + origemC);
        System.out.println("D:" + origemD);

        String opcao = "";
        Integer calculoDeRota = 0;
        String msgDestino = null;
        String destinoTeste = null;
        do {
            opcao = JOptionPane.showInputDialog("###GERENCIAMENTO DE ROTAS###\r\n"
                    + "\r\n1) Calcular Rota"
                    + "\r\n0) Sair\r\n");
            switch (opcao) {
                case "1": // Calcular Rota  //

                    String msgOrigem = JOptionPane.showInputDialog("Cidade de Origem:");

                    do {

                        msgDestino = JOptionPane.showInputDialog("Cidade de Destino:" + "\r\n0- Sair\r\n");
                        if (origemA.containsKey(msgOrigem + "-" + msgDestino)) {
                            calculoDeRota = calculoDeRota + origemA.get(msgOrigem + "-" + msgDestino);
                            System.out.println("Distancia até agora: " + calculoDeRota);
                        } 

                        if (origemB.containsKey(msgOrigem + "-" + msgDestino)) {
                            calculoDeRota = calculoDeRota + origemB.get(msgOrigem + "-" + msgDestino);
                            System.out.println("Distancia até agora: " + calculoDeRota);
                        }

                        if (origemC.containsKey(msgOrigem + "-" + msgDestino)) {
                            calculoDeRota = calculoDeRota + origemC.get(msgOrigem + "-" + msgDestino);
                            System.out.println("Distancia até agora: " + calculoDeRota);
                        }

                        if (origemD.containsKey(msgOrigem + "-" + msgDestino)) {
                            calculoDeRota = calculoDeRota + origemD.get(msgOrigem + "-" + msgDestino);
                            System.out.println("Distancia até agora: " + calculoDeRota);
                        }

                        destinoTeste = msgDestino;
                        msgOrigem = msgDestino;

                    } while (!msgDestino.equals("0"));

                    break;

            }
        } while (!opcao.equals("0"));

    }
}
