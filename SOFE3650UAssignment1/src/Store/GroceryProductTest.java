package Store;

import java.util.Scanner;

public class GroceryProductTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Prompt the user for the pounds of bananas
			System.out.print("Enter the pounds of bananas: ");
			double poundsOfBananas = scanner.nextDouble();
			scanner.nextLine(); // Consume the newline character

			// Prompt the user for the pounds of apples
			System.out.print("Enter the pounds of apples: ");
			double poundsOfApples = scanner.nextDouble();
			scanner.nextLine(); // Consume the newline character

			// Create Banana and Apple products
			BananaFactory bananaFactory = new BananaFactory("data.txt");
			AppleFactory appleFactory = new AppleFactory("data.txt");

			GroceryProduct banana = bananaFactory.createProduct();
			GroceryProduct apple = appleFactory.createProduct();

			// Calculate the total cost
			double totalBananaCost = banana.calculateCost(poundsOfBananas);
			double totalAppleCost = apple.calculateCost(poundsOfApples);
			double totalPrice = totalBananaCost + totalAppleCost;

			System.out.println("Total cost for " + poundsOfBananas + " pounds of bananas: $" + totalBananaCost);
			System.out.println("Total cost for " + poundsOfApples + " pounds of apples: $" + totalAppleCost);
			System.out.println("Total cost for all products: $" + totalPrice);
		}
    }
}
