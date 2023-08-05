public class Pais {
    private String nombre;
    private int nroDepartamentos;
    Departamento[] departamentos;

    public Pais(String nombre, Departamento[] departamentos, int nroDepartamentos) {
        this.nombre = nombre;
        this.departamentos = departamentos;
        this.nroDepartamentos = departamentos.length;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroDepartamentos() {
        return nroDepartamentos;
    }

    public void setNroDepartamentos(int nroDepartamentos) {
        this.nroDepartamentos = nroDepartamentos;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    //mostra pais
    public void mostrarDepartamentos(){
        System.out.println("-----------------------Pais-------------------------------");
        System.out.println("nombre de pais = " + getNombre());
        System.out.println("Nro. Departamentos = " + getNroDepartamentos());
        System.out.println("Departamentos: "+getDepartamentos().length);
        for(int i=0;i<this.getDepartamentos().length;i++) {
            this.getDepartamentos()[i].mostrarDepartamentos();//imprime el nombre del departamento
        }
    }

    //agregar nuevo Departamento
    public void agregarDepartamento(Departamento nuevoDepartamento){
        Departamento[] auxiliar = new Departamento[getNroDepartamentos()+1]; //crea un array auxiliar con un tamaño de 1 mas que el array original
        for(int i=0;i<getNroDepartamentos();i++){ //recorre el array original
            auxiliar[i]=getDepartamentos()[i]; //no usamor nrodepartamentos porque no es un array
        }
        auxiliar[auxiliar.length-1]=nuevoDepartamento;
        /*
        El -1 en la línea auxiliar[auxiliar.length-1]=nuevaProvincia; se utiliza para asignar la nueva provincia al final del arreglo auxiliar.
        La propiedad length de un arreglo devuelve la cantidad de elementos que tiene el arreglo. Por ejemplo, si getNroProvincias().length devuelve 3,
        significa que el arreglo nroProvincias tiene 3 elementos. Sin embargo, cuando se crea un nuevo arreglo auxiliar, se le agrega un elemento adicional
        con la línea Provincia[] auxiliar = new Provincia[getNroProvincias().length+1];. Entonces, si getNroProvincias().length devuelve 3, el nuevo arreglo
        auxiliar tendrá una longitud de 4
        */
        setDepartamentos(auxiliar);
    }

}
