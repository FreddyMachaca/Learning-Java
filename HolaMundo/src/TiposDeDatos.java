public class TiposDeDatos {
    public static void main(String[] args) {

        String saludar="Hola Mundo";
        System.out.println(saludar);

        //String es un objeto tiene varios metodos
        //toUpperCase() convierte a mayusculas
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        //numero de valor int = como es un valor no tiene atributo y  no tiene metodos
        //int numero=10;
        //Integer si contiene metodos para convertir a otros tipos de datos
        int numero=10;
        System.out.println("numero = " + numero);

        boolean valor=true;
        int numero2=5;
        if (valor){
            System.out.println("numero en el if = " + numero2);
            numero2=10;
        }
        System.out.println("numero2 = " + numero2);

        //var es una palabra reservada de java 10
        //tipo de dato inferido/automatico
        var numero3="15";
        System.out.println("numero3 = " + numero3);

        String nombre;
        nombre="Andres";

        if(numero>0){
            nombre="Juan";
        }
        System.out.println("nombre = " + nombre);

    }
}
