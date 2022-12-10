import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");

        int numeroDecimal=0;

        //try = intentar/probar
        try {
            numeroDecimal = Integer.parseInt(numeroStr); //convierte el número ingresado a entero
        //catch = Capturar/Interceptar
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String mensajeBinario = "numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        String mensajeOctal = "numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        String mensajeHexadecimal = "numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);

        String mensaje = "Numero ingresado = " + numeroDecimal;
        mensaje += "\n" + mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
