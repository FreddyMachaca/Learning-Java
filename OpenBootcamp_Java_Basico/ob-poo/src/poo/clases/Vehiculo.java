package poo.clases;

public class Vehiculo {

    // 1. Atributos
    String fabricante;
    String modelo;
    double dd;
    int year;
    boolean sport;

    // 2. Constructores
    //inicializar los atributos de la clase

    // 2.1. Constructor por defecto
    public Vehiculo() {
        this.fabricante = "Ford";
        this.modelo = "Mustang";
        this.dd = 5.0;
        this.year = 2019;
        this.sport = true;
    }

    // 2.2. Constructor con parámetros
    public Vehiculo(String newFabricante, String newModelo, double newDd, int newYear, boolean newSport) {
        this.fabricante = newFabricante;
        this.modelo = newModelo;
        this.dd = newDd;
        this.year = newYear;
        this.sport = newSport;
    }
    // 2.3. Constructor copia
    public Vehiculo(Vehiculo v) {
        this.fabricante = v.fabricante;
        this.modelo = v.modelo;
        this.dd = v.dd;
        this.year = v.year;
        this.sport = v.sport;
    }



    // 3. Métodos (comportamiento)

}
