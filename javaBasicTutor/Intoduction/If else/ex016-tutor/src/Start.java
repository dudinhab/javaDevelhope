/*
Scrivi un programma che calcoli la lunghezza di una stringa, sulla base di questa lunghezza stampi "Lunghezza maggiore di 10", "Lunghezza minore di 10" o "Lunghezza pari a 10".
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        //Chiamando la funzione di confronto lungheza
        confrontoLungheza(inputString);
    }

    //Metodo per confrontare la lunghezza della string con 10
    public static void confrontoLungheza(String input) {
        //Condizionale per vedere se la lunghezza è maggiore di 10
        if (input.length() > 10) {
            System.out.println("Lunghezza maggiore di 10");
        } else if (input.length() < 10) {  //Condizionale per vedere se la lunghezza è minore di 10
            System.out.println("Lunghezza minore di 10");
        } else if (input.length() == 10) {//Condizionale per vedere se la lunghezza è pari a 10
            System.out.println("Lunghezza pari a 10");
        }
    }
}
