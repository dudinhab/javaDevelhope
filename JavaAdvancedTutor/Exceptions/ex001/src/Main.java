/*
Scrivere una funzione che controlli se un numero int è in un determinato range. Se lo, è ritorna true ; se non lo è, lancia un'eccezione.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(verificaRange(num));
        } catch (InputMismatchException e) {
            System.out.println("inserimento non valido!");
        }
    }

    public static boolean verificaRange(int num) {
        try {
            if (num < 10 && num > 0) {
                System.out.println("É dentro del range!");
                return true;
            } else {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("Non è dentro del range");
            return false;
        }
    }
}
