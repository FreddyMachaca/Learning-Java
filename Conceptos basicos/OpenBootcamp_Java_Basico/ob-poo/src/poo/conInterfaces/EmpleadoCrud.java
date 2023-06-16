package poo.conInterfaces;

import poo.sinInterfaces.Empleado;

import java.util.List;

public interface EmpleadoCrud {
    /**
     * Una interfaz es un contrato que debe cumplir una clase
     * se declaran los metodos
     * No se implementan
     * No se ponen llaves
     * No se ponen sentencias
     * No se ponen variables
     * No se ponen modificadores de acceso (public, private, protected)
     * No se ponen modificadores de acceso (static, final, abstract)
     */

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);

}
