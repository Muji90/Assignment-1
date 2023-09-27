package Store;

public class Banana extends GroceryProduct {
    // Specific attributes related to bananas
    private String type;

    public Banana() {
        super("Banana", 2.99); // Price per pound for bananas
        this.type = "Regular"; // Default type
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

