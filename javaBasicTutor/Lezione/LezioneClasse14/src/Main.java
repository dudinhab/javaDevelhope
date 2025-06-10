/*
Esercizio 1: Sistema di Gestione Studenti e Corsi
Traccia:
Creare una classe Course con i seguenti attributi:

courseName: String
credit: int (positivo)
Creare una classe astratta Person con i seguenti attributi:

firstName: String
lastName: String
age: int
Costruttore, getter per ogni attributo, e setter per l’attributo age.
Metodo astratto getRole(): ritorna una stringa che indica il ruolo della persona (e.g., "Student", "Professor").
Implementare una classe Student che eredita da Person e ha i seguenti attributi:

courses: Course[] (inizializzato con una dimensione massima di 5)
courseCount: int (inizializzato a 0)
Costruttore che inizializza gli attributi e implementa i seguenti metodi:
addCourse(Course c): aggiunge un corso all'array courses.
getRole(): ritorna "Student".
findCourseByName(String courseName): cerca un corso per nome e ritorna il corso se trovato, altrimenti ritorna null.
Implementare una classe Professor che eredita da Person e ha i seguenti attributi:

specialization: String
Costruttore che inizializza gli attributi e implementa i seguenti metodi:
getRole(): ritorna "Professor".
Scrivere una classe Main dove:

Si creano due oggetti di tipo Course.
Si crea un oggetto di tipo Student e un oggetto di tipo Professor.
Si aggiungono i corsi al Student.
Si stampa il ruolo di ciascuna persona.
Si cerca un corso per nome e si stampa il risultato.
 */
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Python",3);
        Course course2 = new Course("Mat",4);

        Student student = new Student("Duda","Barone",25);
        Professor professor = new Professor("Samuel", "Barone", 28, "Python");

        student.addCourse(course1);
        student.addCourse(course2);

        System.out.println(student.getRole());
        System.out.println(professor.getRole());
        System.out.println(student.findCourseByName("Python"));

    }
}
