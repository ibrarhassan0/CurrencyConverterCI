import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CurrencyConverterTest {

    @Test
    public void testUSDToPKR() {
        CurrencyConverter converter = new CurrencyConverter();
        double result = converter.convert("USD", "PKR", 1);
        assertEquals(278.5, result, 0.01);
    }

    @Test
    public void testPKRToUSD() {
        CurrencyConverter converter = new CurrencyConverter();
        double result = converter.convert("PKR", "USD", 278.5);
        assertEquals(1.0, result, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCurrency() {
        CurrencyConverter converter = new CurrencyConverter();
        converter.convert("USD", "EUR", 100);
    }
}
