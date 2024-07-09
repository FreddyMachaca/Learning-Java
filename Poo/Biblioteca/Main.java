import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel", "Garcia Marquez", "Colombiano");
        Libro libro1 = new Libro("Cien años de soledad", autor1, new Date(), "123456789");

        Autor autor2 = new Autor("Mario", "Vargas Llosa", "Peruano");
        Libro libro2 = new Libro("La ciudad y los perros", autor2, new Date(), "987654321");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.eliminarLibros("123456789");
        biblioteca.mostrarLibros();
    }
}
