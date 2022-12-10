public class Caja {

    private String nombreEmpleado;
    private String ciEmpleado;
    private String sexoEmpleado;
    private int edadEmpleado;
    private ColaCarrito colaCarrito;

    public Caja(String nombreEmpleado, String ciEmpleado, String sexoEmpleado, int edadEmpleado, ColaCarrito colaCarrito) {
        this.nombreEmpleado = nombreEmpleado;
        this.ciEmpleado = ciEmpleado;
        this.sexoEmpleado = sexoEmpleado;
        this.edadEmpleado = edadEmpleado;
        this.colaCarrito = colaCarrito;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCiEmpleado() {
        return ciEmpleado;
    }

    public void setCiEmpleado(String ciEmpleado) {
        this.ciEmpleado = ciEmpleado;
    }

    public String getSexoEmpleado() {
        return sexoEmpleado;
    }

    public void setSexoEmpleado(String sexoEmpleado) {
        this.sexoEmpleado = sexoEmpleado;
    }

    public int getEdadEmpleado() {
        return edadEmpleado;
    }

    public void setEdadEmpleado(int edadEmpleado) {
        this.edadEmpleado = edadEmpleado;
    }

    public ColaCarrito getColaCarrito() {
        return colaCarrito;
    }

    public void setColaCarrito(ColaCarrito colaCarrito) {
        this.colaCarrito = colaCarrito;
    }

    public void mostrarCaja() {
        System.out.println("\nMOSTRANDO DATOS DE LA CAJA REGISTRADORA");
        System.out.println("Empleado: " + this.getNombreEmpleado());
        System.out.println("C.I: " + this.getCiEmpleado());
        System.out.println("Sexo: " + this.getSexoEmpleado());
        System.out.println("Edad: " + this.getEdadEmpleado());
        colaCarrito.mostrar();
    }
}
