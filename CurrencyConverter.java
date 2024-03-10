//Intern NITI Internship
//Domain Name -> Java Programming
//Task 3 -> (CurrencyConverter)
//Intern Name -> Dhiraj Kumar

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    // Create a HashMap to store exchange rates
    private static Map<String, Double> exchangeRates = new HashMap<>(); 

    public static void main(String[] args) {

        // Initialize exchange rates
        initializeExchangeRates();

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------Welcome To The Currency Converter---------------\n");

        System.out.println("Available Currencies: USD, EUR, GBP, INR, NPR");

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter source currency (USD, EUR, GBP, INR, NPR): ");
        String sourceCurrency = scanner.next().toUpperCase();

        System.out.print("Enter target currency (USD, EUR, GBP, INR, NPR): ");
        String targetCurrency = scanner.next().toUpperCase();

        if (exchangeRates.containsKey(sourceCurrency) && exchangeRates.containsKey(targetCurrency)) {
            double convertedAmount = amount * (exchangeRates.get(targetCurrency) / exchangeRates.get(sourceCurrency));
            System.out.println(amount + " " + sourceCurrency + " equals " + convertedAmount + " " + targetCurrency);
        } else {
            System.out.println("Invalid currency selection. Please choose from USD, EUR, GBP, INR, or NPR.");
        }

        scanner.close();
    }

    private static void initializeExchangeRates() {
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.82); 
        exchangeRates.put("GBP", 0.72); 
        exchangeRates.put("INR", 82.78); // 1 USD = 82.78 INR
        exchangeRates.put("NPR", 132.33); // 1 USD = 132.33 NPR
    }
}
