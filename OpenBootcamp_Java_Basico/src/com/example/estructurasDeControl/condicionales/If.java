package com.example.estructurasDeControl.condicionales;

public class If {

    public static void main(String[] args) {

        //Estructura de control condicional
        //if, else, else if

        int edad= 20;

        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }

        //if else para saber si un numero es par o impar
        int numero = 5;

        if(numero % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }


    }
}
