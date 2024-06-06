/*
Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.print("Inserisci un numero per vedere la tabellina aritimetica:");
        Scanner scanner = new Scanner(System.in);
        int numeroScelto = scanner.nextInt();

        tabellinaAritmetica(numeroScelto);
        scanner.close();
    }

    //Metodo Void che visualizza le righe di ogni passaggio di for
    public static void tabellinaAritmetica(int a) {
        //For che visualizza il valore della tavola periodica ripetendo 10 volte, aumentando ad ogni turno
        for (int i = 1; i < 11; i++) {
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }
}
