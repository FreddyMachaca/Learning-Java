import Models.Funcionario;
import repository.FuncionarioRepository;

import java.util.List;
import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        FuncionarioRepository funcionariosMain = new FuncionarioRepository();
        Scanner scanner = new Scanner(System.in);

        String opcion = "";
        do {
            mostrarMenu();
            System.out.println("Seleccione una opción:");
            opcion = scanner.nextLine();
            switch (opcion){
                case "1" -> listarFuncionarios(funcionariosMain);
                case "2" -> registrarFuncionario(scanner, funcionariosMain);
                case "3" -> buscarFuncionario(scanner, funcionariosMain);
                case "4" -> eliminarFuncionario(scanner, funcionariosMain);
                case "q" -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida!");
            }

        }while (!opcion.equals("q"));
    }

    private static void eliminarFuncionario(Scanner scanner, FuncionarioRepository funcionariosMain) {
        System.out.println("Digite el id del funcionario: ");
        Long id = scanner.nextLong();
        scanner.nextLine();
        boolean eliminado = funcionariosMain.excluir(id);
        if (eliminado){
            System.out.println("Funcionario eliminado con éxito!");
        }else {
            System.out.println("Funcionario no encontrado");
        }
    }

    private static void buscarFuncionario(Scanner scanner, FuncionarioRepository funcionariosMain) {
        System.out.println("Digite el id del funcionario: ");
        Long id = scanner.nextLong();
        scanner.nextLine();
        Funcionario funcionario = funcionariosMain.buscarPorId(id);
        if (funcionario != null) {
            System.out.println("Funcionario encontrado: " + funcionario);
        } else {
            System.out.println("Funcionario no encontrado");
        }
    }

    private static void registrarFuncionario(Scanner scanner, FuncionarioRepository funcionariosMain) {
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Telefono: ");
        String telefono = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nombre, telefono);
        funcionariosMain.cadastrar(funcionario);
        System.out.println("Funcionario registrado con éxito!");
    }

    private static void listarFuncionarios(FuncionarioRepository funcionariosMain) {
        List<Funcionario> funcionarios = funcionariosMain.buscarTodos();
        if (funcionarios.isEmpty()){
            System.out.println("No hay funcionarios registrados");
            return;
        }
        for (Funcionario funcionarioA: funcionarios){
            System.out.println(funcionarioA);
        }
    }

    public static void mostrarMenu(){
        System.out.println("1 - Listar");
        System.out.println("2 - Cadastrar");
        System.out.println("3 - Buscar");
        System.out.println("4 - Excluir");
        System.out.println("q - Sair");
        System.out.println("\n");
    }
}
