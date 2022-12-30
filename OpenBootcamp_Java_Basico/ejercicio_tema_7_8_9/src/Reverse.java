public class Reverse {
    public static void main(String[] args) {
        reverse("Hola Mundo");
    }

    public static void reverse(String texto){
        String reverse = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            reverse += texto.charAt(i); //charAt() devuelve el carácter en la posición especificada
        }
        System.out.println(reverse);
    }
}
