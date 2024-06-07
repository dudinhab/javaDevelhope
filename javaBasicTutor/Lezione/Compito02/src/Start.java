/*
Usando il while calcolami la serie di Fibonacci fino ad un numero scelto dall'utente
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        calcoliFibonacci(input);

        scanner.close();
    }

    public static void calcoliFibonacci(int input) {
        int fibonacci = 0;
        int ultimoFibonacci = 0;
        int penultimoFibonacci = 0;
        int a = 0;
        /*
        for (int i = 0; i < input; i++) {
            //Inicia a variavel ultimo como 0, e printa
            System.out.print(ultimoFibonacci);
            fibonacci = ultimoFibonacci + penultimoFibonacci;
            //Se i è uguale a 0, significa che è il primo numero di Fibonacci e basta aggiungere un solo valore all'ultima variabile valore per iniziare le somme.
            if (i == 0) {
                ultimoFibonacci = 1;
            } else {//In caso contrario, inizia a salvare l'ultima e la penultima variabile per poterle sommare
                penultimoFibonacci = ultimoFibonacci;
                ultimoFibonacci = fibonacci;
            }

            if (i == input - 1) {
                System.out.print(" : ");
            } else {
                System.out.print(" - ");
            }
        }
        */
        while (a < input) {
            //Inicia a variavel ultimo como 0, e printa
            System.out.print(ultimoFibonacci);
            fibonacci = ultimoFibonacci + penultimoFibonacci;
            //Se i è uguale a 0, significa che è il primo numero di Fibonacci e basta aggiungere un solo valore all'ultima variabile valore per iniziare le somme.
            if (a == 0) {
                ultimoFibonacci = 1;
            } else {//In caso contrario, inizia a salvare l'ultima e la penultima variabile per poterle sommare
                penultimoFibonacci = ultimoFibonacci;
                ultimoFibonacci = fibonacci;
            }

            if (a == input - 1) {
                System.out.print(" : ");
            } else {
                System.out.print(" - ");
            }
            a++;
        }
        System.out.println(fibonacci);
    }
}
