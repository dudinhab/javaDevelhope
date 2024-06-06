/*
Scrivi un programma che contiene un metodo che prenda un numero in ingresso e capisca se un numero è pari o dispari utilizzando solo gli operatori logici.
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumero = scanner.nextInt();

        boolean result = isEven(inputNumero);

        System.out.println("Il número " + inputNumero + " è " + (result?"pari":"impari"));
    }

    public static boolean isEven(int a) {
        //la variabile b riceve il valore bit per bit e restituisce 0, se è un numero pari, e 1 se è un numero dispari.
        int isEven = a & 1;
        //L'operazione eseguita nel blocco successivo indica che se b è uguale a 0, ritorna vero (pari), altrimenti ritorna false (dispari)
        return isEven == 0;
    }
}