/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
 */

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Integer anno = offsetDateTime.getYear();
        String mese = offsetDateTime.format(DateTimeFormatter.ofPattern("MMMM", Locale.ITALY));
        Integer giorno = offsetDateTime.getDayOfMonth();
        String giornoDellaSettimana = offsetDateTime.format(DateTimeFormatter.ofPattern("EEEE", Locale.ITALY));

        System.out.println("Anno: " + anno);
        System.out.println("Mese: " + mese);
        System.out.println("Giorno: " + giorno);
        System.out.println("Giorno della settimana: " + giornoDellaSettimana);
    }


}
