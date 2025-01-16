import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class CurrencyConverter {

    private static final String API_KEY = "97d1ccf314fa15fe63a16f69ccb7d904";
    private static final String API_URL = "http://api.exchangeratesapi.io/v1/latest";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("---------------------");

        while (true) {
            System.out.println("1. Convert currency");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    convertCurrency(scanner);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private static void convertCurrency(Scanner scanner) {
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the from currency (e.g., USD, EUR, NGN): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the to currency (e.g., USD, EUR, NGN): ");
        String toCurrency = scanner.next().toUpperCase();

        if (fromCurrency.equals(toCurrency)) {
            System.out.println("Cannot convert to the same currency.");
            return;
        }

        double result = convert(amount, fromCurrency, toCurrency);
        System.out.printf("%.2f %s = %.2f %s%n", amount, fromCurrency, result, toCurrency);
    }

    private static double convert(double amount, String fromCurrency, String toCurrency) {
        try {
            URL url = new URL(API_URL + fromCurrency);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + API_KEY);

            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("Failed to fetch exchange rates. Response code: " + responseCode);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONObject jsonObject = new JSONObject(response.toString());
            double rate = jsonObject.getJSONObject("rates").getDouble(toCurrency);

            return amount * rate;
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert currency", e);
        }
    }
}