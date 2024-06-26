/*
Scrivere una funzione che accetti in input un numeratore e un denominatore
Controlli che il numeratore e il denominatore non siano null
Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci un numeratore:");
            String num = scanner.nextLine();
            System.out.println("Inserisci un denominatore:");
            String den = scanner.nextLine();

            System.out.println(div(num, den));

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static double div(String num, String den) {
        try {
            double numDouble = parseDouble(num);
            double denDouble = parseDouble(den);
            return numDouble / denDouble;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
