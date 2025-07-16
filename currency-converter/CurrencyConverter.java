import java.text.DecimalFormat;

public class CurrencyConverter {

    public static void main(String[] args) {
        String result = runTest(args);
        System.out.println(result);
        System.out.println("Thank you for using the converter.");
    }

    public static String runTest(String[] args) {
        if (args.length != 2) {
            return "Error: Please provide amount and currency (e.g., 50 dollars)";
        }

        try {
            double amount = Double.parseDouble(args[0]);
            return convert(amount, args[1]);
        } catch (NumberFormatException e) {
            return "Error: Amount must be a number.";
        }
    }

    public static String convert(double amount, String currencyInput) {
        DecimalFormat f = new DecimalFormat("##.##");
        String currency = currencyInput.toLowerCase();
        StringBuilder result = new StringBuilder();

        switch (currency) {
            case "dollars":
                result.append(amount).append(" Dollars = ").append(f.format(amount * 0.74)).append(" Pounds\n");
                result.append(amount).append(" Dollars = ").append(f.format(amount * 0.88)).append(" Euros");
                break;
            case "pounds":
                result.append(amount).append(" Pounds = ").append(f.format(amount * 1.36)).append(" Dollars\n");
                result.append(amount).append(" Pounds = ").append(f.format(amount * 1.19)).append(" Euros");
                break;
            case "euros":
                result.append(amount).append(" Euros = ").append(f.format(amount * 1.13)).append(" Dollars\n");
                result.append(amount).append(" Euros = ").append(f.format(amount * 0.84)).append(" Pounds");
                break;
            default:
                return "Error: Unsupported currency";
        }

        return result.toString();
    }
}
