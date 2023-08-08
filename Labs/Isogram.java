/*
 * Un isograma es una palabra que no tiene letras repetidas, consecutivas o no consecutivas.
 * Implemente una función que determine si una cadena que contiene solo letras es un isograma.
 * Suponga que la cadena vacía es un isograma. Ignorar mayúsculas y minúsculas.
 * Ejemplo: (Entrada --> Salida)
 * "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignorar mayúsculas y minúsculas)
 * isIsogram "Dermatoglyphics" = true
 * isIsogram "moose" = false
 * isIsogram "aba" = false
 */
public class Isogram {
    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i + 1).contains(str.substring(i, i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("moose"));
        System.out.println(isIsogram("aba"));
    }
}
