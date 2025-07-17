import org.junit.Test;
import static org.junit.Assert.*;

public class CurrencyConverterTest {
    @Test
    public void testUsdToPkr() {
        double result = CurrencyConverter.convert("USD", "PKR", 1);
        assertEquals(278.0, result, 0.1);
    }

    @Test
    public void testPkrToUsd() {
        double result = CurrencyConverter.convert("PKR", "USD", 278);
        assertEquals(1.0, result, 0.1);
    }
}
