/*
 *Se le pide que eleve al cuadrado cada dígito de un número y los concatene.
 *Ejemplo #1: si ejecutamos 9119 a través de la función, saldrá 811181, porque 9 2 es 81 y 1 2 es 1. (81-1-1-81)
 *Ejemplo #2: Una entrada de 765 devolverá/debería devolver 493625 porque 7 2 es 49, 6 2 es 36 y 5 2 es 25. (49-36-25)
 *Nota: La función acepta un número entero y devuelve un número entero.
 */
public class SquareDigitConcatenation {
    public int squareDigit(int n) {
        String salida = ""; // Se inicializa una cadena vacía para almacenar el resultado
        String numero = String.valueOf(n); // Convierte el número entero en una cadena de caracteres
        for (int i = 0; i < numero.length(); i++) {
            int digito = Integer.parseInt(String.valueOf(numero.charAt(i))); // Obtiene el i-ésimo dígito y lo convierte a entero
            salida = salida + String.valueOf(digito * digito); // Eleva al cuadrado el dígito y agrega el resultado a la cadena salida
        }
        return Integer.parseInt(salida);
    }

    public static void main(String[] args) {
        SquareDigitConcatenation sdc = new SquareDigitConcatenation();
        System.out.println(sdc.squareDigit(9119));

        SquareDigitConcatenation sdc2 = new SquareDigitConcatenation();
        System.out.println(sdc2.squareDigit(765));
    }
}
