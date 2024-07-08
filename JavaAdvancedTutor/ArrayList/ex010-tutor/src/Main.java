/*
Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Duda", 25));

        System.out.println("Array iniziale:");
        stampaArray(students);

        students.add(new Student("Samuel", 27));
        students.add(new Student("Riccardo", 26));
        students.add(new Student("Maria", 29));
        students.add(new Student("Francesco", 23));

        System.out.println("Array poi aggiornata:");
        stampaArray(students);
    }

    public static void stampaArray(ArrayList<Student> s) {
        for (Student i : s) {
            System.out.println(i.infoStudent());
        }
    }
}
