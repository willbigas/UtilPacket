/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.daoimpl;

import br.com.poo.conexaobd.implementacao.SessionFactory;
import br.com.poo.dao.TelefoneDao;
import br.com.poo.dao.UsuarioDao;
import br.com.poo.entidade.Telefone;
import br.com.poo.entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class TelefoneDaoImpl implements TelefoneDao {

    private Connection conexao;

    @Override
    public boolean inserir(Object obj) throws Exception {
        Telefone telefone = (Telefone) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("insert into telefone (numero, tipo, ddd, id_usuario) values (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, telefone.getNumero());
            statement.setString(2, telefone.getTipo());
            statement.setInt(3, telefone.getDdd());
            statement.setInt(4, telefone.getUsuario().getId());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Integer idInserido = rs.getInt(1);
                telefone.setId(idInserido);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return false;
    }

    @Override
    public boolean update(Object obj) throws Exception {
        Telefone telefone = (Telefone) obj;
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "update telefone set numero = ?, tipo = ?, ddd = ?, id_usuario = ? where id = ? ");
            statement.setString(1, telefone.getNumero());
            statement.setString(2, telefone.getTipo());
            statement.setInt(3, telefone.getDdd());
            statement.setInt(4, telefone.getUsuario().getId());
            statement.setInt(5, telefone.getId());
            int linhasAtualizadas = statement.executeUpdate();
            return linhasAtualizadas > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return false;
    }

    @Override
    public Telefone pesquisar(Integer id) throws Exception {
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "select * from telefone where id = ? ");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String numero = rs.getString("numero");
                String tipo = rs.getString("tipo");
                Integer ddd = rs.getInt("ddd");
                Integer idUsuario = rs.getInt("id_usuario");
                Telefone telefone = new Telefone();
                telefone.setNumero(numero);
                telefone.setTipo(tipo);
                telefone.setId(id);
                telefone.setDdd(ddd);
                telefone.setUsuario((Usuario) usuarioDao.pesquisar(idUsuario));
                return telefone;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return null;
    }

    @Override
    public List<Object> pesquisarTodos() throws Exception {
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        List<Object> telefones = new ArrayList<>();
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "select * from telefone");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String numero = rs.getString("numero");
                String tipo = rs.getString("tipo");
                Integer ddd = rs.getInt("ddd");
                Integer idUsuario = rs.getInt("id_usuario");
                Telefone telefone = new Telefone();
                telefone.setNumero(numero);
                telefone.setTipo(tipo);
                telefone.setId(idUsuario);
                telefone.setDdd(ddd);
                telefone.setUsuario((Usuario) usuarioDao.pesquisar(idUsuario));
                telefones.add(telefone);
            }
            return telefones;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return telefones;
    }

    @Override
    public boolean excluir(Integer id) throws Exception {
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "delete from telefone where id = ? ");
            statement.setInt(1, id);
            int executeUpdate = statement.executeUpdate();
            return executeUpdate != 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return false;
    }

    @Override
    public List<Telefone> pesquisarTelefoneUsuarios(Usuario user) throws Exception {
        List<Telefone> telefones = new ArrayList<>();
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "select * from telefone where id_usuario = ?");
            statement.setInt(1, user.getId());
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String numero = rs.getString("numero");
                String tipo = rs.getString("tipo");
                Integer ddd = rs.getInt("ddd");
                Integer idUsuario = rs.getInt("id_usuario");
                Telefone telefone = new Telefone();
                telefone.setNumero(numero);
                telefone.setTipo(tipo);
                telefone.setId(idUsuario);
                telefone.setDdd(ddd);
                telefone.setUsuario(user);
                telefones.add(telefone);
            }
            return telefones;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return telefones;
    }

    @Override
    public boolean excluirTelefoneUsuarios(Integer idUsuario) throws Exception {
        try {
            conexao = SessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement(
                    "delete from telefone where id_usuario = ? ");
            statement.setInt(1, idUsuario);
            int executeUpdate = statement.executeUpdate();
            return executeUpdate != 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return false;
    }

}
