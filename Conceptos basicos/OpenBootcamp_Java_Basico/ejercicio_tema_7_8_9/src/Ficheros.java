import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Ficheros {
    public static void main(String[] args) {
        //copia el contenido de un fichero a otro
        try {
            InputStream fileIn = new FileInputStream("C:\\Users\\PC\\Desktop\\test.txt");
            byte[] datos = fileIn.readAllBytes();
            fileIn.close();

            PrintStream fileOut = new PrintStream("C:\\Users\\PC\\Desktop\\test2.txt");
            fileOut.write(datos);
            fileOut.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
