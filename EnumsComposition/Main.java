import Entities.Departament;
import Entities.HourContract;
import Entities.Worker;
import Entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Ingrese el nombre del departamento: ");
        String nombreDepartamento = sc.nextLine();
        System.out.println("Ingrese los datos del trabajador:");
        System.out.print("Nombre: ");
        String nombreTrabajador = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelTrabajador = sc.nextLine();
        System.out.print("Salario base: ");
        double salarioBase = sc.nextDouble();

        Worker worker = new Worker(nombreTrabajador, WorkerLevel.valueOf(nivelTrabajador), salarioBase, new Departament(nombreDepartamento));

        System.out.print("Cuantos contratos tiene el trabajador? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese los datos del contrato #" + i + ":");
            System.out.print("Fecha (DD/MM/YYYY): ");
            Date fechaContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duración (horas): ");
            int horas = sc.nextInt();

            HourContract contrato = new HourContract(fechaContrato, valorPorHora, horas);
            worker.AgregarContrato(contrato);
        }

        System.out.println();
        System.out.print("Ingrese la fecha del contrato que desea calcular el ingreso (MM/YYYY): ");
        String mesYAnio = sc.next();
        int mes = Integer.parseInt(mesYAnio.substring(0, 2));
        int anio = Integer.parseInt(mesYAnio.substring(3));
        System.out.println("Nombre: " + worker.getNombre());
        System.out.println("Departamento: " + worker.getDepartamento().getNombre());
        System.out.println("Ingresos para " + mesYAnio + ": " + String.format("%.2f", worker.Ingresos(anio, mes)));

        sc.close();
    }
}
