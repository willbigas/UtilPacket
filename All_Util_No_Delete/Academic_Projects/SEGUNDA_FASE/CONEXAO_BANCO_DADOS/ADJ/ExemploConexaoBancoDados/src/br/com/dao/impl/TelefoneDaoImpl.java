/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao.impl;

import br.com.Entidade.Telefone;
import br.com.dao.TelefoneDao;
import br.com.dao.sessionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class TelefoneDaoImpl implements TelefoneDao {

    private Connection conexao;

    @Override
    public boolean inserir(Object object) throws Exception {
        Telefone telefone = (Telefone) object;
        try {
            conexao = sessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("insert into telefone (tipo , numero, ddd) values (?, ?, ?) ", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, telefone.getTipo());
            statement.setString(2, telefone.getNumero());
            statement.setInt(3, telefone.getDdd());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Integer idInserido = rs.getInt(1);
                telefone.setId(idInserido);
                return true;
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao inserir " + exception.getMessage());
            exception.printStackTrace();
        } finally {
            conexao.close();
        }
        return false;
    }

    @Override
    public boolean update(Object object) throws Exception {
        Telefone telefone = (Telefone) object;
        try {
            conexao = sessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("update  telefone set tipo = ? , numero = ?, ddd = ? where id = ? ");
            statement.setString(1, telefone.getTipo());
            statement.setString(2, telefone.getNumero());
            statement.setInt(3, telefone.getDdd());
            int linhasAtualizadas = statement.executeUpdate();
            return linhasAtualizadas > 0;
        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            conexao.close();
        }
        return false;
    }

    @Override
    public boolean excluir(Integer id) throws Exception {
        try {
            conexao = sessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("delete from telefone where id = ? ");
            statement.setInt(1, id);
            int executeUpdate = statement.executeUpdate();
            return executeUpdate != 0;
        } catch (Exception exception) {
            exception.getMessage();
        } finally {
            conexao.close();
        }
        return false;
    }

    @Override
    public Object pesquisar(Integer id) throws Exception {
        try {
            conexao = sessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("SELECT * FROM telefone WHERE id = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String tipo = rs.getString("tipo");
                String numero = rs.getString("numero");
                Integer ddd = rs.getInt("ddd");
                Telefone telefone = new Telefone();
                telefone.setTipo(tipo);
                telefone.setNumero(numero);
                telefone.setDdd(ddd);
                telefone.setId(id);
                return telefone;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
        return null;
    }

    @Override
    public List<Object> pesquisarTodos() throws Exception {
        List<Object> usuarios = new ArrayList<>();
        try {
            conexao = sessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("SELECT * FROM telefone");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Telefone telefone = new Telefone();
                telefone.setTipo(rs.getString("tipo"));
                telefone.setNumero(rs.getString("numero"));
                telefone.setDdd(rs.getInt("ddd"));
                usuarios.add(telefone);

            }
            return usuarios;
        } catch (Exception e) {
            System.out.println("Erro ao listar todos " + e.getMessage());
        } finally {
            conexao.close();
        }

        return null;
    }

}
