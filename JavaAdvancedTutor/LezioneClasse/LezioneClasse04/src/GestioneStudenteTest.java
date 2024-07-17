import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GestioneStudenteTest {
    GestioneStudente testing = new GestioneStudente();

    @Test
    public void seLaListaStudenteEVuota() {
        List<Studente> result = testing.trovaStudentiConVotoSuperiore(10);
        Assert.assertEquals(result.size(), 0);
    }

    @Test
    public void seInputENullo() {
        Assert.assertThrows(NullPointerException.class, () -> testing.aggStudente(null));
    }
    
}
