public class Excepcion {
    public static void main(String[] args) {
        dividePorCero(4,0);
    }

    public static void dividePorCero(double a, double b) throws ArithmeticException{
        try {
            double resultado = a/b;
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse, error: " + e.getMessage());
        }finally {
            System.out.println("Demo de código");
        }
    }
}
