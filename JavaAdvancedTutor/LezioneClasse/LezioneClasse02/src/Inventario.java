import java.util.List;
import java.util.Optional;

public class Inventario {
    private List<Prodotto> listaProdotti;

    public void aggProdotto(Prodotto prodotto) throws DuplicateProdottoException {
        Optional<Prodotto> pt = listaProdotti.stream().filter(p -> p.getNome().equals(prodotto.getNome())).findAny();
        if (pt.isPresent()) {
            throw new DuplicateProdottoException("Prodotto giá esistente " + prodotto.getNome());
        }
        listaProdotti.add(prodotto);
    }

    public void rimProdotto(Prodotto prodotto) throws DuplicateProdottoException{
        listaProdotti
                .stream()
                .filter(p -> p.getNome().equals(prodotto.getClass()))
                .findFirst()
                .map(p->listaProdotti.remove(p)).orElseThrow(()->new DuplicateProdottoException("Prodotto non esiste!"));
    }

    public Prodotto cercaProdotto(Prodotto prodotto) {
        return listaProdotti.
        (restituire il prodotto o lanciare un 'eccezione se non trovato).
    }

    public void stampareProdotti() {
        tutti i prodotti in una determinata categoria.
    }

    public void stampaDimensioneInventario() {
        Stampare la dimensione dell 'inventario e verificare se è vuoto.
    }

    public void rimuovereProdottiCat() {
        tutti i prodotti di una certa categoria.
    }

    public void ordinaPrezzo() {
        i prodotti per prezzo o per nome.
    }

}
