package basedao.interfaces;

import java.util.List;

/**
 *
 * @author William
 * @param <E>
 */
public interface DaoI<E> {

    public List<E> listar();

    public boolean cadastrar(E obj);

    public boolean alterar(E obj);

    public boolean deletar(E obj);

    public E buscaPorId(int id);

}
