import java.util.ArrayList;
import java.util.HashSet;

public class GestoreProdotti {
    ArrayList<ProdottoElettronico> listaProdotti;

    public void aggiungeProdotto(ProdottoElettronico p) throws DuplicateNameException{
        for (ProdottoElettronico i:listaProdotti){
            if (i.toString()==p.toString()){
                new throw DuplicateNameException;
            }
        }
        listaProdotti.add(p);
    }

}
