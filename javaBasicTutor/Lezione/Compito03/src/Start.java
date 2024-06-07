/*
Crea un array e ordinalo con un metodo creato da te
 */

import java.util.Arrays;
import java.util.Random;

public class Start {
    public static void main(String[] args) {
        int[] values = randomNumber();
        System.out.println("Array con Random number: " + Arrays.toString(values));
        System.out.println("Array con Random number: " + Arrays.toString(orderRandom(values)));
    }

    public static int[] randomNumber() {
        Random random = new Random();
        int[] arrayRandom = new int[10];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = random.nextInt(100);
        }
        return arrayRandom;
    }

    public static int[] orderRandom(int[] values) {
        for (int i = 0; i < values.length; i++) {
            //For per gestire il confronto
            for (int j = 0; j < values.length - 1; j++) {
                //For per gestire il confronto
                if (values[i] < values[j]) {
                    //Se il numero confrontato è inferiore al confronto
                    //Verrà creata una variabile ausiliaria che riceverà il valore confrontato
                    int aux = values[i];
                    //Nella posizione del valore confrontato verrà consegnata la variabile confrontata
                    values[i] = values[j];
                    //Nella posizione della variabile che aveva il numero più piccolo veniva aggiunto il valore che si stava confrontando
                    values[j] = aux;
                }
                //Se si utilizza If, i valori degli array in un dato indice vengono modificati nella posizione confrontata, in questo caso indice I
            }
        }
        return values;
    }
}
