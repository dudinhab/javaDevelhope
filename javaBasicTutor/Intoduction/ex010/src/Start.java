/*
Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore scelto da te e le moltiplichi fra di loro.
Il metodo dovrà restituire il risultato dell'operazione che dovrà essere stampato a video.
 */

public class Start {
    public static void main(String[] args) {
        int a=1;
        int b=2;

        System.out.println("Questi sono i valori iniziali:");
        System.out.println("A = "+a);
        System.out.println("B = "+b);

        int resultato = incrementi(a,b);

        System.out.println("il valore della moltiplicazione dei valori incrementati, è: "+ resultato);


    }

    public static int incrementi(int a, int b) {
    a++;
    b++;

        System.out.println("Questi sono i valori incrementati:");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    return b*a;
    }
}
