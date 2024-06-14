/*
Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri. Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.
 */

import java.util.Arrays;
import java.util.Random;

public class Start {
    public static void main(String[] args) {
        char[] values = inserindoArray();
        System.out.println(Arrays.toString(values));
        int contA = 0;
        int cont0 = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i]=='A'){
                contA++;
            }
            if (values[i]=='0'){
                cont0++;
            }
        }

        System.out.println("Contagem 0:" + cont0);
        System.out.println("Contagem A:" + contA);
    }

    //Metodo para ocupação de array com chamada do metodo random para atribuir cada posição
    public static char[] inserindoArray() {
        char[] arrayChar = new char[10];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = randomChar();
        }
        return arrayChar;
    }

    //Metodo para utilizar o Random
    public static char randomChar() {
        Random L1 = new Random();
        char a = (char) L1.nextInt(36); // A-Z + 0-9
        a += a > 9 ? 'A' - 10 : '0';
        return a;
    }

}
