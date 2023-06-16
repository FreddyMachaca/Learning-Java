public class Producto {

    private String nombre;
    private String marca;
    private int precio;
    private String tipo;


    public Producto(String nombre, String marca, int precio, String tipo) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarProductos()
    {
        System.out.println("--------------Productos-------------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Marca: " + this.marca);
        System.out.println("Precio: " + this.precio);
        System.out.println("Tipo: " + this.tipo);
    }
}
