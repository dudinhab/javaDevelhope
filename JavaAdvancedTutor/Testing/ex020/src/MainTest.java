import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class MainTest {

    @Test
    void sum() {
        Main testing = new Main();
        int result = testing.sum(1,2);
        assertEquals(result,3);
    }
}