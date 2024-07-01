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
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci un numeratore:");
            String num = "b";
            System.out.println("Inserisci un denominatore:");
            String den = "a";
            System.out.println(div(num, den));
    }

    public static String div(String num, String den) {
        /*
        try {
            double numDouble = parseDouble(num);
            double denDouble = parseDouble(den);
            return numDouble / denDouble;
        } catch (NullPointerException e) {
            System.out.println("Numeratore o denominatore non possono essere nulli.");
        } catch(ArithmeticException e){
            System.out.println("Impossibile il denominatore essere 0.");
        }
         */

        try {
            if (num == null || den == null) {
                throw new NullPointerException("Numeratore o denominatore non possono essere nulli.");
            } else if (parseDouble(den) == 0) {
                throw new ArithmeticException("Impossibile il denominatore essere 0.");
            }
            return "La divisione tra " + num + " e " + den + " é uguale: " + parseDouble(num) / parseDouble(den);
        } catch (NullPointerException | ArithmeticException e) {
            return e.getMessage();
        }catch (IllegalArgumentException e){
            return "Il valore inserito non è valido!";
        }
    }
}
