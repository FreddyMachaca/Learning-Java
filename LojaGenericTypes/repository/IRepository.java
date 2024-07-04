package repository;

import java.util.List;

public interface IRepository <CLASSE, ID>{
    List<CLASSE> buscarTodos();
    CLASSE cadastrar(CLASSE objeto);
    CLASSE buscarPorId(ID id);
    boolean excluir(ID id);
}
