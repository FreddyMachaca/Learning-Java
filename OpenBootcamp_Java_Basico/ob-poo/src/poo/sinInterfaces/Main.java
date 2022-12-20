package poo.sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoCrud empleadoCrud= new EmpleadoCrud();

        Empleado empleado1= new Empleado("Juan", 25, 1000, true);
        Empleado empleado2= new Empleado("Maria", 30, 2000, true);
        Empleado empleado3= new Empleado("Pedro", 35, 3000, true);

        //guardar empleados
        empleadoCrud.guardar(empleado1);
        empleadoCrud.guardar(empleado2);
        empleadoCrud.guardar(empleado3);

        //consultar empleados V1 mediante sout
        empleadoCrud.mostrarEmpleados(empleado1);
        empleadoCrud.mostrarEmpleados(empleado2);
        empleadoCrud.mostrarEmpleados(empleado3);

        //consultar empleados V2 mediante el arraylist
        empleadoCrud.findAll();
        List<Empleado> empleadosList = empleadoCrud.findAll();
        //impression de referencia de memoria
        //sin embargo usando toSting() nos permite imprimir los valores de los atributos
        System.out.println(empleadosList);
    }
}
