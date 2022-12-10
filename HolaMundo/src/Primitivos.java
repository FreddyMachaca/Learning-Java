public class Primitivos {
    public static void main(String[] args) {
    /*
        Tipos de datos primitivos
        byte, short, int, long, float, double, char, boolean
        byte 8 bits
        short 16 bits
        int 32 bits
        long 64 bits
        float 32 bits
        double 64 bits
        char 16 bits
        boolean 1 bit
     */

        //byte
        byte numeroByte=127;
        System.out.println("------------------- Variable byte -------------------------");
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a: " + Byte.BYTES); //1 byte = 8 bits
        System.out.println("Tipo byte corresponde en bites a: " + Byte.SIZE); //8 bits = 1 byte
        System.out.println("Valor maximo tipo byte: " + Byte.MAX_VALUE);    //127
        System.out.println("Valor minimo tipo byte: " + Byte.MIN_VALUE);    //-128

        //short
        short numeroShort=32767;
        System.out.println("--------------------- Variable short -----------------------");
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a: " + Short.BYTES); //2 byte = 16 bits
        System.out.println("Tipo short corresponde en bites a: " + Short.SIZE); //16 bits = 2 byte
        System.out.println("Valor maximo tipo short: " + Short.MAX_VALUE);  //32767
        System.out.println("Valor minimo tipo short: " + Short.MIN_VALUE);  //-32768

        //int
        int numeroInt=2147483647;
        System.out.println("---------------------- Variable int ----------------------");
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a: " + Integer.BYTES); //4 byte = 32 bits
        System.out.println("Tipo int corresponde en bites a: " + Integer.SIZE); //32 bits = 4 byte
        System.out.println("Valor maximo tipo int: " + Integer.MAX_VALUE);  //2147483647
        System.out.println("Valor minimo tipo int: " + Integer.MIN_VALUE);  //-2147483648

        //long
        long numeroLong=9223372036854775807L;
        System.out.println("--------------------- Variable long -----------------------");
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a: " + Long.BYTES);   //8 byte = 64 bits
        System.out.println("Tipo long corresponde en bites a: " + Long.SIZE);   //64 bits = 8 byte
        System.out.println("Valor maximo tipo long: " + Long.MAX_VALUE);    //9223372036854775807
        System.out.println("Valor minimo tipo long: " + Long.MIN_VALUE);    //-9223372036854775808

        //float
        float numeroFloat=3.4028235E38F;
        System.out.println("--------------------- Variable float -----------------------");
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Tipo float corresponde en byte a: " + Float.BYTES); //4 byte = 32 bits
        System.out.println("Tipo float corresponde en bites a: " + Float.SIZE); //32 bits = 4 byte
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);  //3.4028235E38
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);  //1.4E-45

        //double
        double numeroDouble=1.7976931348623157E308;
        System.out.println("--------------------- Variable double -----------------------");
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Tipo double corresponde en byte a: " + Double.BYTES);   //8 byte = 64 bits
        System.out.println("Tipo zdouble corresponde en bites a: " + Double.SIZE);   //64 bits = 8 byte
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);    //1.7976931348623157E308
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);    //4.9E-324
    }
}
