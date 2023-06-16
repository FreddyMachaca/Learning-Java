package com.example.estructurasDeControl.repeticion;

public class ForEach {

    public static void main(String[] args) {

        //forEach1();
        //forEach2();
        sumaForEach();
    }

    public static void forEach1(){
        String[] nombres = {"Cristian", "Juan", "Pedro", "Maria"};

        for (String nombre1 : nombres) {
            System.out.println("nombre = " + nombre1);
        }
    }

    public static void forEach2(){
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int numbers : numeros) {
            System.out.println("Numero = " + numbers);
        }
    }

    public static void sumaForEach(){
        int[] numeros = {4,2,8};
        int suma = 0;
        for (int numbers : numeros) {
            //suma = numbers + suma;
            suma += numbers;
        }
        System.out.println("suma = " + suma);
    }
}
