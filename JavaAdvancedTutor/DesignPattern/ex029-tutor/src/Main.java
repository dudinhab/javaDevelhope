/*
Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video
 */
public class Main {
    public static void main(String[] args) {
        PersonBuilder person = new PersonBuilder();
        person.setFirstName("Duda");
        person.setLastName("Barone");
        person.setAge(26);
        Person io = new Person(person);

        System.out.println(io);

    }
}
