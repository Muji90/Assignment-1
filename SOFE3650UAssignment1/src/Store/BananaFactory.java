package Store;

public class BananaFactory extends ConcreteGroceryProductFactory {
    public BananaFactory(String dataFilePath) {
        super(dataFilePath);
    }

    @Override
    public GroceryProduct createProduct() {
        return new Banana();
    }
}