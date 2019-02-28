/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda;

import br.com.agenda.dominio.Contato;
import br.com.agenda.negocio.ManterContatoNegocio;
import br.com.agenda.view.FormularioContato;
import br.com.agenda.view.FramePrincipal;
import br.com.agenda.view.ListarContato;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class PrincipalAgenda {

    private static FramePrincipal frame;
    private static String[] NOMES = {"Felipe Silva", "Bruna Andrade", "João Carlos Neto",
        "Paulo Roberto Oliveira", "Paulo Almeida", "Márcio Mattos", "Ana Paula Toledo",
        "Pedro Malta", "Maria Pereira", "José Amaral", "Cleber Heinz", "Daniel Soares",
        "Michel Luz", "Fábio Macedo", "Fernando Baldança", "Daniela Cruz", "Luis Fernando da Silveira",
        "Silvio de Melo"};

    public static void main(String[] args) {
        for (int i = 0; i < NOMES.length; i++) {
            Contato c1 = new Contato();
            c1.setNome(NOMES[i]);
            String[] split = NOMES[i].split(" ");
            c1.setEmail(split[0].toLowerCase() + "@email.com.br");
            Random r = new Random();
            String parte1 = String.format("%03d", r.nextInt(999));
            String parte2 = String.format("%03d", r.nextInt(999));
            String parte3 = String.format("%03d", r.nextInt(999));
            String parte4 = String.format("%02d", r.nextInt(99));
            String cpf = parte1 + "." + parte2 + "." + parte3 + "-" + parte4;
            c1.setCpf(cpf);
            ManterContatoNegocio.adicionar(c1);
        }

        frame = new FramePrincipal();
        frame.setTitle("Agenda");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void listarContatos() {
        ListarContato panel = new ListarContato();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public static void abrirPanelContato() {
        FormularioContato form = new FormularioContato(null);
        frame.setContentPane(form);
        frame.setVisible(true);

    }

    public static void abrirTelaAdicao(Contato c) {
        FormularioContato form = new FormularioContato(c);
        frame.setContentPane(form);
        frame.setVisible(true);
    }

}
