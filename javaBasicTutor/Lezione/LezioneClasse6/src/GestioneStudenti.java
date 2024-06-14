import java.util.Arrays;

public class GestioneStudenti {
    private int numStudentiMax;
    private Studente[] studente;

    public GestioneStudenti() {
        this.studente = new Studente[100];
        this.numStudentiMax = 0;
    }

    public void aggiungiStudente(String nome, float voto) {
        if (studente.length > numStudentiMax) {
            Studente studenteTemp = new Studente(nome, voto);
            studente[numStudentiMax] = studenteTemp;
            numStudentiMax++;
        } else {
            System.out.println("Numero massimo arrivato!");
        }
    }

    // public String visuStudente(){
    //     for (int i = 0; i < studente.length; i++) {
    //         if (studente[i]!=null) {
    //             return Arrays.toString(studente);
    //         }
    //     }
    // }
    //tre metodi aggiungi studente(nome e voto), visualiza studenti(getStudenti), calcola media voti
    public void visualizaStudenti() {
        for (int i = 0; i < numStudentiMax; i++) {
            System.out.println(studente[i].toString());
        }
    }

    public float calcolaMedia() {
        float totalVoti = 0;
        if (numStudentiMax > 0) {
            for (int i = 0; i < numStudentiMax; i++) {
                totalVoti += studente[i].getVoto();
            }
            return totalVoti / numStudentiMax;
        }
        return 0;
    }
}
