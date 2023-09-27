package Store;

public class GroceryProduct {
    private String name;
    private double pricePerPound;

    public GroceryProduct(String name, double pricePerPound) {
        this.name = name;
        this.pricePerPound = pricePerPound;
    }

    public String getName() {
        return name;
    }

    public double getPricePerPound() {
        return pricePerPound;
    }

    public double calculateCost(double weight) {
        return pricePerPound * weight;
    }
}
