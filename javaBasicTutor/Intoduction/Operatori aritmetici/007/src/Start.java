/*
Definisci un metodo per la divisione di 2 numeri interi che restituisca il quoziente che dovrà essere stampato.
 */

public class Start {
    public static void main(String[] args) {
    int a=7;
    int b=2;
        System.out.println("La divisione tra "+a+" e "+b+" è "+ quoziente(a,b));
    }

        public static float quoziente(int a,int b) {
        return (float) a/ (float) b;
    }
}