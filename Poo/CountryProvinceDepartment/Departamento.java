public class Departamento {
    //VARIABLES
    private String nombre;
    private Provincia[] nroProvincias; //NOMBRECLASE [] NOMBREVARIABLE

    //CONSTRUCTOR ES PARA PONER ALGO NUEVO
    public Departamento(String nuevoNombre, Provincia[] nuevoNroProvincias) {
        this.nombre = nuevoNombre;
        this.nroProvincias = nuevoNroProvincias;
    }

    //GETS (TIPO DE DATO, SE RETORNA EL MISMO TIPO DE DATO)
    public String getNombre() {
        return this.nombre;
    }

    public Provincia[] getNroProvincias() {
        return this.nroProvincias;
    }

    //SETS (VOID - VACIO)
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setProvincias(Provincia[] nuevoNroProvincias) {
        this.nroProvincias = nuevoNroProvincias;
    }
    //arrays son listas for{1,2,3,4,5,6,7,8,9}
    //MOSTRAR
    public void mostrarDepartamentos(){
        System.out.println("-----------------------Departamento-------------------------------");
        System.out.println("nombre de departamento = " + getNombre());
        System.out.println("Nro. Provincias = " + getNroProvincias().length);
        for(int i=0;i<this.getNroProvincias().length;i++) {
            //if(this.getNroProvincias()[i]!=null){
            this.getNroProvincias()[i].muestraProvincia();//imprime el nombre de la provincia
            //}
        }
    }
    //agregar provincia
        public void agregarProvincia(Provincia nuevaProvincia){
            Provincia[] auxiliar = new Provincia[getNroProvincias().length+1]; //crea un array auxiliar con un tamaño de 1 mas que el array original
            for(int i=0;i<getNroProvincias().length;i++){ //recorre el array original
                auxiliar[i]=getNroProvincias()[i]; //copia el array original al auxiliar
            }
            auxiliar[auxiliar.length-1]=nuevaProvincia;
            /*
            El -1 en la línea auxiliar[auxiliar.length-1]=nuevaProvincia; se utiliza para asignar la nueva provincia al final del arreglo auxiliar.
            La propiedad length de un arreglo devuelve la cantidad de elementos que tiene el arreglo. Por ejemplo, si getNroProvincias().length devuelve 3,
            significa que el arreglo nroProvincias tiene 3 elementos. Sin embargo, cuando se crea un nuevo arreglo auxiliar, se le agrega un elemento adicional
            con la línea Provincia[] auxiliar = new Provincia[getNroProvincias().length+1];. Entonces, si getNroProvincias().length devuelve 3, el nuevo arreglo
            auxiliar tendrá una longitud de 4
            */
            setProvincias(auxiliar);
        }
}
