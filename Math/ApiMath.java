public class ApiMath {
    public static void main(String[] args) {
        // Valor absoluto
        int absInt = Math.abs(-10);
        double absDouble = Math.abs(-10.5);
        System.out.println("Valor absoluto de -10: " + absInt);
        System.out.println("Valor absoluto de -10.5: " + absDouble);

        // Arredondamento
        double ceilValue = Math.ceil(10.3);
        double floorValue = Math.floor(10.7);
        long roundValue = Math.round(10.5);
        System.out.println("Arredondamento para cima de 10.3: " + ceilValue);
        System.out.println("Arredondamento para baixo de 10.7: " + floorValue);
        System.out.println("Arredondamento de 10.5: " + roundValue);

        // Máximo e Mínimo
        int maxInt = Math.max(5, 10);
        double minDouble = Math.min(5.5, 2.2);
        System.out.println("Máximo entre 5 e 10: " + maxInt);
        System.out.println("Mínimo entre 5.5 e 2.2: " + minDouble);

        // Exponenciação e Logaritmos
        double powValue = Math.pow(2, 3);
        double sqrtValue = Math.sqrt(16);
        double logValue = Math.log(10);
        double log10Value = Math.log10(100);
        System.out.println("2^3: " + powValue);
        System.out.println("Raiz quadrada de 16: " + sqrtValue);
        System.out.println("Logaritmo natural de 10: " + logValue);
        System.out.println("Logaritmo base 10 de 100: " + log10Value);

        // Funções Trigonométricas
        double sinValue = Math.sin(Math.PI / 2);
        double cosValue = Math.cos(0);
        double tanValue = Math.tan(Math.PI / 4);
        System.out.println("Seno de π/2: " + sinValue);
        System.out.println("Cosseno de 0: " + cosValue);
        System.out.println("Tangente de π/4: " + tanValue);

        // Constantes
        double pi = Math.PI;
        double e = Math.E;
        System.out.println("Valor de π: " + pi);
        System.out.println("Valor de e: " + e);

    }
}
