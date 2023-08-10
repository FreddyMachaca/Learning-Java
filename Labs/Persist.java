/*Escribe una función, persistence, que tome un parámetro positivo num y devuelva su persistencia multiplicativa,
que es el número de veces que debes multiplicar los dígitos num hasta llegar a un solo dígito.
Por ejemplo (Entrada --> Salida) :
39 --> 3 (porque 3*9 = 27, 2*7 = 14, 1*4 = 4 y 4 tiene un solo dígito)
999 --> 4 (porque 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, y finalmente 1*2 = 2)
 */
public class Persist {
    public static int persistence(long n) {
        int count = 0;
        while (n > 9) {
            long product = 1;
            while (n > 0) {
                product *= n % 10;
                n /= 10;
            }
            n = product;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(999));
    }
}
