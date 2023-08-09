/*Crear una función que pueda tomar cualquier número entero no negativo como argumento y
*devolverlo con sus dígitos en orden descendente. Esencialmente, reorganiza los dígitos
* para crear el número más alto posible.
* Ejemplos:
* Entrada: 42145 Salida:54421
* Entrada: 145263 Salida:654321
*/

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] numbers = String.valueOf(num).split("");
        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                int a = Integer.parseInt(numbers[j]);
                int b = Integer.parseInt(numbers[j + 1]);
                if (a < b) {
                    String temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            result += numbers[i];
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
        System.out.println(sortDesc(145263));
    }
}
