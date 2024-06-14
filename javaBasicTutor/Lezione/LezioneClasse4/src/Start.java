/*
Dato un array arr di numeri naturali fino a n, trovare la dimensione massima per cui l'array arr può essere diviso in due array di uguali dimensioni, in modo tale che il primo array contenga tutti gli stessi elementi mentre il secondo array contenga tutti elementi distinti.
 */

import java.util.Arrays;
import java.util.Random;

public class Start {
    public static void main(String[] args) {
        int[] arrayInt = inserindoArray();
        countNumber(arrayInt);
    }

    private static void countNumber(int[] arrayInt) {
        int[] arrayCount = new int[arrayInt.length];
        for (int i = 0; i < arrayInt.length; i++) {
            int count = 0;
            for (int j = 0; j < arrayInt.length; j++) {
                if (arrayInt[i] == arrayInt[j]) {
                    count++;
                }
            }
            arrayCount[i] = count;
        }
        System.out.println("Array random: " + Arrays.toString(arrayInt));
        System.out.println("Array contagio: " + Arrays.toString(arrayCount));
    }

    //Metodo para ocupação de array com chamada do metodo random para atribuir cada posição
    public static int[] inserindoArray() {
        int[] randomInt = new int[10];
        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = randomInt();
        }
        return randomInt;
    }

    //Metodo para utilizar o Random
    public static int randomInt() {
        Random rand = new Random();
        int randInt = rand.nextInt(10);
        return randInt;
    }
}
