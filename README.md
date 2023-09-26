# Assignment 1: Design Patterns
__Apple.Java (class):__
- "Apple" is a specific grocery product. 
- It inherits from 'GroceryProduct'. 
- Apple variety is one example of an attribute related to apples 
- Apples are priced per pound at $1.99, and "Red Delicious" is the default variety

__Apple.Java (class) screenshot:__ 

![image](https://github.com/Muji90/Assignment-1/assets/145510715/6717da24-f179-4a6f-8efd-a12953badcb7)

__AppleFactory.Java (class):__
- Creates Apple products using the Factory Method pattern.
- It inherits from the 'ConcreteGroceryProductFactory' class
- It overrides the 'createProduct' method to create apple products
- The apple products are created with the default price per pound

__AppleFactory.Java screenshot (class):__ 

![image](https://github.com/Muji90/Assignment-1/assets/145510715/5cc9bb9d-4bf8-4a7f-bce9-932a300466dc)

__Banana.Java (class):__
- It represents a specific grocery product "Banana"
- It inherits from the 'GroceryProduct' class
- It defines specific attributes related to bananas such as 'type'
- Default price per pound for bananas is set to $2.99 and the default type is "Regular"

__Banana.Java (class) sceenshot:__

![image](https://github.com/Muji90/Assignment-1/assets/145510715/0ec3178d-f78a-40f5-9625-fc099c38fabd)

__BananaFactory.Java (class):__
- It implements the factory method pattern for creating Banana products
- It inherits from the 'ConcreteGroceryProductFactory' class
- It overrides the 'createProduct' method to create Banana products
- The Banana products are created with the default price per pound

__BananaFactory.Java (class) sceenshot:__

![image](https://github.com/Muji90/Assignment-1/assets/145510715/a7a583dc-0fd2-4a91-a61e-f21d69bba4b9)

__ConcreteGroceryProductFactory.Java (class):__

- An abstract class that provides a common structure for concrete product factories
- It initializes a 'priceMap' to store price information for different grocery products
- The constructor reads price data from a data file and populates the 'priceMap'
- It also provides a method to get the price of a product based on its name ('getPrice')

__ConcreteGroceryProductFactory.Java (class) sceenshot:__ 

![image](https://github.com/Muji90/Assignment-1/assets/145510715/3ec786fd-cf2c-4fe6-b233-37c8d25aca20)

__DataFileReader.Java (class):__

- A placeholder class representing the mechanism for reading data from a data file
- It is mentioned in comments as a component that can be implemented based on the specific data file format. However, it's not implemented in the provided code

__DataFileReader.Java (class) sceenshot:__

![image](https://github.com/Muji90/Assignment-1/assets/145510715/14c6a86d-c1d5-4a93-ac96-f49ede022937)

__GroceryProduct.Java (class):__

- It represents a generic grocery product
- It contains attributes like 'name' and 'pricePerPound'
- Provides a method to calculate the cost of the product based on its weight ('calculateCost')

__GroceryProduct.Java (class) sceenshot:__  

![image](https://github.com/Muji90/Assignment-1/assets/145510715/d5a8f9c4-a4da-4070-9944-1fb617d87e52)

__GroceryProductFactory.Java (interface):__

- An interface defining the contract for creating different grocery product factories. Both 'AppleFactory' and 'BananaFactory' implement this interface

__GroceryProductFactory.Java (interface) screenshot:__

![image](https://github.com/Muji90/Assignment-1/assets/145510715/990bdc09-b41a-4660-8935-351d8738c3fd)

__GroceryProductTest.Java (class):__

- The main test class for the program
- Utilizes a 'Scanner' to input the pounds of bananas and apples
- Creates instances of Banana and Apple products using their respective factories
- Calculates the total cost based on the provided pounds of bananas and apples and displays the results

__GroceryProductTest.Java (class) screenshot:__

![image](https://github.com/Muji90/Assignment-1/assets/145510715/d2b2c0f7-64cd-4fc4-8bd3-c4b634ba946b)

