## Exercise 3: Inventory Management with Restocking Alerts

## Objectives:
•	Use threading to handle asynchronous tasks.
•	Implement file I/O operations for data persistence.
•	Use exception handling for robust error management.

## Business Scenario:
Enhance the inventory management system to include restocking alerts and save inventory data to a file for persistence.

## Tasks:
1.	Create a new Python file named enhanced_inventory_management.py.
2.	Define a class Inventory with methods to add, remove, and check stock levels of items.
3.	Implement a method save_to_file() that saves the current inventory state to a file.
4.	Implement a method load_from_file() that loads the inventory state from a file.
5.	Use threading to periodically check stock levels and print restocking alerts for items that are low in stock.
6.	Add exception handling to manage file I/O errors.
7.	Create an inventory instance, perform some operations, and save the state to a file.
8.	Load the inventory state from the file and print it.
