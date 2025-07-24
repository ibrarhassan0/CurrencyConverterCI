public class CurrencyConverter {

    public double convert(String fromCurrency, String toCurrency, double amount) {
        double rate = getExchangeRate(fromCurrency, toCurrency);
        return amount * rate;
    }

    private double getExchangeRate(String fromCurrency, String toCurrency) {
        // Dummy exchange rates
        if (fromCurrency.equals("USD") && toCurrency.equals("PKR")) {
            return 278.5;
        } else if (fromCurrency.equals("PKR") && toCurrency.equals("USD")) {
            return 1 / 278.5;
        } else if (fromCurrency.equals(toCurrency)) {
            return 1.0;
        } else {
            throw new IllegalArgumentException("Unsupported currency conversion.");
        }
    }
}
// small change for demo
