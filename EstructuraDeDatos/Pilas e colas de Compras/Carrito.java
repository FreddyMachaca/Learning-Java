public class Carrito {

    private String apellidoCliente;
    private String ciCliente;
    private String sexoCliente;
    private int edadCliente;
    private PilaProducto pilaProducto;

    public Carrito(String apellidoCliente, String ciCliente, String sexoCliente, int edadCliente, PilaProducto pilaProducto) {
        this.apellidoCliente = apellidoCliente;
        this.ciCliente = ciCliente;
        this.sexoCliente = sexoCliente;
        this.edadCliente = edadCliente;
        this.pilaProducto = pilaProducto;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getCiCliente() {
        return ciCliente;
    }

    public void setCiCliente(String ciCliente) {
        this.ciCliente = ciCliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    public PilaProducto getPilaProducto() {
        return pilaProducto;
    }

    public void setPilaProducto(PilaProducto pilaProducto) {
        this.pilaProducto = pilaProducto;
    }

    public void mostrarCarrito() {
        System.out.println("\nMOSTRANDO DATOS DEL CARRITO");
        System.out.println("Cliente: " + this.getApellidoCliente());
        System.out.println("C.I.: " + this.getCiCliente());
        System.out.println("Edad: " + this.getEdadCliente());
        System.out.println("Sexo: " + this.getSexoCliente());
        pilaProducto.mostrar();
    }

}
