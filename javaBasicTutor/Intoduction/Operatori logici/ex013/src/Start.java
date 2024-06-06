/*
Scrivi un programma che contiene un metodo che dati 2 interi in ingresso ed un valore di confronto verifichi se il numero di confronto è compreso tra due valori specifici e stampi il risultato dell'operazione comprensivo dei due limiti (inferiore e superiore)
 */
public class Start {
    public static void main(String[] args) {
        //Creazione e assegnazione di valori alle variabili
        int primoValore = 3;
        int secondoValore = 1;
        int varConfronti = 2;

        //Chiamare la funzione logica senza ritorno
        traValori(primoValore, secondoValore, varConfronti);
    }

    //Creazione di una funzione che non restituirà nulla, ma mostrerà se il valore di confronto è compreso tra i due numeri indicati
    public static void traValori(int n1, int n2, int tra) {
        //Creazione di IF per vedere se il valore è inferiore al primo numero e maggiore del secondo numero
        if (n1 > tra && n2 < tra) {
            //se è positivo eseguirà il blocco successivo
            System.out.println("Il valore " + tra + " è tra " + n2 + " e " + n1);
        }//In caso contrario, prova un altro condizionale che corrisponderà se il valore di corrispondenza è maggiore del primo numero e minore del secondo numero
        else if (n1 < tra && n2 > tra) {
            //se è positivo eseguirà il blocco successivo
            System.out.println("Il valore " + tra + " è tra " + n1 + " e " + n2);
        } else {//ed infine, se nessuna delle due condizioni è idonea, significa che il valore non è compreso tra le due indicazioni, e bisogna eseguire l'ultimo blocco
            System.out.println("Il valore " + tra + " NON è tra " + n1 + " e " + n2);
        }
    }
}
