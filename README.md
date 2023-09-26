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
__BananaFactory.Java (class) sceenshot:__

![image](https://github.com/Muji90/Assignment-1/assets/145510715/a7a583dc-0fd2-4a91-a61e-f21d69bba4b9)

- The Banana products are created with the default price per pound

__ConcreteGroceryProductFactory.Java (class):__

- An abstract class that provides a common structure for concrete product factories
- It initializes a 'priceMap' to store price information for different grocery products
- The constructor reads price data from a data file and populates the 'priceMap'
- It also provides a method to get the price of a product based on its name ('getPrice')

__ConcreteGroceryProductFactory.Java (class) sceenshot:__ 

![image](https://github.com/Muji90/Assignment-1/assets/145510715/3ec786fd-cf2c-4fe6-b233-37c8d25aca20)

