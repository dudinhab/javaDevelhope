import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Duda", 25));
        students.add(new Student("Samuel", 27));
        students.add(new Student("Nathalia", 28));
        students.add(new Student("Sandra", 51));
        students.add(new Student("Eduardo", 53));
        students.add(new Student("Paolo", 21));
        students.add(new Student("Riccardo", 19));
        students.add(new Student("Francesca", 45));
        students.add(new Student("Benedetto", 29));
        students.add(new Student("Alessandra", 37));
        students.add(new Student("Vincenzo", 11));
        students.add(new Student("Marco", 20));

        System.out.println("Inseriti: ");
        stampaArray(students);

        students.sort(Comparator.comparing(Student::getName));

        System.out.println("----------------------------------------");
        System.out.println("Ordenado: ");
        stampaArray(students);
    }

    public static void stampaArray(ArrayList<Student> s){
        for (Student i : s) {
            System.out.println(i.infoStudent());
        }
    }
}
