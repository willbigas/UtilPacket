/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao.impl;

import br.com.Entidade.Usuario;
import br.com.dao.UsuarioDao;
import br.com.dao.sessionFactory;
import java.sql.Connection;
import java.sql.Date;
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
public class UsuarioDaoImpl implements UsuarioDao {

    private Connection conexao;

    @Override
    public boolean inserir(Object object) throws Exception {
        Usuario usuario = (Usuario) object;
        try {
            conexao = sessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("insert into usuario (nome , nascimento, idDepartamento, idTelefone) values (?, ?, ?, ?) ", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, usuario.getNome());
            statement.setDate(2, new Date(usuario.getNascimento().getTime()));
            statement.setInt(3, usuario.getDepartamento().getId());
            statement.setInt(4, usuario.getTelefones().get(0).getId());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Integer idInserido = rs.getInt(1);
                usuario.setId(idInserido);
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
        Usuario usuario = (Usuario) object;
        try {
            conexao = sessionFactory.getConnection();
            PreparedStatement statement = conexao.prepareStatement("update  usuario set nome = ? , nascimento = ? , idDepartamento = ? where id = ? ");
            statement.setString(1, usuario.getNome());
            statement.setDate(2, new Date(usuario.getNascimento().getTime()));
            statement.setInt(3, usuario.getDepartamento().getId());
            statement.setInt(4, usuario.getId());
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
            PreparedStatement statement = conexao.prepareStatement("delete from usuario where id = ? ");
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
            PreparedStatement statement = conexao.prepareStatement("SELECT * FROM usuario WHERE id = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                Date nascimento = rs.getDate("nascimento");
                Usuario usuario = new Usuario();
                usuario.setNome(nome);
                usuario.setNascimento(nascimento);
                usuario.setId(id);
                return usuario;
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
            PreparedStatement statement = conexao.prepareStatement("SELECT * FROM usuario");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setNascimento(rs.getDate("nascimento"));
                usuarios.add(usuario);

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
