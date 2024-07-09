public class PilaProducto {

    private int max;
    private Producto[] productos;
    private int tope;

    public PilaProducto(int max) {
        this.tope = 0;
        this.max = max;
        this.productos = new Producto[this.max + 1];
    }

    public boolean esVacia() {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esllena() {
        if (tope == max) {
            return true;
        } else {
            return false;
        }
    }

    public int nroElem() {
        return this.tope;
    }

    public void adicionar(Producto nuevoProducto) {
        if (this.esllena() == false) {
            this.tope = this.tope + 1;
            this.productos[this.tope] = nuevoProducto;
        } else {
            System.out.println("La Pila de Productos esta llena.");
        }
    }

    public Producto eliminar() {
        Producto elementoEliminado = null;
        if (this.esVacia() == false) {
            elementoEliminado = this.productos[this.tope];
            this.tope = this.tope - 1;
        } else {
            System.out.println("La Pila de Productos esta vacia.");
        }
        return elementoEliminado;
    }

    public void vaciar(PilaProducto a) {
        while (a.esVacia() == false) {
            adicionar(a.eliminar());
        }
    }

    public void mostrar() {
        Producto elem = null;
        if (this.esVacia() == true) {
            System.out.println("La Pila de Productos esta vacia.");
        } else {
            System.out.println("\nMostrando la Pila de Productos");
            PilaProducto aux = new PilaProducto(this.max);
            while (this.esVacia() == false) {
                elem = this.eliminar();
                aux.adicionar(elem);
                elem.mostrarProducto();
            }
            vaciar(aux);
        }
    }

}
