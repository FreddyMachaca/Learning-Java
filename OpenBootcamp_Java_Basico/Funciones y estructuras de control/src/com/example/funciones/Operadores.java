package com.example.funciones;

public class Operadores {
    public static void main(String[] args) {
        // Operadores Logicos
        // &&, ||, !
        // && = AND
        // || = OR
        // ! = NOT

        //una funcion con !

        //probarOperadoresLogicos();
        funcionesConParametros("Cristian", 20);
    }

    public static void probarOperadoresLogicos() {
        boolean esVerdadero = true;
        System.out.println("esVerdadero = " + esVerdadero);
        System.out.println("!esVerdadero = " + !esVerdadero);

        // && = AND
        // ∧ = AND (en matematicas)
        // Verdadero ∧ falso = falso
        boolean esFalso = false;
        System.out.println("\nesFalso = " + esFalso);
        System.out.println("esVerdadero && esFalso = " + (esVerdadero && esFalso));

        // || = OR
        // ∨ = OR (en matematicas)
        // Verdadero ∨ falso = verdadero
        System.out.println("\nesVerdadero || esFalso = " + (esVerdadero || esFalso));
    }

    public static void funcionesConParametros(String nombre, int edad ) {
        System.out.println("\nHola " + nombre+" tienes " + edad + " años");
    }


}
