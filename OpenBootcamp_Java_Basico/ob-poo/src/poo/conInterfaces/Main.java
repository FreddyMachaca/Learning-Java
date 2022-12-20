package poo.conInterfaces;

import poo.sinInterfaces.Empleado;

public class Main {

    static EmpleadoCrud empleadoCrud= new EmpleadoCrudMysql();
    public static void main(String[] args) {
        empleadoCrud.findAll();
        empleadoCrud.save(new Empleado());
    }
}
