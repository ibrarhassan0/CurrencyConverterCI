import static org.junit.Assert.*;
import org.junit.Test;

public class CurrencyConverterTest {

    @Test
    public void testUsdToPkr() {
        double result = CurrencyConverter.convert("USD", "PKR", 1);
        assertEquals(278.0, result, 0.01);
    }

    @Test
    public void testPkrToUsd() {
        double result = CurrencyConverter.convert("PKR", "USD", 278);
        assertEquals(1.0, result, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCurrency() {
        CurrencyConverter.convert("XYZ", "USD", 10);
    }
}
