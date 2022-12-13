public class PilaDeProducto {

    private int max;
    private int tope;
    private Producto[] productos;

    public PilaDeProducto(int max)
    {
        this.tope = 0;
        this.max = max;
        this.productos = new Producto[this.max +1];
    }


    public boolean esVacio()
    {
        if(this.tope == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean esllena()
    {
        if(tope == max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int nroElementos()
    {
        return this.tope;
    }

    public void adicionar(Producto nuevoproducto)
    {
        if (!this.esllena())
        {
            this.tope = this.tope +1;
            this.productos[this.tope] = nuevoproducto;

        }
        else
        {
            System.out.println("La pila de productos esta llena: ");
        }

    }

    //metodo para eliminar
    public Producto eliminar() {
        Producto elementoEliminado = null;
        if (!esVacio()) {
            elementoEliminado = this.productos[tope];
            tope--;
        } else {
            System.out.println("La pila esta vacia");
        }
        return elementoEliminado;
    }

    public void llenar(){}

    public void mostrar(){
        Producto elem=null;
        if(esVacio()){
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("Elementos de la pila");
            PilaDeProducto aux = new PilaDeProducto(this.max);
            while(!esVacio()){
                elem = this.eliminar();
                aux.adicionar(elem);
                elem.mostrarProductos();
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaDeProducto a){
        while (!a.esVacio()) {
            adicionar(a.eliminar());
        }
    }


}
