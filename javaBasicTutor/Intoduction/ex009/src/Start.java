/*
Definisci un metodo che calcoli la media tra 3 numeri e restituisca il risultato che dovrà essere stampato.
 */

public class Start {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 7;
        System.out.println("La media tra "+a+", "+b+" e "+c+" è: "+media(a,b,c));

    }

    public static float media(float a, float b, float c) {
        return (a+b+c)/3;
    }
}
