package poo.clases;

public class Main {
    public static void main(String[] args) {

        // 1. Crear un objeto de la clase Vehículo
        Vehiculo v1 = new Vehiculo();
        System.out.println("v1.fabricante = " + v1.fabricante);
        System.out.println("v1.modelo = " + v1.modelo);
        System.out.println("v1.dd = " + v1.dd);
        System.out.println("v1.year = " + v1.year);
        System.out.println("v1.sport = " + v1.sport);

        // 2. Crear un objeto de la clase Vehículo
        Vehiculo v2 = new Vehiculo("Ferrari", "F40", 4.0, 1990, true);
        System.out.println("\nv2.fabricante = " + v2.fabricante);
        System.out.println("v2.modelo = " + v2.modelo);
        System.out.println("v2.dd = " + v2.dd);
        System.out.println("v2.year = " + v2.year);
        System.out.println("v2.sport = " + v2.sport);




    }
}
