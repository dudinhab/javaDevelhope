/*
Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca il nome del giorno della settimana come stringa o una stringa di errore nel caso di valore maggiore di 7 o minore di 1.
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        //crea una variabile e organizzarla in modo che l'utente riceva un valore di input
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
//Chiamando il metodo e passando come parametro la variabile inserita dall'utente
        dayOfTheWeek(day);
    }

    //Creazione di un metodo che controlli quale giorno della settimana viene utilizzato come riferimento in base al numero inserito dall'utente
    public static void dayOfTheWeek(int day) {

        switch (day) {
            case 1:
                System.out.println("Il giorno della settimana è: Lunedi");
                break;

            case 2:
                System.out.println("Il giorno della settimana è: Martedi");
                break;

            case 3:
                System.out.println("Il giorno della settimana è: Mercoledi");
                break;

            case 4:
                System.out.println("Il giorno della settimana è: Giovedi");
                break;

            case 5:
                System.out.println("Il giorno della settimana è: Venerdi");
                break;

            case 6:
                System.out.println("Il giorno della settimana è: Sabato");
                break;

            case 7:
                System.out.println("Il giorno della settimana è: Domenica");
                break;

            default:
                System.out.println("Questo giorno non esiste!");
                break;
        }

    }
}
