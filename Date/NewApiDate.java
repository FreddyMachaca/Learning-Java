import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewApiDate {
    public static void main(String[] args) {
        //New API Date
        LocalDate ahora = LocalDate.now();
        System.out.println("Fecha: " + ahora);

        LocalTime hora = LocalTime.now();
        System.out.println("Hora: " + hora);

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println("Data e Hora: " + dataHora);
    }
}