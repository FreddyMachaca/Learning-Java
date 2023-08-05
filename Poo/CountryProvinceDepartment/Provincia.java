public class Provincia {

    /*
    *
    * Modificadores de acesso: private, public, protected, default
    * prívate solo permite acedder desde la misma clase
    * public se puede acceder desde cualquier clase
    * protected solo se puede acedder desde la misma clase y las clases que hereden de ellas
    * default sin modificador
    */
    //----------------------------------------------variables-------------------------------------------------------
    //es posible que tengas juguetes que no quieres que otros tomen sin tu permiso. Si alguien puede ver el nombre del juguete puede ser tentador
    //para ellos tomar sin tu consentimiento, al hacer el atributo nombre privado, te aseguras que solo tu pueddas acceder al nombre y cambiar
    // el nombre del juguete, manteniendo seguro en tu caja de juguetes cerrada con llaves
    private String nombre; //está con llave
    //---------------------------------------------constructores--------------------------------------------------------------
    //el constructor es como el proceso de poner un juguete en la caja.
    // Imagina que solo tú tienes la llave de la caja de juguetes por lo que solo tu puedes poner nuevos juguetes dentro de la caja,
    // cuando creas un objeto de la clase juguete con el constructor estás colocando un nuevo juguete dentro de la caja
    public Provincia(String nuevaProvincia){
        this.nombre=nuevaProvincia;
    }
    //---------------------------------------------gets -- Obtener--------------------------------------------
    //método público que devuelve el nombre del juguete
    public String getNombre(){
        return this.nombre;
    }
    //-----------------------------------------sets -- establecer-----------------------------------------------------------
    //metodo pblico que establece el nombre del juguete
    public void setNombre(String setNombre){
        this.nombre=setNombre;
    }

    //-----------------------------------------Mostrar provincia---------------------------------------------
    public void muestraProvincia(){
        System.out.println("----------------------Mostrar Provincia---------------------------------");
        System.out.println("Nombre de Provincia: "+getNombre());
    }
}


