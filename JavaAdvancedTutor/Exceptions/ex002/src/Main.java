/*
Scrivere una funzione che controlli se un carattere è un numero, altrimenti lanciare una eccezione.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            char inputChar = scanner.next().charAt(0);
            System.out.println(inputChar);
            verificaChar(inputChar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verificaChar(char inputChar) {
        if ('0' <= inputChar && inputChar <= '9') {
            System.out.println(inputChar + " is a number!");
        } else {
            throw new NumberFormatException(inputChar + " is not a number!");
        }
    }
}
