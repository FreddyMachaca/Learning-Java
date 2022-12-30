import java.util.Vector;

public class VectorEjemplo {
    public static void main(String[] args) {
        vectorEjemplo();
    }

    public static void vectorEjemplo(){
        /*
        * El problema de los vectores si tuviésemos 1000 elementos añadidos al mismo tiempo
        * es que tendríamos que crear un nuevo vector de 1000 elementos y copiar los 1000
        * lo que llevaria a una memoria de 2000 elementos, y así sucesivamente.
        * eso consume mucha memoria y es muy lento.
        * */
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        vector.remove(2);
        vector.remove(3);

    }
}
