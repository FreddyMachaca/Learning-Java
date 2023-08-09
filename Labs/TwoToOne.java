/*Tome 2 cadenas s1e s2incluya solo letras de aa z. Devuelve una nueva cadena ordenada,
 *la más larga posible, que contiene letras distintas, cada una tomada solo una vez, provenientes de s1 o s2.
 * Ejemplos:
 * a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq"
 * longest(a, b) -> "abcdefklmopqwxy"
 * a = "abcdefghijklmnopqrstuvwxyz"
 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
*/
public class TwoToOne {
    public static String longest(String s1, String s2){
        String s3 = s1 + s2;
        String s4 = "";
        for (int i = 0; i < s3.length(); i++) {
            if (!s4.contains(String.valueOf(s3.charAt(i)))) {
                s4 += s3.charAt(i);
            }
        }
        char[] s5 = s4.toCharArray();
        for (int i = 0; i < s5.length; i++) {
            for (int j = 0; j < s5.length - 1; j++) {
                if (s5[j] > s5[j + 1]) {
                    char temp = s5[j];
                    s5[j] = s5[j + 1];
                    s5[j + 1] = temp;
                }
            }
        }
        String s6 = "";
        for (int i = 0; i < s5.length; i++) {
            s6 += s5[i];
        }
        return s6;
    }

    public static void main(String[] args) {
        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
        System.out.println(longest("abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"));
    }
}
