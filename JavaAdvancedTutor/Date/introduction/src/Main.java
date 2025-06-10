import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Horario de agora
        OffsetDateTime adesso = OffsetDateTime.now();
        System.out.println("Adesso: " + adesso);


        //Horario settado por string
        //OffsetDateTime ieri = OffsetDateTime.parse("2024-07-10T09:10:18+02:00");
        //Diminuindo um dia
        OffsetDateTime ieri = adesso.minusDays(1);
        System.out.println("Ieri: " + ieri);

        //Adicionando um dia
        OffsetDateTime domani = adesso.plusDays(1);
        System.out.println("Domani: " + domani);

        //horario settado por parametros
        OffsetDateTime primoGennaio = OffsetDateTime.of(2023, 1, 1, 15, 15, 0, 0, ZoneOffset.UTC);
        System.out.println("primoGennaio: " + primoGennaio);

        /*
            - Formato de exeibição de String FULL nao funciona com DateTime, só com Date, porque não pega a Zona
        String dateString = ieri.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
            - Os formatos podem ser mesclados
        String dateString = ieri.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.short));
        */
        /*Para resolver o problema sobe FULL e LONG, deve ser settado manualmente o formato da Zona, podendo ser em numero da Zona, ou nome da Zona
        ZonedDateTime ieri = OffsetDateTime.parse("2024-07-10T09:10:18+02:00").toZonedDateTime();
        ZonedDateTime ieri = OffsetDateTime.parse("2024-07-10T09:10:18+02:00").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
         */


        String dateString = ieri.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("dateString: " + dateString);

        //Formato settado manualmente
        String dateStringManuale = ieri.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy hh:mm a", Locale.ITALY));
        System.out.println("dateStringManuale: " + dateStringManuale);


    }
}
