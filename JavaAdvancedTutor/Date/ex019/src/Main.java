/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
Verificare che la prima data è precedente alla seconda
Verificare che la seconda data è successiva alla prima
Verificare che le due date sono uguali ad ora
Stampa il risultato
 */

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime offsetDateTime2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        //int precedenteAllaSeconda = offsetDateTime.compareTo(offsetDateTime2);
        //int successivaAllaPrima = offsetDateTime2.compareTo(offsetDateTime);
        boolean precedenteAllaSeconda = offsetDateTime.isBefore(offsetDateTime2);
        boolean successivaAllaPrima = offsetDateTime2.isAfter(offsetDateTime);

        String time1 = offsetDateTime.format(DateTimeFormatter.ofPattern("HH:mm"));
        String time2 = offsetDateTime2.format(DateTimeFormatter.ofPattern("HH:mm"));
        boolean oraUguali = time1.equals(time2);


        System.out.println("Prima data è precedente alla seconda? " + precedenteAllaSeconda);
        System.out.println("Seconda data è successiva alla prima? " + successivaAllaPrima);
        System.out.println("Le due date sono uguali ad ora? " + oraUguali);


    }
}
