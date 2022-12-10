public class Caracteres {
    public static void main(String[] args) {
        char caracter='\u0040';
        char decimal=64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal=caracter = " + (decimal == caracter));

        char simbolo='@';
        System.out.println("simbolo = " + simbolo);
        /*
            CARACTERES ESPECIALES

            char espacio='\u0020';
            char retroceso='\b';
            char tabulador='\t';
            char nuevaLinea='\n';
            char retornoCarro='\r';
            char comillaSimple='\'';
            char comillaDoble='\"';
         */

        System.out.println("-----------------------Variable char------------------------------");
        System.out.println("char corresponde en byte a: " +Character.BYTES); //2 byte = 16 bits
        System.out.println("char corresponde en bites a: " + Character.SIZE); //16 bits = 2 byte
        System.out.println("Valor maximo tipo char: " + (int)Character.MAX_VALUE); //65535
        System.out.println("Valor minimo tipo char: " + (int) Character.MIN_VALUE); //0
    }
}
