/*
* Compruebe si una cadena tiene la misma cantidad de 'x' y 'o'.
* El método debe devolver un valor booleano y no distinguir entre mayúsculas y minúsculas.
* La cadena puede contener cualquier carácter.
*
* Ejemplos de entrada/salida:
* XO("ooxx") => true
* XO("xooxx") => false
* XO("ooxXm") => true
* XO("zpzpzpp") => true // cuando no hay 'x' ni 'o', debe devolver verdadero
XO("zzoo") => false
*/
public class GetXO {
    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("zzoo"));
    }

    public static boolean getXO(String str) {
        int countX = 0;
        int countO = 0;
        boolean result = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                countX++;
            } else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                countO++;
            }
        }
        if (countX == countO) {
            result = true;
        }
        return result;
    }
}
