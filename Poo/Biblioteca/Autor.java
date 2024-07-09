public class Autor {
    private String nombre;
    private String apellido;
    private String nacionalidad;

    //Constructor
    public Autor(String nombre, String apellido, String nacionalidad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
