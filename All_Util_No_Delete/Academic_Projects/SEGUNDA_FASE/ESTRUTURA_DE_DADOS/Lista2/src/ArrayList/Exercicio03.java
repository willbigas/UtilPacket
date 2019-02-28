/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Exercicio03 {

    private static Cliente[] CLIENTE = new Cliente[50];
    private static Integer QUANTIDADE = 0;

    private static List<Date> umaData = new ArrayList<>();
    private static List<String> umCPF = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        List<String> umaLinha = new ArrayList<>();
        String[] umCampo = new String[4];
        umaLinha = UtilPacket.UtilArquivo.lerArqArrayList("clientes.txt"); // Lendo Arquivo

        for (int i = 1; i < CLIENTE.length; i++) {

            umCampo = umaLinha.get(i).split(";");
            CLIENTE[i] = new Cliente();
            CLIENTE[i].setNome(umCampo[0]);
            CLIENTE[i].setCpf(umCampo[1]);
            CLIENTE[i].setNascimento(UtilPacket.UtilFormat.StrforDate(umCampo[2]));
            CLIENTE[i].setTelefone(umCampo[3]);
            umaData.add(CLIENTE[i].getNascimento());
            umCPF.add(CLIENTE[i].getCpf());
        }
        // Serafim Pinhal || 20889507323 || 04/11/1983
        String opcao = "";
        do {
            opcao = JOptionPane.showInputDialog("MENU\r\n1) Pesquisa por CPF"
                    + "\r\n2) Clientes Ordenados por Nome"
                    + "\r\n3) Clientes Ordenados por Data"
                    + "\r\n0) Sair");
            switch (opcao) {
                case "1":
                    String mensagem = JOptionPane.showInputDialog("Digite o CPF");
                    System.out.println("");
                    System.out.println(PesquisarCliente(mensagem));
                    break;
                case "2":
                    System.out.println("Clientes Ordenados por Nome: \r\n");
                    System.out.println("----Nome----||||---- CPF ----||||-- Data Nasc -- ");
                    for (int i = 0; i < 49; i++) {
                        System.out.println(clientesOrdenados().get(i) + " || " + umCPF.get(i) + " || " + UtilPacket.UtilFormat.dateForString(umaData.get(i)));

                    }

                    break;
                case "3":

                    System.out.println("Datas Ordenadas: " + datasOrdenadas());
                    break;

            }
        } while (!opcao.equals("0"));

    }

    public static String PesquisarCliente(String cpf) throws Exception{

        for (int i = 1; i < CLIENTE.length; i++) {

            if (cpf.equals(CLIENTE[i].getCpf())) {
                return CLIENTE[i].getNome() + "||" + CLIENTE[i].getCpf() + "||" + UtilPacket.UtilFormat.dateForString(CLIENTE[i].getNascimento()) + "||" + CLIENTE[i].getTelefone();
            }
        }
        return null;
    }

    public static List<String> clientesOrdenados() {
        List<String> umNome = new ArrayList<>();
        for (int i = 1; i < CLIENTE.length; i++) {
            umNome.add(CLIENTE[i].getNome());
            umCPF.add(CLIENTE[i].getCpf());
        }
        Collections.sort(umNome);
        return umNome;
    }

    public static List<String> datasOrdenadas() throws Exception {
        Collections.sort(umaData);
        List<String> umaDataEmStr = new ArrayList<>();
        for (int i = 0; i < umaData.size(); i++) {
            umaDataEmStr.add(UtilPacket.UtilFormat.dateForString(umaData.get(i)));

        }
        return umaDataEmStr;
    }

}
