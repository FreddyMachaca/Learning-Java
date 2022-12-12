package com.example.estructurasDeControl.condicionales;

public class Switch {
    public static void main(String[] args) {

        //Switch
        String dia = "Lunes";
        switch (dia) {
            case "Lunes" -> System.out.println("Hoy es Lunes");
            case "Martes" -> System.out.println("Hoy es Martes");
            case "Miercoles" -> System.out.println("Hoy es Miercoles");
            case "Jueves" -> System.out.println("Hoy es Jueves");
            case "Viernes" -> System.out.println("Hoy es Viernes");
            case "Sabado" -> System.out.println("Hoy es Sabado");
            case "Domingo" -> System.out.println("Hoy es Domingo");
            default -> System.out.println("No es un dia de la semana");
        }


    }
}
