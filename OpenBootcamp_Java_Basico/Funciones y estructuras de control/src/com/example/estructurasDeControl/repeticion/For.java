package com.example.estructurasDeControl.repeticion;

public class For {

    public static void main(String[] args) {
        //bucle for
        //for (inicializacion; condicion; incremento) {
        //   //codigo
        //   }

        estructuraFor();
        forInverso();
        forPares();
        forImpares();
        recorrerArreglo();

    }

    public static void estructuraFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void forInverso() {
        //for inverso
        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }
    }

    public static void forPares() {
        for (int i = 0; i < 10; i += 2) {
            System.out.println("i = " + i);
        }
    }

    public static void forImpares() {
        for (int i = 1; i < 10; i += 2) {
            System.out.println("i = " + i);
        }
    }

    public static void recorrerArreglo() {
                            //      0      1       2        3
        String[] nombres = {"Cristian", "Juan", "Pedro", "Maria"}; //length = 4

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("nombres = " + nombres[i]);
        }
    }

}
