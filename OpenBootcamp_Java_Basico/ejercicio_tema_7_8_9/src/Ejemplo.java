import java.io.PrintStream;
import java.util.*;
public class Ejemplo {
    public static void main(String[] args) {
        //EJEMPLO A ELECCIÓN
        //consiste en copiar el contenido de un fichero a otro utilizando un hashmap y un arraylist

        //creamos un hashmap con el contenido del fichero
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1", "Hola");
        hashMap.put("2", "Mundo");

        //creamos un arraylist con el contenido del hashmap
        ArrayList<String> arrayList = new ArrayList<String>(hashMap.values());

        //copiamos el contenido del arraylist en un fichero
        try {
            PrintStream fileOut = new PrintStream("C:\\Users\\PC\\Desktop\\test2.txt");
            for(String list: arrayList){
                fileOut.println(list);
            }
            fileOut.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
