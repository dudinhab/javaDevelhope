/*
Scrivere un programma che contenga un metodo che sfrutti il while loop e prenda in ingresso 1 valore intero come limite superiore e calcoli la somma di tutti i valori prima del limite e la stampi a video.
(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da calcolare: ");
        int a = scanner.nextInt();
        sumVariabile(a);
    }

    public static void sumVariabile(int a) {
        int sum = 0;

        System.out.println("Il numero scelto è: " + a);
        //for para fazer a repetição e utilizar para soma e exibição dos números que serão somados com limite indicado pela variavel que foi inputada pelo usuario
        for (int i = 0; i < a; i++) {
            //sum=sum+i;
            sum += i;
            System.out.print(i);
            if (i < (a - 1)) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }
        }
        System.out.println(sum);
    }
}
