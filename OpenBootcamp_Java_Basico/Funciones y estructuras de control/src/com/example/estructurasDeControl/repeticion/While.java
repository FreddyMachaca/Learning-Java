package com.example.estructurasDeControl.repeticion;

public class While {
    public static void main(String[] args) {
        //Bucle while
        while1();

    }

    public static void while1() {

        int contador =0;
        while (contador < 10) {
            contador++;

            if(contador==5){
                //break;
                continue;
            }
            System.out.println("contador = " + contador);
        }
    }

}
