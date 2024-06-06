/*
Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore scelto da te e le moltiplichi fra di loro.
Il metodo dovrà restituire il risultato dell'operazione che dovrà essere stampato a video.
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Questi sono i valori iniziali:");
        System.out.println("A = " + num1);
        System.out.println("B = " + num2);
        //Chiamando il metodo e atribuindo a una variabile
        int resultato = incrementi(num1, num2);

        System.out.println("il valore della moltiplicazione dei valori incrementati, è: " + resultato);
    }

    //Metodo che fará incrementi e multiplizione tra di loro
    public static int incrementi(int num1, int num2) {
        //Incrementi di 3 nell due variabile
        num1 += 3;
        num2 += 3;

        System.out.println("Questi sono i valori incrementati:");
        System.out.println("A = " + num1);
        System.out.println("B = " + num2);
        //return di valore multiplicato tra loro
        return num1 * num2;
    }
}
