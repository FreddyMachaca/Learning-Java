package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {

        // 1. Crear un objeto de la clase Vehículo
        Vehiculo toyotaPrius = new Vehiculo();
        System.out.println("toyotaPrius.fabricante = " + toyotaPrius.fabricante);
        System.out.println("toyotaPrius.modelo = " + toyotaPrius.modelo);
        System.out.println("toyotaPrius.dd = " + toyotaPrius.dd);
        System.out.println("toyotaPrius.year = " + toyotaPrius.year);
        System.out.println("toyotaPrius.sport = " + toyotaPrius.sport);


        //creando motor para el vehículo
        Motor motorGTI = new Motor("V8", 500, 500, 8);


        // creando un objeto de la clase Vehículo
        Vehiculo fordMondeo = new Vehiculo("Ferrari", "F40", 4.0, 1990, true, 0, motorGTI);
        System.out.println("\nfordMondeo.fabricante = " + fordMondeo.fabricante);
        System.out.println("fordMondeo.modelo = " + fordMondeo.modelo);
        System.out.println("fordMondeo.dd = " + fordMondeo.dd);
        System.out.println("fordMondeo.year = " + fordMondeo.year);
        System.out.println("fordMondeo.sport = " + fordMondeo.sport);

        fordMondeo.acelerar(300);
        System.out.println("velocidad = " + fordMondeo.speed);
        System.out.println("\nDATOS DE MOTOR");
        System.out.println("motor = " + fordMondeo.motor.modelo);
        System.out.println("motor = " + fordMondeo.motor.caballos);
        System.out.println("motor = " + fordMondeo.motor.parNm);
        System.out.println("motor = " + fordMondeo.motor.numCilindros);

        //herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";

        //polimorfismo
        //puede tener muchas formas
        Vehiculo vehiculo;


        vehiculo = new Motocicleta();
        vehiculo.acelerar(100);

        vehiculo = new Coche();
        vehiculo.acelerar(100);

        vehiculo = new Camion();
        vehiculo.acelerar(100);

    }

}
