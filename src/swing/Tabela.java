/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author agostinho.junior
 */
public class Tabela {

    /**
     * Redefinir largura da tabela
     *
     * @param tableModel
     * @param coluna
     * @param largura
     */
    public static void redimensionar(JTable tableModel, Integer coluna, Integer largura) {
        autoRedimensionamentoDesligado(tableModel);
        tableModel.getColumnModel().getColumn(coluna).setPreferredWidth(largura);
    }

    /**
     * Desligando o auto redimensionamento
     *
     * @param tableModel
     */
    public static void autoRedimensionamentoDesligado(JTable tableModel) {
        tableModel.setAutoResizeMode(tableModel.AUTO_RESIZE_OFF);
    }

    /**
     * Centralizar o cabecalho da tabela
     *
     * @param tableModel
     */
    public static void centralizarCabecalho(JTable tableModel) {
        ((DefaultTableCellRenderer) tableModel.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    }

    /**
     * Limpar linha selecionada na tabela
     *
     * @param tableModel
     */
    public static void limparSelecaoDaTabela(JTable tableModel) {
        tableModel.getSelectionModel().clearSelection();
    }
}
