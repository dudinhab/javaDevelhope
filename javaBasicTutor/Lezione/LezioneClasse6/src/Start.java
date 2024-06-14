/*
Creare una classe  Studente con nome e voto
Creare altra classe GestioneStudenti array di Studenti
 */

//1 - agg/ 2 - visualizza/ 3- Calcola media / 4-Esci
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestioneStudenti registroClasse = new GestioneStudenti();
        boolean a=true;
        do {
            System.out.println("1 - agg / 2 - visualizza/ 3- Calcola media / 4-Esci");
            int numeroInserito= scanner.nextInt();
            scanner.nextLine();

            switch (numeroInserito){
                case 1:
                    System.out.print("Nome:");
                    String nomeUtente = scanner.nextLine();
                    System.out.print("Voto:");
                    float votiUtente = scanner.nextFloat();
                    scanner.nextLine();
                    registroClasse.aggiungiStudente(nomeUtente,votiUtente);
                    break;
                case 2:
                    registroClasse.visualizaStudenti();
                    break;
                case 3:
                    System.out.println("La media è: "+registroClasse.calcolaMedia());
                    break;
                case 4:
                    a=false;
                    break;
                default:
                    System.out.println("Comando non riconosciuto!");
            }

        }while (a);
    }
}
