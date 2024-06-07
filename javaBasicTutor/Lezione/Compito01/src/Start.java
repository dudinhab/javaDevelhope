/*
Scrivi un programma che controlli se una stringa inserita dall'utente è palindroma
 */

import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        verificaString(inputString);
    }

    public static void verificaString(String input) {
        //Creazione di due array da sommare invertiti e poter confrontare
        int numString = input.length() - 1;
        String[] arrayInput = new String[numString];
        String[] arrayPalindroma = new String[numString];

        //per passare attraverso la sottostringa aggiungendo 0 alla dimensione dell'input nel primo array e nel secondo array aggiungendo nell'ordine opposto
        for (int i = 0; i < numString; i++) {
            arrayInput[i] = input.substring(i, i + 1);
            arrayPalindroma[numString] = arrayInput[i];
            numString--;
        }
        //Confrontare gli array utilizzando Equals
        if (Arrays.equals(arrayInput, arrayPalindroma)) {
            System.out.println("La String inserita " + input + " è un palindroma");
        } else {
            System.out.println("La String inserita " + input + " non è un palindroma");
        }
    }
}
