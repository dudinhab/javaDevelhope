/*
Scrivere un programma che contenga un metodo che permetta di sostituire gli elementi duplicati in un array di interi con il valore -1. L'array ottenuto dovrà essere stampato a video.
 */

import java.util.Arrays;
import java.util.Random;

public class Start {
    public static void main(String[] args) {
        int[] valuesArray = arrayRandomNum();
        System.out.println("Valore Random: " + Arrays.toString(valuesArray));
        System.out.println("Valore sostituitto: " + Arrays.toString(removeRepetion(valuesArray)));
    }

    public static int[] arrayRandomNum() {
        Random rand = new Random();
        int[] random = new int[15];
        for (int i = 0; i < random.length; i++) {
            random[i] = rand.nextInt(10);
        }
        return random;
    }

    public static int[] removeRepetion(int[] arrayRandomNum) {
        int[] temp = new int[arrayRandomNum.length];
        int numRef;
        for (int i = 0; i < arrayRandomNum.length; i++) {
            numRef = arrayRandomNum[i];
            for (int i2 = i + 1; i2 < (arrayRandomNum.length); i2++) {
                if (arrayRandomNum[i2] == numRef) {
                    arrayRandomNum[i2] = -1;
                }
            }
        }
        return arrayRandomNum;
    }
}
