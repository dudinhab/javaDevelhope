/*
Dati due caratteri, restituire la somma dei loro valori ASCII
 */

public class Start {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        int sumAscii = (int)a+(int)b;

        System.out.println("il valore ASCII della variabile char 'a' è: "+(int)a);
        System.out.println("il valore ASCII della variabile char 'b' è: "+(int)b);
        System.out.println("La soma del due valore ASCII è: "+sumAscii);
    }
}