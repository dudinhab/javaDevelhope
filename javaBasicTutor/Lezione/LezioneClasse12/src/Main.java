/*
Traccia:
Creare una classe Course con i seguenti attributi:

courseName: String
credit: int (positivo)
Creare una classe astratta Person con i seguenti attributi:

firstName: String
lastName: String
age: int
Implementare anche un costruttore e getter per ogni attributo ed un setter per l’attributo age. Aggiungere i seguenti metodi astratti:

getRole(): ritorna una stringa che indica il ruolo della persona (e.g., "Student", "Professor").
Implementare una classe Student che eredita da Person e ha i seguenti attributi:

courses: Course[] (inizializzato con una dimensione massima di 5)
courseCount: int (inizializzato a 0)
Scrivere un costruttore che inizializzi gli attributi e implementi i seguenti metodi:

addCourse(Course c): aggiunge un corso all'array courses.
getRole(): ritorna "Student".
Implementare una classe Professor che eredita da Person e ha i seguenti attributi:

specialization: String
Scrivere un costruttore che inizializzi gli attributi e implementi i seguenti metodi:

getRole(): ritorna "Professor".
Scrivere una classe Main dove:

Si creano due oggetti di tipo Course.
Si crea un oggetto di tipo Student e un oggetto di tipo Professor.

 */
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Matematica",3);
        Course course2 = new Course("Literattura",4);

        Student student = new Student("Duda","Barone",25);
        Professor professor = new Professor("Samuel","Barone",28,"Python");


        student.addCourse(course1);
        student.addCourse(course2);

        System.out.println(student.getRole());
    }
}
