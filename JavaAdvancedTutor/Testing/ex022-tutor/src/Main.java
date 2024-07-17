import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*
Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Fai attenzione a usare almeno Java 8
Crea dei test per questo esercizio
 */

public class Main {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(formmatDate(offsetDateTime));
    }

    public static String formmatDate(OffsetDateTime date) {
        return date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
    }
}
