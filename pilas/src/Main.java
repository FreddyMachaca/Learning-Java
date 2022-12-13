public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Coca Cola", "Coca Cola", 13, "Bebida");
        Producto producto2 = new Producto("Pepsi", "Pepsi", 16, "Bebida");
        Producto producto3 = new Producto("Chicle", "Bom", 12, "Dulce");
        Producto producto4 = new Producto("Leche", "Pil", 50, "Lacteo");
        Producto producto5 = new Producto("Galleta", "Maria", 60, "Dulce");

        PilaDeProducto pila = new PilaDeProducto(100);
        pila.adicionar(producto1);
        pila.adicionar(producto2);
        pila.adicionar(producto3);
        pila.adicionar(producto4);
        pila.adicionar(producto5);

        mostrarProductos(pila, "Pepsi");
        //ejercicio2(pila);
        //ejercicio2_1(pila);
    }

    //eliminar todos los productos de la marca que se recibe como parametro
    //mostrar todos los productos menos los de la marca que se recibe como parametro

    public static void mostrarProductos(PilaDeProducto pila, String marca) {
        Producto elem = null;
        if (pila.esVacio()) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("Elementos de la pila");
            PilaDeProducto aux = new PilaDeProducto(100);
            while (!pila.esVacio()) {
                elem = pila.eliminar();
                if (!elem.getMarca().equals(marca)) {
                    aux.adicionar(elem);
                    elem.mostrarProductos();
                }
            }
            pila.vaciar(aux);

        }
    }


    //mover todos los productos que sean par y mayor a 50 al inicio de la pila
    //mostrar todos los productos de la pila
    public static void ejercicio2(PilaDeProducto pila) {
        Producto elem = null;
        PilaDeProducto aux = new PilaDeProducto(100);
        PilaDeProducto aux2 = new PilaDeProducto(100);
        while (!pila.esVacio()) {
            elem = pila.eliminar();
            if (elem.getPrecio() % 2 == 0 && elem.getPrecio() > 50) {
                aux.adicionar(elem);
            } else {
                aux2.adicionar(elem);
            }
        }
        pila.vaciar(aux2);
        pila.vaciar(aux);
        pila.mostrar();
    }

    //el anterior funcion pero con un if en el par y otro if en el mayor a 50
    //con tres pilas auxiliares

    public static void ejercicio2_1(PilaDeProducto pila) {
        Producto elem = null;
        if (pila.esVacio()) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("Elementos de la pila");
            PilaDeProducto aux = new PilaDeProducto(100);
            PilaDeProducto aux2 = new PilaDeProducto(100);
            PilaDeProducto aux3 = new PilaDeProducto(100);
            while (!pila.esVacio()) {
                elem = pila.eliminar();
                if (elem.getPrecio() % 2 == 0) {
                    aux.adicionar(elem);
                } else if (elem.getPrecio() > 50) {
                    aux2.adicionar(elem);
                } else {
                    aux3.adicionar(elem);
                }
            }
            pila.vaciar(aux3);
            pila.vaciar(aux);
            pila.vaciar(aux2);
            pila.mostrar();
        }
    }

}
