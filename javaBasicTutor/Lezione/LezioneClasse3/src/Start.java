/*
Scrivere un programma che dato un valore inserito dall'utente o dichiarato in una variabile, utilizzi un metodo che per i multipli di 3 stampi "multiplo di 3" al posto del numero e per i multipli di 5 stampi "multiplo di 5".
 * Nel caso in cui un numero sia multiplo di entrambi stampi "multiplo di entrambi".
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.print("Inserisci un numero per vedere si è multiplo di 3 o 5:");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();

        String result = numMultiplo(inputNum);

        System.out.println("Il número inserito ("+inputNum+") "+result);

        scanner.close();
    }

    public static String numMultiplo(int inputNum) {
        if ((inputNum%3==0)&&(inputNum%5==0)){
            return "è multiplo di entrambi";
        } else if (inputNum%3==0) {
            return "è multiplo di 3";
        }else if (inputNum%5==0) {
            return "è multiplo di 5";
        }else{
            return "non è multiplo di 3 o 5";
        }

    }
}
