/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.dao;

import br.com.poo.entidade.Telefone;
import br.com.poo.entidade.Usuario;
import java.util.List;

/**
 *
 * @author Felipe
 */
public interface TelefoneDao extends BaseDao {

    public List<Telefone> pesquisarTelefoneUsuarios(Usuario user) throws Exception;

    public boolean excluirTelefoneUsuarios(Integer id) throws Exception;

}
