/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaponto;

/**
 *
 * @author William
 */
public class ManterPontoNegocio {

    private static Funcionario[] umFuncionario = new Funcionario[21];
    private static Integer QUANTIDADE = 0;

    public static Funcionario[] lerArquivo() throws Exception {
        String[] umaLinha = new String[21];
        Funcionario[] umFunc = new Funcionario[21];

        for (int i = 1; i < umaLinha.length; i++) {
            String[] linhas = UtilPacket.UtilArquivo.lerArqArray("cadastro/funcionarios.txt");
            umaLinha[i] = linhas[i];
            String umCampo[] = umaLinha[i].split("[;]");
            umFunc[i] = new Funcionario();
            umFunc[i].setCodigo(Integer.valueOf(umCampo[0]));
            umFunc[i].setNome(umCampo[1]);
            System.out.println(umFunc[i].getCodigo());
            System.out.println(umFunc[i].getNome());
        }
        return umFunc;

    }

    public static void inserirFuncionario(Integer codigo,
            String nome) {
        if (pesquisarUmFuncionario(codigo) != null) {
            return;
        }
        Funcionario funcionario = new Funcionario();
        funcionario.setCodigo(codigo);
        funcionario.setNome(nome);

        umFuncionario[QUANTIDADE] = funcionario;
        QUANTIDADE++;
    }

    public static void AlterarFuncionario(Integer codigo, String novoNome) {
        for (int i = 0; i < QUANTIDADE; i++) {
            Funcionario funcionario = umFuncionario[i];
            if (funcionario.getCodigo().equals(codigo)) {
                funcionario.setNome(novoNome);
            }
        }
    }

    public static String pesquisarUmFuncionario(Integer codigo) {
        for (int i = 0; i < QUANTIDADE; i++) {
            Funcionario funcionario = umFuncionario[i];
            if (funcionario.getCodigo().equals(codigo)) {
                    String linha = "ID: " + funcionario.getCodigo().toString() + " Nome: " + funcionario.getNome();  
                    linha = linha + linha;
                return linha;
            }
        }
        return null;
    }

    public static String[] listarTodosFuncionarios(Boolean opcao) {
        String[] listaFuncionarios = new String[21];
        for (int i = 0; i < listaFuncionarios.length; i++) {
            listaFuncionarios[i] = umFuncionario[i].getCodigo().toString() + umFuncionario[i].getNome();
            return listaFuncionarios;
        }
        return null;

    }
}
