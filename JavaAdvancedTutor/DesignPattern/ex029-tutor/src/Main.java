import java.util.ArrayList;
import java.util.List;

/*
Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video
 */
public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        PersonBuilder personBuilder1 = new PersonBuilder();
        personBuilder.setFirstName("Duda");
        personBuilder.setLastName("Barone");
        personBuilder.setAge(26);
        personBuilder1.setFirstName("Riccardo");
        personBuilder1.setLastName("Fogli");
        personBuilder1.setAge(26);
        personBuilder1.setAddress("Via xx");
        List<Person> personList = new ArrayList();
        personList.add(new Person(personBuilder));
        personList.add(new Person(personBuilder1));

        System.out.println(personList);

    }
}
