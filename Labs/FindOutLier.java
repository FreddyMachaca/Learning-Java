/*
* Se le proporciona una matriz (que tendrá una longitud de al menos 3, pero podría ser muy grande)
* que contiene números enteros. La matriz está completamente compuesta por enteros impares o completamente
* compuesta por enteros pares excepto por un solo entero N. Escriba un método que tome la matriz como argumento
* y devuelva este "valor atípico" N.
* Ejemplos
* [2, 4, 0, 100, 4, 11, 2602, 36]
* Should return: 11 (el unico numero impar)
*
* [160, 3, 1719, 19, 11, 13, -21]
* Should return: 160 (el único número par)
*/
public class FindOutLier {
    static int find(int[] integers){
        int even = 0;
        int odd = 0;
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                even = integers[i];
                evenCount++;
            } else {
                odd = integers[i];
                oddCount++;
            }
        }
        if (evenCount == 1) {
            return even;
        } else {
            return odd;
        }
    }

    public static void main(String[] args) {
        int[] integers = {2, 4, 0, 100, 4, 11, 2602, 36};
        System.out.println(find(integers));
        int[] integers2 = {160, 3, 1719, 19, 11, 13, -21};
        System.out.println(find(integers2));
    }
}
