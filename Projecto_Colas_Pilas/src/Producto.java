public class Producto {

    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("\nMOSTRANDO DATOS DEL PRODUCTO");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Precio: " + this.getPrecio() + " Bs.");
    }

}
