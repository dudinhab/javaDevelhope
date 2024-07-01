import java.util.InputMismatchException;
import java.util.Scanner;

/*
Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing
 */
public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci un numero intero:");
            int numInt1 = scanner.nextInt();
            System.out.println("Inserisci altro numero intero:");
            int numInt2 = scanner.nextInt();
            System.out.println("Inserisci un numero double:");
            double numDouble = scanner.nextDouble();
            System.out.println("Inserisci un char:");
            char charValue = scanner.next().charAt(0);

            Integer numInteger1 = Integer.valueOf(numInt1);
            Integer numInteger2 = Integer.valueOf(numInt2);
            Double numDouble2 = Double.valueOf(numDouble);
            Character characterValue = Character.valueOf(charValue);

            sommaInt(numInt1, numInt2);
            stampaChar(charValue);
            sommaInteger(numInteger1, numInteger2);
            stampaCharacter(characterValue);

            scanner.close();
        }catch (InputMismatchException e){
            System.out.println("Il valore inserito non è valido");
        }

    }

    public static void sommaInt(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
    }

    public static void stampaChar(char a) {
        System.out.println("Char della variabile: " + a);
    }

    public static void sommaInteger(Integer num1, Integer num2) {
        System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
    }

    public static void stampaCharacter(Character a) {
        System.out.println("Character della variabile: " + a);
    }
}