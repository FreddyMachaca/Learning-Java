package poo.clases;

public class Vehiculo {

    // 1. Atributos

    //encapsulamiento
    //es una forma de proteger los atributos de la clase
    //para que no puedan ser modificados desde fuera de la clase

    /**
     * abstracto
     * es una forma de obligar a que las clases hijas implementen un metodo o atributo especifico
     * no se puede instanciar un objeto de una clase abstracta
     */
    protected String fabricante;
    protected String modelo;
    protected double dd;
    protected int year;
    protected boolean sport;
    protected int speed;
    //clase de tipo Motor (atributo de tipo Motor)
    protected Motor motor;


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

    // 2.2. Constructor con todos los parámetros
    public Vehiculo(String newFabricante, String newModelo, double newDd, int newYear, boolean newSport,int newSpeed, Motor newMotor) {
        this.fabricante = newFabricante;
        this.modelo = newModelo;
        this.dd = newDd;
        this.year = newYear;
        this.sport = newSport;
        this.speed = newSpeed;
        this.motor = newMotor;
    }

    //constructor con dos parametros
    public Vehiculo(String newFabricante, String newModelo) {
        this.fabricante = newFabricante;
        this.modelo = newModelo;
    }


    // 3. Métodos (comportamiento)
    public void acelerar(int cantidad) {
        this.speed +=cantidad; //sumar cantidad a speed
        if(cantidad>200){
            System.out.println("Estás a punto de explotar el motor");
        }else {
            System.out.println("Acelerando a " + this.speed + " km/h");
        }
    }


}
