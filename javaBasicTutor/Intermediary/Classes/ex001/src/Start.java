/*
Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente.
 */

public class Start {
    public static void main(String[] args) {
        Studente duda = new Studente("Duda","Barone",'F');


        System.out.println(duda.toString());
    }
}

class Studente {
    String nome;
    String cognome;
    char identificativo;

    public Studente(){

    }

    public Studente(String nome, String cognome, char identificativo) {
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = identificativo;
    }
}
