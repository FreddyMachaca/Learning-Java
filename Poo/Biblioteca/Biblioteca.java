import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private ArrayList<Libro> libros; //Libros[] libros;

    //Constructor
    public Biblioteca(){
        nombre = "Biblioteca Nacional";
        direccion = "Calle 100";
        libros = new ArrayList<Libro>(); //libros = new Libros[10];
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void eliminarLibros(String isbn){
        for (int i = 0; i < libros.size(); i++){
            if (libros.get(i).getIsbn().equals(isbn)){
                libros.remove(i);
            }
        }
    }

    public void mostrarLibros(){
        for (Libro libroEach: libros){
            System.out.println(libroEach);
        }
    }
}
