package com.example.funciones;

public class Sobrecarga {

    public static void main(String[] args) {

        //Sobrecarga de metodos
        //Funciones con el mismo nombre, sin embargo, diferente comportamiento
        //Funciones con el mismo nombre, sin embargo, diferente cantidad de parametros
        //Funciones con el mismo nombre, sin embargo, diferente tipo de parametros

        holaMundo();
        holaMundo("Cristian");
        holaMundo("Cristian", 20);
        holaMundo(20, "Cristian");
    }

    public static void holaMundo() {
        System.out.println("Hola Mundo");
    }

    public static void holaMundo(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static void holaMundo(String nombre, int edad) {
        System.out.println("Hola " + nombre + " tienes " + edad + " años");
    }

    public static void holaMundo(int edad, String nombre) {
        System.out.println("Hola " + nombre + " tienes " + edad + " años");
    }
}
