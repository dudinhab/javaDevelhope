/*
Definire una funzione che accetti in ingresso una stringa e ne restituisca la lunghezza
 */

public class Start {
    public static void main(String[] args) {
        String a = "Duda";

        System.out.println("La lunghezza della variabile di tipo String con valore "+a+" é " + lunghezza(a));
    }
    public static int lunghezza(String a){
        return a.length();
    }
}
