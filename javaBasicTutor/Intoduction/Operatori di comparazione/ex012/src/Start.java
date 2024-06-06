/*
Scrivi un programma che contiene un metodo che che confronti due caratteri e determini se sono diversi.
Il programma dovrà stampare a video i due caratteri e il risultato dell'eguaglianza.
 */

public class Start {
    public static void main(String[] args) {
        //variabili che riceveranno i valori per il confronto
        int a =3;
        int b = 4;

        //chiamando il metodo e passando due valori interi per ritornare se sono diversi
        boolean risultato = confronti(a,b);

        //output in video con il risultato dell metodo
        System.out.println("Il valore della variabile A ("+a+") e B ("+b+") sono diversi? "+risultato);
    }

    //creazione di un metodo per confrontare due numeri passati come parametri
    public static boolean confronti(int a, int b) {
        //confronto dei due numeri ricevuti come parametro e ritorno in booleano per scoprire se è true (diverso) o false (uguale)
        return !(a==b);
    }
}
