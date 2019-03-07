package basedao.control;

import javax.swing.table.DefaultTableModel;
import basedao.dao.UsuarioDao;
import basedao.model.Usuario;
import basedao.view.usuario.JanelaGerenciaUsuario;

/**
 *
 * @author William
 */
public class UsuarioControl {

    public static UsuarioDao USUARIO_DAO = new UsuarioDao();

 

    public UsuarioControl() {
       
    }

    public void inserindoUsuarioAction() {
        Usuario u = criandoUsuario();
        enviandoProBanco(u);
    }

    private Usuario criandoUsuario() throws NumberFormatException {
        Usuario u = new Usuario();
        u.setId(1);
        u.setNome(JanelaGerenciaUsuario.campoNome.getText());
        u.setEmail(JanelaGerenciaUsuario.campoEmail.getText());
        u.setSenha(JanelaGerenciaUsuario.campoSenha.getText());
        u.setNivel(Integer.valueOf(JanelaGerenciaUsuario.campoNivel.getText()));
        return u;
    }

    private void enviandoProBanco(Usuario u) {
        if (USUARIO_DAO.cadastrar(u)) {
            System.out.println("Produto Cadastrado");
            listarUsuarioAction();
        } else {
            System.out.println("Deu ruim!");
        }
    }

    public void listarUsuarioAction() {
        DefaultTableModel model = (DefaultTableModel) JanelaGerenciaUsuario.tabelaUsuario.getModel();
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
