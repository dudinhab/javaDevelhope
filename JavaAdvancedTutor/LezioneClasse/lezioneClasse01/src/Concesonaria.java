import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Concesonaria {
    List<Veicolo> listaVeicoli = new ArrayList<Veicolo>();

    public void aggVeicolo(Veicolo veicolo) throws DuplicateVehicoloException {
        Optional<Veicolo> esiste = listaVeicoli.stream().filter(v -> v.getTarga().equals(veicolo.getTarga())).findAny();

        if (esiste.isPresent()) {
            throw new DuplicateVehicoloException("Vehicolo con questa targa giá esistente!");
        }
        System.out.println("Veicolo aggiunto!");
        listaVeicoli.add(veicolo);

    }

    public void aggVeicolo(List<Veicolo> veicolo) throws DuplicateVehicoloException {
        List<Veicolo> duplicate = new ArrayList<Veicolo>();
        for (Veicolo i : veicolo) {
            Optional<Veicolo> esiste = listaVeicoli.stream().filter(v -> v.getTarga().equals(i.getTarga())).findAny();

            if (esiste.isPresent()) {
                duplicate.add(i);
            } else {
                System.out.println("Veicolo aggiunto!");
                listaVeicoli.add(i);
            }
        }
        duplicate.forEach(v -> System.out.println(v.targa + " duplicata, per questo non é aggiunta!"));
    }
}

