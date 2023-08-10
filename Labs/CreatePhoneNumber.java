/*
Escriba una función que acepte una matriz de 10 enteros (entre 0 y 9),
que devuelva una cadena de esos números en forma de número de teléfono.
*/
public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = "";
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                phoneNumber += "(";
            }
            if (i == 3) {
                phoneNumber += ") ";
            }
            if (i == 6) {
                phoneNumber += "-";
            }
            phoneNumber += numbers[i];
        }
        return phoneNumber;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,0};
        System.out.println(createPhoneNumber(numbers));
    }
}
