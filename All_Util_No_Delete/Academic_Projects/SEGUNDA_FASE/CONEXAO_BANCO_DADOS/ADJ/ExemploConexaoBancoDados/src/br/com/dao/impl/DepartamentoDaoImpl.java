/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao.impl;

import br.com.Entidade.Departamento;
import br.com.dao.DepartamentoDao;
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
public class DepartamentoDaoImpl implements DepartamentoDao {

    private Connection conexao;

    @Override
    public boolean inserir(Object object) throws Exception {
        Departamento departamento = (Departamento) object;
        try {
            conexao = sessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("insert into departamento (nome , descricao) values (?, ?) ", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, departamento.getNome());
            statement.setString(2, departamento.getDescricao());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Integer idInserido = rs.getInt(1);
                departamento.setId(idInserido);
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
        Departamento departamento = (Departamento) object;
        try {
            conexao = sessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("update  usuario set nome = ? , descricao = ? where id = ? ");
            statement.setString(1, departamento.getNome());
            statement.setString(2, departamento.getDescricao());
            statement.setInt(3, departamento.getId());
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
            PreparedStatement statement = conexao.prepareStatement("delete from departamento where id = ? ");
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
            PreparedStatement statement = conexao.prepareStatement("SELECT * FROM departamento WHERE id = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                String descricao = rs.getString("descricao");
                Departamento departamento = new Departamento();
                departamento.setNome(nome);
                departamento.setDescricao(descricao);
                departamento.setId(id);
                return departamento;
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
        List<Object> departamentos = new ArrayList<>();
        try {
            conexao = sessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("SELECT * FROM usuario");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Departamento departamento = new Departamento();
                departamento.setId(rs.getInt("id"));
                departamento.setNome(rs.getString("nome"));
                departamento.setDescricao(rs.getString("nascimento"));
                departamentos.add(departamento);

            }
            return departamentos;
        } catch (Exception e) {
            System.out.println("Erro ao listar todos " + e.getMessage());
        } finally {
            conexao.close();
        }

        return null;
    }

}
