package basedao.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import basedao.interfaces.DaoI;
import basedao.model.Produto;

/**
 *
 * @author William
 */
public class ProdutoDao extends Dao implements DaoI<Produto> {

    public ProdutoDao() {
        super();
    }

    @Override
    public List<Produto> listar() {
        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement("SELECT id , nome  , valor  , dataCadastro from produtos");
            ResultSet result = stmt.executeQuery();
            List<Produto> listProduto = new ArrayList<>();
            while (result.next()) {
                Produto produto = new Produto();
                produto.setId(result.getInt("id"));
                produto.setNome(result.getString("nome"));
                produto.setValor(result.getDouble("valor"));
                produto.setDataCadastro(result.getDate("dataCadastro"));
                listProduto.add(produto);

            }
            return listProduto;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean cadastrar(Produto obj) {
        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement("INSERT INTO produtos (nome, valor, dataCadastro) VALUES (? , ? , ?)");
            stmt.setString(1, obj.getNome());
            stmt.setDouble(2, obj.getValor());
            stmt.setDate(3, new java.sql.Date(obj.getDataCadastro().getTime()));
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean alterar(Produto obj) {
        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement("UPDATE produtos SET nome=? , valor=? , dataCadastro =? where id=?");
            stmt.setString(1, obj.getNome());
            stmt.setDouble(2, obj.getValor());
            stmt.setDate(3, new java.sql.Date(obj.getDataCadastro().getTime()));
            stmt.setInt(4, obj.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean deletar(Produto obj) {

        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement("DELETE FROM produtos where id=?");
            stmt.setInt(1, obj.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Produto buscaPorId(int id) {
        try {
            PreparedStatement stmt;
            stmt = conexao.prepareStatement("SELECT id , nome  , valor  , dataCadastro from produtos where id=?");
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            Produto produto = null;
            if (result.next()) {
                produto = new Produto();
                produto.setId(result.getInt("id"));
                produto.setNome(result.getString("nome"));
                produto.setValor(result.getDouble("valor"));
                produto.setDataCadastro(result.getDate("dataCadastro"));

            }
            return produto;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

}
