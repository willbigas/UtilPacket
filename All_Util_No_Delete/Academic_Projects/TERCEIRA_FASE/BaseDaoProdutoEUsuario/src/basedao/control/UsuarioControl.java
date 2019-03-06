package basedao.control;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import basedao.dao.UsuarioDao;
import basedao.model.Usuario;

/**
 *
 * @author William
 */
public class UsuarioControl {

    public static UsuarioDao USUARIO_DAO = new UsuarioDao();

    private JTextField campoEmail;
    private JTextField campoNivel;
    private JTextField campoNome;
    private JTextField campoSenha;
    private JTable tabelaUsuario;

    public UsuarioControl(JTextField campoEmail, JTextField campoNivel, JTextField campoNome, JTextField campoSenha, JTable tabelaUsuario) {
        this.campoEmail = campoEmail;
        this.campoNivel = campoNivel;
        this.campoNome = campoNome;
        this.campoSenha = campoSenha;
        this.tabelaUsuario = tabelaUsuario;
    }

    public static void inserindoUsuario(JTextField campoNome, JTextField campoEmail, JTextField campoSenha, JTextField campoNivel, JTable tabelaUsuario) {
        Usuario u = new Usuario();
        u.setId(1);
        u.setNome(campoNome.getText());
        u.setEmail(campoEmail.getText());
        u.setSenha(campoSenha.getText());
        u.setNivel(Integer.valueOf(campoNivel.getText()));

        if (USUARIO_DAO.cadastrar(u)) {
            System.out.println("Produto Cadastrado");
            atualizarJtable(tabelaUsuario);
        } else {
            System.out.println("Deu ruim!");
        }
    }

    public static void atualizarJtable(JTable tabelaUsuario) {
        DefaultTableModel model = (DefaultTableModel) tabelaUsuario.getModel();
        model.setNumRows(0);
        for (Usuario u : USUARIO_DAO.listar()) {
            model.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getEmail(),
                u.getSenha(),
                u.getNivel()
            });
        }
    }

}
