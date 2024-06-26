/*
Creare interfacce Informazione
    2 metodi: mostraInformazione, calcoloPrezo
    Classe astratta strumento
    implementa interfaccia con due atributti marca e modelo
    sottoclasse pianoForte
    atributo numeroTasti
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di tasti di Piano forte:");
        int numeroTasti = scanner.nextInt();
        System.out.println("Inserisci il prezzo del Piano forte:");
        int prezzo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Inserisci la marca del Piano forte:");
        String marca = scanner.nextLine();
        System.out.println("Inserisci il modelo del di Piano forte:");
        String modelo = scanner.nextLine();



        PianoForte pianoForte = new PianoForte(numeroTasti,marca,modelo,prezzo);
        System.out.println(pianoForte.mostraInformazione());

    }
}
