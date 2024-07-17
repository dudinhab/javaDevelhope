import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sum() {

        Main testing = new Main();
        int result = testing.sum(1,2);
        assertEquals(result,3);
    }
}