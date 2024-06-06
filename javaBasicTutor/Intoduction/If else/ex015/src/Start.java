/*
Scrivere un programma che stampi i numeri da 1 a 100. Per i multipli di 3 stampi "Fizz" al posto del numero e per i multipli di 5 stampi "Buzz".
Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".
 */

public class Start {
    public static void main(String[] args) {
        //Creazione di un for per una ripetizione da 1 a 100
        for (int i = 0; i < 100; i++) {
            //il primo IF è un risultato se il modulo del numero da contare ha il modulo di 3 e 5 uguale a 5, allora è divisibile con 3 e 5
            if ((i % 3 == 0) && (i % 5 == 0)) {
                //Se la condizione è vera, verrà eseguito il blocco successivo
                System.out.println("FizzBuzz");
            } //se è negativo, rivedrà la condizione se è divisibile per 3
            else if (i % 3 == 0) {
                //Se la condizione è vera, verrà eseguito il blocco successivo
                System.out.println("Fizz");
            } //se è negativo, rivedrà la condizione se è divisibile per 5
            else if (i % 5 == 0) {
                //Se la condizione è vera, verrà eseguito il blocco successivo
                System.out.println("Buzz");
            } else {//Se nessuno dei 3 scenari è vero, verrà stampato solo il numero del conteggio.
                System.out.println(i);
            }
        }
    }
}
