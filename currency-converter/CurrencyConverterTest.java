import org.junit.Test;
import static org.junit.Assert.*;

public class CurrencyConverterTest {

    @Test
    public void testDollarToPoundAndEuro() {
        String[] args = {"100", "dollars"};
        try {
            CurrencyConverter.main(args);
        } catch (Exception e) {
            fail("Conversion from dollars failed.");
        }
    }

    @Test
    public void testNoArgumentsProvided() {
        try {
            String[] args = {};
            CurrencyConverter.main(args);
            fail("Should throw error for missing arguments.");
        } catch (Exception e) {
            // Expected: pass
        }
    }

    @Test
    public void testCaseInsensitiveCurrency() {
        String[] args = {"100", "DOLLARS"};
        try {
            CurrencyConverter.main(args);
        } catch (Exception e) {
            fail("Should accept uppercase currency.");
        }
    }
}
