/*
Scrivi un programma che contenga un metodo che prende in ingresso un carattere e ne identifica il tipo per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operazione = scanner.next().charAt(0);

        //Dichiarare una variabile risultato che riceve come valore il ritorno dal metodo verifyOperazione, che sarà una String
        String result = verificaOperazione(operazione);
        System.out.println("La operazione " + result);
    }

    //Metodo di confronto per vedere quale operazione l'utente ha scelto
    public static String verificaOperazione(char operazione) {
        //Switch case per evidenziare la variabile che riceve l'input dell'utente, in modo che restituisca il valore dell'operazione indicata
        return switch (operazione) {
            case '+' -> "è una addizione";
            case '-' -> "è una sottrazione";
            case '*' -> "è una moltiplicazione";
            case '/' -> "è una divisione";
            default -> "non esiste"; //Se nessuno dei confronti è valido, utilizzerà questo blocco come predefinito
        };
         /*
        switch (operazione) {
            case '+':
                return "è una addizione";

            case '-':
                return "è una sottrazione";

            case '*':
                return "è una moltiplicazione";

            case '/':
                return "è una divisione";

            default: //Se nessuno dei confronti è valido, utilizzerà questo blocco come predefinito
                return "non esiste";

        }
          */

    }
}
