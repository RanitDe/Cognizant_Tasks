## Exercise 6: Inventory Management with Map and HashMap

## Objectives:
•	Understand and use the Map interface and HashMap class.
•	Perform operations on a key-value pair collection.

## Business Scenario: 
You are developing an inventory management system for a store. Each product has a unique ID and associated details like name and quantity.
Tasks:
1.	Create a New Java Project:
•	Create a new Java project named InventoryManagement.
2.	Create a Product Class:
•	In the InventoryManagement project, create a class named Product with attributes id (int), name (String), and quantity (int).
3.	Create an InventoryManagement Class:
•	Create a class named InventoryManagement with a HashMap<Integer, Product> to store products.
4.	Add Products:
•	Implement a method addProduct(Product product) to add a product to the inventory.
5.	Remove Products:
•	Implement a method removeProduct(int productId) to remove a product by its ID.
6.	Update Product Quantity:
•	Implement a method updateProductQuantity(int productId, int newQuantity) to update the quantity of a product.
7.	Display Products:
•	Implement a method displayProducts() to display all products in the inventory.
8.	Testing:
•	Create a main class InventoryManagementTest with a main method.
•	Add, remove, update, and display products using the InventoryManagement class.
