/*
Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0 e gestisca sia l'eccezione della divisione che quella di indice non presente nell'array, leggendone il messaggio. Eseguire sempre un blocco di codice scrivendo un messaggio in console.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);int[] numArray = new int[5];
            for (int i = 0; i < numArray.length ; i++) {
                System.out.println("Inserisci un numero");
                numArray[i]= scanner.nextInt();
            }
            divArray(numArray);
        }catch (InputMismatchException e){
            System.out.println("Input non valido!");
        }catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void divArray(int[] numArray) {
        try {
            for (int i = 0; i < numArray.length; i++) {
                    System.out.println(numArray[i] + " / " + i + " = " + numArray[i] / i);
            }
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}