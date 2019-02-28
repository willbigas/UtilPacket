package br.com.agendatelefonica;

import objetos.Contato;
import objetos.Telefone;
import objetos.Endereco;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author William
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        List<Contato> contatos = null;

        try {
            contatos = UtilPacket.UtilSerializar.lerSerializando("contatos.age", contatos);
            List<Telefone> telefones = new ArrayList<>();
            
            Endereco umEndereco = new Endereco("Dália", "538", "Casa Marrom Areia");
            Endereco umEndereco2 = new Endereco("15 de Novembro", "266", "Em frente a Praça");
            Endereco umEndereco3 = new Endereco("João 15", "282", "Final da rua");
            ManterContatoNegocio.adicionandoTelefones(telefones);

            System.out.println("Antes : " + contatos);
            contatos = ManterContatoNegocio.gerandoInterface(umEndereco, umEndereco2, umEndereco3, telefones, contatos);
            System.out.println("Depois de Excluir : " + contatos);

            UtilPacket.UtilSerializar.escreverSerializando("contatos.age", contatos);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Arquivo não encontrato");
        } 

        System.out.println(contatos);

    }

}
