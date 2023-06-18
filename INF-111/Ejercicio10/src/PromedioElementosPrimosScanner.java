import java.util.Scanner;

public class PromedioElementosPrimosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos del vector: ");
        int n = scanner.nextInt();

        int[] vector = new int[n];
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        double promedio = calcularPromedioPrimos(vector);
        System.out.println("El promedio de los elementos primos es: " + promedio);

        scanner.close();
    }

    public static double calcularPromedioPrimos(int[] vector) {
        int sumaPrimos = 0;
        int cantidadPrimos = 0;

        for (int num : vector) {
            if (esPrimo(num)) {
                sumaPrimos += num;
                cantidadPrimos++;
            }
        }

        if (cantidadPrimos == 0) {
            return 0; // En caso de que no haya primos, retornamos 0 para evitar la división por cero.
        } else {
            return (double) sumaPrimos / cantidadPrimos;
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
