import java.util.ArrayList;
import java.util.List;

/*
Creare una classe Team con i seguenti attributi:

teamName: String
players: Player[]
playerCount: int (inizializzato a 0)

Creare una classe astratta Person con i seguenti attributi:

firstName: String
lastName: String
age: int
Costruttore, getter per ogni attributo, e setter per l’attributo age.
Metodo astratto getRole(): ritorna una stringa che indica il ruolo della persona (e.g., "Player", "Coach").
Implementare una classe Player che eredita da Person e ha i seguenti attributi:

position: String
Costruttore che inizializza gli attributi e implementa i seguenti metodi:
getRole(): ritorna "Player".
Implementare una classe Coach che eredita da Person e ha i seguenti attributi:

experience: int (anni di esperienza)
Costruttore che inizializza gli attributi e implementa i seguenti metodi:
getRole(): ritorna "Coach".

//
Scrivere una classe Main dove:

Si creano due oggetti di tipo Player //e un oggetto di tipo Coach.
Si crea un array di Player e si passa al costruttore di Team.
Si stampa il ruolo di ciascuna persona.
//
Si cerca un giocatore per nome nel team e si stampa il risultato.

dentro classe team:
metodo che stampa tutti i ruoli delle persone presenti nell'ARRAY
metodo che dato il nome trovi la Persona corretta (player/coach)
metodo che aggiunge un nuovo player all'ARRAY

gestire la dimensione dinamicamente\
 */
public class Main {
    public static void main(String[] args) {

        Player[] players = new Player[3];
        players[0] = new Player("Duda", "Barone", 25, "Non lo so");
        players[1] = new Player("Samuel", "Barone", 26, "Non lo so");

        Coach coach = new Coach("Tutor", "Barone", 24, 3);

        System.out.println(coach.getRole());

        Team teamDuda = new Team("Duda", players, coach);
        players[2] = new Player("Luigi","Santos",32,"j");
        teamDuda.aggiungePlayer(players[2]);
        teamDuda.stampaRoleTeam();


    }
}
