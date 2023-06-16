package poo.conInterfaces;

import poo.sinInterfaces.Empleado;

import java.util.List;

public class EmpleadoCrudMysql implements EmpleadoCrud , EmpleadoReader{

    @Override
    public void save(Empleado empleado) {
    }

    @Override
    public List<Empleado> findAll() {
        return null;
    }

    @Override
    public void delete(Empleado empleado) {
    }
}
