/*
Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni
 */

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime offsetDateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String dateStringShort = offsetDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        String dateStringMedium = offsetDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        String dateStringFull = offsetDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL));

        System.out.println("Format Short:");
        System.out.println(dateStringShort);
        System.out.println("Format Medium:");
        System.out.println(dateStringMedium);
        System.out.println("Format Full:");
        System.out.println(dateStringFull);
    }
}
