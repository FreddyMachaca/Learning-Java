/*
 * Escriba un método que tome una matriz de letras consecutivas (crecientes) como entrada y que devuelva la letra que falta en la matriz.
 * Siempre obtendrá una matriz válida. Y siempre faltará exactamente una letra. La longitud de la matriz siempre será de al menos 2.
 * La matriz siempre contendrá letras en un solo caso.
 *
 * Ejemplo:
 * ['a','b','c','d','f'] -> 'e'
 * ['O','Q','R','S'] -> 'P'
 * (¡Usa el alfabeto inglés con 26 letras!)
*/
public class findMissingLetter {
    public static void main(String[] args) {
        char[] array = {'a','b','c','d','f'};
        System.out.println(findMissingLetter(array));
    }

    public static char findMissingLetter(char[] array) {
        char missingLetter = ' ';
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                index = array[i];
            } else {
                if (array[i] != index + 1) {
                    missingLetter = (char) (index + 1);
                    break;
                }
                index++;
            }
        }
        return missingLetter;
    }
}
