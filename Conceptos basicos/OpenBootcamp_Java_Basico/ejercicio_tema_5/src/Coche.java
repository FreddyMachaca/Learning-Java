public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int potencia;

    public Coche(){}
    public Coche(String marca, String modelo, String color, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
