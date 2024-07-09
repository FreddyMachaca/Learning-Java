import java.util.Date;

public class Libro {
    private String titulo;
    private Autor autor;
    private Date anoPublicacion;
    private String isbn;

    //Constructor
    public Libro(String titulo, Autor autor, Date anoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.isbn = isbn;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Date getAnoPublicacion() {
        return anoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setAnoPublicacion(Date anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //toString


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", anoPublicacion=" + anoPublicacion +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
