import java.util.Arrays;

public class InvertirNumerosPares {
    public static void main(String[] args) {
        int[] vectorX = {105, 604, 27, 56, 36};
        int[] vectorInvertido = invertirPares(vectorX);

        System.out.println("Vector original: " + Arrays.toString(vectorX)); // [105, 604, 27, 56, 36]
        System.out.println("Vector invertido: " + Arrays.toString(vectorInvertido)); // [105, 406, 27, 65, 63]
    }

    public static int[] invertirPares(int[] vector) {
        int[] resultado = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {  // Verificar si el número es par
                resultado[i] = invertirNumero(vector[i]);
            } else {
                resultado[i] = vector[i];
            }
        }
        return resultado;
    }

    public static int invertirNumero(int numero) {
        int invertido = 0;
        while (numero != 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }
        return invertido;
    }
}
