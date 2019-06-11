/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Point;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author agostinho.junior
 * @author william.mauro
 */
public class Tabela {

    private static DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
    private static DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
    private static DefaultTableCellRenderer direita = new DefaultTableCellRenderer();

    public static void criandoAlinhamentosDaJtable() {
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
    }

    /**
     * Centraliza o conteudo da tabela
     *
     * @param tableModel
     * @param coluna
     */
    public static void centralizarConteudo(JTable tableModel, Integer coluna) {
        criandoAlinhamentosDaJtable();
        tableModel.getColumnModel().getColumn(coluna).setCellRenderer(centralizado);
    }

    /**
     * Alinha o conteudo da tabela a direita
     *
     * @param tableModel
     * @param coluna
     */
    public static void alinharConteudoADireita(JTable tableModel, Integer coluna) {
        criandoAlinhamentosDaJtable();
        tableModel.getColumnModel().getColumn(coluna).setCellRenderer(direita);
    }

    /**
     * Alinha o conteudo da tabela a esquerda
     *
     * @param tableModel
     * @param coluna
     */
    public static void alinharConteudoAEsquerda(JTable tableModel, Integer coluna) {
        criandoAlinhamentosDaJtable();
        tableModel.getColumnModel().getColumn(coluna).setCellRenderer(esquerda);
    }

    /**
     * Redefinir largura da tabela
     *
     * @param tableModel
     * @param coluna
     * @param largura
     */
    public static void redimensionar(JTable tableModel, Integer coluna, Integer largura) {
        tableModel.setAutoResizeMode(tableModel.AUTO_RESIZE_OFF);
        tableModel.getColumnModel().getColumn(coluna).setPreferredWidth(largura);
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

    public static int pegaLinhaComDoubleClick(java.awt.event.MouseEvent evt) {
        JTable table = (JTable) evt.getSource();
        Point point = evt.getPoint();
        int row = table.rowAtPoint(point);
        if (evt.getClickCount() == 2 && table.getSelectedRow() != -1) {
            return row;
        } else {
            return -1;
        }
    }

}
