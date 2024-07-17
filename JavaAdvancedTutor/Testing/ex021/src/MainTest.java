import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();
    private OffsetDateTime offsetDateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");

    @Test
    void formmatDateShort() {
        String result = testing.formmatDateShort(offsetDateTime);
        Assert.assertEquals("01/03/2002", result);
    }

    @Test
    void formmatDateMedium() {
        String result = testing.formmatDateMedium(offsetDateTime);
        assertEquals("1 de mar. de 2002", result);

    }

    @Test
    void formmatDateFull() {
        String result = testing.formmatDateFull(offsetDateTime);
        assertEquals("sexta-feira, 1 de março de 2002", result);

    }
}