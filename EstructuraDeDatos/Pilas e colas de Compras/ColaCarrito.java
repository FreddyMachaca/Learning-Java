public class ColaCarrito {

    private int max;
    private int ini;
    private int fin;
    private Carrito[] carritos;

    public ColaCarrito(int max) {
        this.max = max;
        this.carritos = new Carrito[this.max + 1];
        this.ini = 0;
        this.fin = 0;
    }

    public boolean esVacia() {
        if (this.ini == 0 && this.fin == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlena() {
        if (this.fin == this.max) {
            return true;
        } else {
            return false;
        }
    }

    public int nroElem() {
        return this.fin - this.ini;
    }

    public void adicionar(Carrito nuevoCarrito) {
        if (esLlena() == false) {
            this.fin = this.fin + 1;
            this.carritos[this.fin] = nuevoCarrito;
        } else {
            System.out.println("La Cola de Carritos esta llena.");
        }
    }

    public Carrito eliminar() {
        Carrito elementoEliminado = null;
        if (this.esVacia() == false) {
            this.ini = this.ini + 1;
            elementoEliminado = this.carritos[this.ini];
            if (this.ini == this.fin) {
                this.ini = 0;
                this.fin = 0;
            }
        } else {
            System.out.println("La Cola de Carritos esta vacía.");
        }
        return elementoEliminado;
    }

    public void vaciar(ColaCarrito cola) {
        while (cola.esVacia() == false) {
            adicionar(cola.eliminar());
        }
    }

    public void mostrar() {
        if (esVacia() == true) {
            System.out.println("La Cola de Carritos esta vacía.");
        } else {
            Carrito elemEliminado = null;
            System.out.println("\nMostrando la cola de Carritos");
            ColaCarrito aux = new ColaCarrito(max);
            while (this.esVacia() == false) {
                elemEliminado = this.eliminar();
                elemEliminado.mostrarCarrito();
                aux.adicionar(elemEliminado);
            }
            vaciar(aux);
        }
    }

}
