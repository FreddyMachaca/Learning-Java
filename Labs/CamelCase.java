/*Complete la solución para que la función rompa la tripa de camello, usando un espacio entre palabras.
 *Ejemplo
 * "camelCasing"  =>  "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""
*/
public class CamelCase {
    public static String camelCase(String str) {
        String[] words = str.split("(?=\\p{Upper})");
        String result = "";
        for (String word : words) {
            result += word + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
        System.out.println(camelCase("identifier"));
        System.out.println(camelCase(""));
    }
}
