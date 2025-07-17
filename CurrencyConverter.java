import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        // Exchange rates relative to USD
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("PKR", 278.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("INR", 83.0);
    }

    public static double convert(String fromCurrency, String toCurrency, double amount) {
        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Invalid currency code.");
        }

        double amountInUSD = amount / exchangeRates.get(fromCurrency);
        return amountInUSD * exchangeRates.get(toCurrency);
    }

    public static void main(String[] args) {
        double converted = convert("USD", "PKR", 10);
        System.out.println("Converted amount: " + converted);
    }
