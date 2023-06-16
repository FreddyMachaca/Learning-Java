import java.util.Arrays;
import java.util.Scanner;

public class InvertirNumerosParesScanner {
    /* EJERCICIO 9:
    Dado un vector X, invertir los números pares:
    105 604 27 56 36 → 105 406 27 65 63
    USANDO SCANNER
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la longitud del vector: ");
        int longitud = leer.nextInt();

        int[] vectorX = new int[longitud];
        System.out.println("Ingrese los números del vector: ");

        for (int i = 0; i < longitud; i++) {
            vectorX[i] = leer.nextInt();
        }

        int[] vectorInvertido = invertirPares(vectorX);

        System.out.println("Vector original: " + Arrays.toString(vectorX));
        System.out.println("Vector invertido: " + Arrays.toString(vectorInvertido));
    }

    public static int[] invertirPares(int[] vectorX) {
        int[] resultado = new int[vectorX.length];

        for (int i= 0; i < vectorX.length; i++) {
            if (vectorX[i] % 2 == 0) { // Verificar si el número es par
                resultado[i] = invertirNumero(vectorX[i]);
            } else {
                resultado[i] = vectorX[i];
            }
        }
        return resultado;
    }
    public static int invertirNumero(int numero) {
        int invertido = 0;
        while (numero != 0) { //si el numero es diferente de 0
            invertido = invertido * 10 + numero % 10; //se multiplica por 10 y se le suma el residuo de la division entre 10
            numero /= 10; //se divide entre 10
        }
        return invertido;
    }

}
