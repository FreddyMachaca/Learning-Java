import java.sql.DatabaseMetaData;
import java.text.SimpleDateFormat;
import java.util.*;

public class OldApiDate {
    public static void main(String[] args) {
        //Old API Date
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = formateador.format(ahora);
        System.out.println("Fecha: " + fecha);

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(ahora);
        calendario.add(Calendar.DAY_OF_MONTH,5);
        Date fechaFinal = calendario.getTime();
        String fecha2 = formateador.format(fechaFinal);
        System.out.println("Fecha: " + fecha2);

        if(fecha2.equals("22-07-2024")){
            System.out.println("No pagaste el sistema se borrara la base de datos");
            DatabaseMetaData dbmd = null;
        }else {
            System.out.println("El sistema sigue activo");
        }
    }
}
