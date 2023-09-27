package Store;

public class Apple extends GroceryProduct {
    // Specific attributes related to apples
    private String variety;

    public Apple() {
        super("Apple", 1.99); // Price per pound for apples
        this.variety = "Red Delicious"; // Default variety
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}