import org.junit.jupiter.api.Test;
import org.testng.Assert;


class MainTest {

    @Test
    void sum() {
        Main testing = new Main();
        int result = testing.sum(1,2);
        Assert.assertEquals(result,3);
    }
}