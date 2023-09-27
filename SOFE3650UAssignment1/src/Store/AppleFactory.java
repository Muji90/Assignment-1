package Store;

public class AppleFactory extends ConcreteGroceryProductFactory {
    public AppleFactory(String dataFilePath) {
        super(dataFilePath);
    }

    @Override
    public GroceryProduct createProduct() {
        return new Apple();
    }
}
