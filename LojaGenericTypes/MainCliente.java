import Models.Cliente;
import repository.ClienteRepository;

import java.util.List;
import java.util.Scanner;

public class MainCliente {
    public static void main(String[] args) {
        ClienteRepository repository = new ClienteRepository();
        Scanner scanner = new Scanner(System.in);

        String opcion = "";
        do {
            mostrarMenu();
            System.out.println("Selecione una opción:");
            opcion = scanner.nextLine();
            switch (opcion){
                case "1" ->listarClientes(repository);
                case "2" ->registrarCliente(scanner, repository);
                case "3" ->buscarCliente(scanner, repository);
                case "4" ->eliminarCliente(scanner, repository);
                case "q" -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida!");
            }

        }while (!opcion.equals("q"));

        scanner.close();
    }

    private static void listarClientes(ClienteRepository repository) {
        List<Cliente> clientes = repository.buscarTodos();
        if(clientes.isEmpty()){
            System.out.println("No hay clientes registrados");
            return;
        }

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    private static void registrarCliente(Scanner scanner, ClienteRepository repository) {
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Telefono: ");
        String telefono = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, telefono);
        repository.cadastrar(cliente);
        System.out.println("Cliente registrado con éxito!");
    }

    private static void buscarCliente(Scanner scanner, ClienteRepository repository) {
        System.out.println("Digite o id do cliente: ");
        Long id = scanner.nextLong();
        scanner.nextLine();
        Cliente clientes1 = repository.buscarPorId(id);
        if (clientes1 != null) {
            System.out.println("Cliente encontrado: " + clientes1);
        } else {
            System.out.println("Cliente no encontrado");
        }
    }

    private static void eliminarCliente(Scanner scanner, ClienteRepository repository) {
        System.out.println("Digite o id do cliente: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        boolean eliminarCli = repository.excluir(id);
        if (eliminarCli) {
            System.out.println("Cliente excluído com sucesso!");
        } else {
            System.out.println("Cliente no encontrado!");
        }
    }

    private static void mostrarMenu(){
        System.out.println("1 - Listar clientes");
        System.out.println("2 - Cadastrar cliente");
        System.out.println("3 - Buscar cliente");
        System.out.println("4 - Excluir cliente");
        System.out.println("q - Sair");
        System.out.println("\n");
    }
}
