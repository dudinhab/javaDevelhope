import java.util.ArrayList;
import java.util.List;

public class GestioneStudente {
    List<Studente> studenti;

    public GestioneStudente() {
        this.studenti = new ArrayList<Studente>();
    }

    public List<Studente> aggStudente(Studente s) throws Exception {
        if (s == null) {
            throw new NullPointerException();
        }
        studenti.add(s);
        return studenti;
    }

    public boolean rimStudente(Studente s) {
        return studenti.remove(s);
    }

    public List<Studente> trovaStudentiConVotoSuperiore(int voto) {
        List<Studente> studentiVotoSuperiore = new ArrayList<Studente>();

        studenti.forEach(i -> {
            if (i.getVoto() >= voto) {
                studentiVotoSuperiore.add(i);
            }
        });

        return studentiVotoSuperiore;
    }
}
