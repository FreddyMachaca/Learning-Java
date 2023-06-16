package poo.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * C - Create
 * R - Read
 * U - Update
 * D - Delete
 */

public class EmpleadoCrud {

    //crear un array List de tipo Empleado
    //para almacenar los empleados
    private List<Empleado> empleadosList = new ArrayList<>();

    //guardar un empleado
    public void guardar(Empleado empleado){
        empleadosList.add(empleado);
    }

    public List<Empleado> findAll() {
        return empleadosList;
    }
    //mostrar empleados
    public void mostrarEmpleados(Empleado empleado){
        System.out.println("\nNombre: " + empleado.nombre);
        System.out.println("Edad: " + empleado.edad);
        System.out.println("Salario: " + empleado.salario);
        System.out.println("Alta: " + empleado.alta);
    }
    //

}
