/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia
 */

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime offsetDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        System.out.println("Data iniziale: " + offsetDateTime);
        ZonedDateTime dataAggiornata = offsetDateTime.plusYears(1).minusMonths(1).plusDays(7);
        String dataAggiornataFormat = offsetDateTime.format(DateTimeFormatter.ofPattern("EEEE | DD-MMMM-YYYY | HH:mm | zzzz"));

        System.out.println("Data aggiornata: " + dataAggiornataFormat);
    }
}
