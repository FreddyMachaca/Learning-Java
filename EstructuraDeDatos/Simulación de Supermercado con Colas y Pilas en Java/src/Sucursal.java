public class Sucursal {

    private String nombre;
    private String direccion;
    private Caja[] cajas;

    public Sucursal(String nombre, String direccion, Caja[] cajas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cajas = cajas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Caja[] getCajas() {
        return cajas;
    }

    public void setCajas(Caja[] cajas) {
        this.cajas = cajas;
    }

    public void mostrarSucursal() {
        System.out.println("\nMOSTRANDO DATOS DE LA SUCURSAL");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Dirección: " + this.getDireccion());
        for (int i = 0; i < getCajas().length; i = i + 1) {
            this.getCajas()[i].mostrarCaja();
        }
    }
}
