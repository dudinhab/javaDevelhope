/*
Scrivi un programma che contiene un metodo che dati 2 interi in ingresso ed un valore di confronto
 verifichi se il numero di confronto è compreso tra due valori specifici e stampi il risultato dell'operazione comprensivo dei due limiti (inferiore e superiore)
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numConfronto = scanner.nextInt();
        int numInferiore = 2;
        int numSuperiore = 5;

        confrontoTraNumeri(numConfronto,numInferiore,numSuperiore);

        scanner.close();
    }

    public static void confrontoTraNumeri(int numConfronto, int numInferiore, int numSuperiore) {
        if ((numConfronto>numInferiore)&&(numSuperiore>numConfronto)){
            System.out.println("Il numero inserito: "+numConfronto+" è tra due numeri pre definiti ("+numInferiore+ " e "+numSuperiore+")");
        }else{
            System.out.println("Il numero non è tra due numeri pre definiti ("+numInferiore+ " e "+numSuperiore+")");
        }
    }
}
