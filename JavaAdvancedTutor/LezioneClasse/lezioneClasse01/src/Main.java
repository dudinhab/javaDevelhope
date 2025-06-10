/*
Definire una classe astratta Veicolo con i campi comuni marca, modello, e targa.
Creare classi derivate Auto, Moto, e Furgone che estendono Veicolo.
Creare una lista di veicoli e aggiungere vari oggetti Auto, Moto, e Furgone.
Utilizzare stream() per rimuovere duplicati basati sulla targa.
Gestire le eccezioni per targa duplicata.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws DuplicateVehicoloException {
        List<Veicolo> veicolos = new ArrayList<Veicolo>();
        System.out.println(veicolos.stream().filter(v -> v.getTarga().equals("a")).findAny());
        veicolos.add(new Furgone("a","a","a"));
        veicolos.add(new Furgone("a","a","a"));
        veicolos.add(new Furgone("b","b","b"));
        veicolos.add(new Furgone("c","c","c"));
        veicolos.add(new Furgone("c","c","c"));
        veicolos.add(new Moto("d", "d", "d")) ;

        Concesonaria concesonaria = new Concesonaria();
        concesonaria.aggVeicolo(veicolos);


    }
}
