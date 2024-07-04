package repository;

import Models.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository implements IRepository<Funcionario,Long>{
    //variables de la clase
    private List<Funcionario> funcionarios;
    private Long idFuncionario;

    //construtor que inicializa las variables
    public FuncionarioRepository(){
        this.funcionarios = new ArrayList<>();
        this.idFuncionario = 1L;
    }

    @Override
    public List<Funcionario> buscarTodos() {
        return funcionarios;
    }

    @Override
    public Funcionario cadastrar(Funcionario objeto) {
        objeto.setId(idFuncionario);
        idFuncionario++;

        funcionarios.add(objeto);
        return objeto;
    }

    @Override
    public Funcionario buscarPorId(Long id) {
        for (Funcionario funcionario: funcionarios){
            if (funcionario.getId().equals(id)){
                return funcionario;
            }
        }
        return null;
    }

    @Override
    public boolean excluir(Long id) {
        Funcionario funcionarioEliminar = buscarPorId(id);
        if (funcionarioEliminar!=null){
            funcionarios.remove(funcionarioEliminar);
            return true;
        }
        return false;
    }
}
