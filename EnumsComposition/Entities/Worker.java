package Entities;

import Entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    //Attributes
    private String nombre;
    private WorkerLevel nivel;
    private Double salarioBase;

    //Associations
    private Departament departamento;
    private List<HourContract> contratos = new ArrayList<>();

    public Worker(String nombre, WorkerLevel nivel, Double salarioBase, Departament departamento) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public WorkerLevel getNivel() {
        return nivel;
    }

    public void setNivel(WorkerLevel nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departament getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departament departamento) {
        this.departamento = departamento;
    }

    public List<HourContract> getContratos() {
        return contratos;
    }


    public void AgregarContrato(HourContract contrato){
        contratos.add(contrato);
    }

    public void RemoverContrato(HourContract contrato){
        contratos.remove(contrato);
    }

    public Double Ingresos(Integer year, Integer month){
        Double suma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for(HourContract c : contratos){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if(year == c_year && month == c_month){
                suma += c.valorTotal();
            }
        }
        return suma;
    }
}
