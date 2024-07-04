package repository;

import Models.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository implements IRepository<Cliente, Long>{
    private List<Cliente> clientes;
    private Long idClienteAtual;

    //Construtor inicializando a lista de clientes e o id atual
    public ClienteRepository() {
        this.clientes = new ArrayList<>();
        this.idClienteAtual = 1L;
    }

    @Override
    public List<Cliente> buscarTodos() {
        return clientes;
    }

    @Override
    public Cliente cadastrar(Cliente objeto) {
        objeto.setId(idClienteAtual);
        idClienteAtual++;
        clientes.add(objeto);
        return objeto;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public boolean excluir(Long id) {
        Cliente clienteEncontrado = buscarPorId(id);
        if (clienteEncontrado != null) {
            clientes.remove(clienteEncontrado);
            return true;
        }
        return false;
    }
}
