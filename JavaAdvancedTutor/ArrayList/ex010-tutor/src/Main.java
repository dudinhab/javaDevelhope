/*
Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Duda", 25));
        students.add(new Student("Samuel", 27));

        for (Student i : students) {
            System.out.println(i.infoStudent());
        }

        students.add(new Student("Riccardo", 26));

        for (Student i : students) {
            System.out.println(i.infoStudent());
        }

    }


}
