package Store;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class ConcreteGroceryProductFactory implements GroceryProductFactory {
    private Map<String, Double> priceMap = new HashMap<>();

    // Constructor to initialize price data from a data file
    public ConcreteGroceryProductFactory(String dataFilePath) {
        readPriceData(dataFilePath);
    }

    // Method to read price information from a data file
    private void readPriceData(String dataFilePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(dataFilePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String productName = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    priceMap.put(productName, price);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get the price of a product based on its name
    protected double getPrice(String productName) {
        return priceMap.getOrDefault(productName, 0.0);
    }
}