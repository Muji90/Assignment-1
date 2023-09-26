# Assignment 1: Design Patterns
 __Apple.Java (class):__
- "Apple" is a specific grocery product. 
- It inherits from 'GroceryProduct'. 
- Apple variety is one example of an attribute related to apples. 
- Apples are priced per pound at $1.99, and "Red Delicious" is the default variety.
 __Apple.Java (class) screenshot:__
![image](https://github.com/Muji90/Assignment-1/assets/145510715/6717da24-f179-4a6f-8efd-a12953badcb7)
 AppleFactory (class):
- Creates Apple products using the Factory Method pattern.
- It inherits from the 'ConcreteGroceryProductFactory' class
- It overrides the 'createProduct' method to create apple products
- The apple products are created with the default price per pound
