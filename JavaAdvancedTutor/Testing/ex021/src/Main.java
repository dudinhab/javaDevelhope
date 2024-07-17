/*
Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni -Crea dei test per questo esercizio
 */

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(formmatDateShort(offsetDateTime));
        System.out.println(formmatDateMedium(offsetDateTime));
        System.out.println(formmatDateFull(offsetDateTime));
    }

    public static String formmatDateShort(OffsetDateTime date) {
        return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }

    public static String formmatDateMedium(OffsetDateTime date) {
        return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    public static String formmatDateFull(OffsetDateTime date) {
        return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

}
