/*
Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i numeri fino al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        //While per ripetere finché il blocco finché il numero inserito non sarà uguale a 5
        while (input!=5){
            System.out.print("Inserisci un numero:");
            input = scanner.nextInt();
            //IF per non fare il for, se il numero inserito è 5
            if(input==5){
                System.out.println("Il numero inserito è 5. Fine di programa");
                break;
            }
            //For per contare e exibire da 0 al numero inserito
            for (int i = 1; i <= input; i++) {
                System.out.println(i);
            }
        }
    }
}
