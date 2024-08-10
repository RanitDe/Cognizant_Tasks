import threading
import time
import json

# Define the Inventory class
class Inventory:
    def __init__(self):
        self.items = {}

    def add_item(self, item_name, quantity):
        if item_name in self.items:
            self.items[item_name] += quantity
        else:
            self.items[item_name] = quantity

    def remove_item(self, item_name, quantity):
        if item_name in self.items:
            if self.items[item_name] >= quantity:
                self.items[item_name] -= quantity
                if self.items[item_name] == 0:
                    del self.items[item_name]
            else:
                raise ValueError(f"Not enough {item_name} in stock to remove {quantity}")
        else:
            raise ValueError(f"Item {item_name} not found in inventory")

    def check_stock(self, item_name):
        return self.items.get(item_name, 0)

    # Implement the save_to_file() method
    def save_to_file(self, filename):
        try:
            with open(filename, 'w') as file:
                json.dump(self.items, file)
        except IOError as e:
            print(f"Error saving to file: {e}")

    # Implement the load_from_file() method
    def load_from_file(self, filename):
        try:
            with open(filename, 'r') as file:
                self.items = json.load(file)
        except IOError as e:
            print(f"Error loading from file: {e}")
        except json.JSONDecodeError as e:
            print(f"Error decoding JSON from file: {e}")

    # Implement stock level checking with threading
    def check_stock_levels(self, threshold):
        while True:
            for item, quantity in self.items.items():
                if quantity < threshold:
                    print(f"Restocking alert: {item} is low in stock ({quantity} remaining)")
            time.sleep(5)  # Check every 5 seconds

# Create an inventory instance, perform operations, and save the state
inventory = Inventory()
inventory.add_item("Apples", 50)
inventory.add_item("Bananas", 20)
inventory.remove_item("Apples", 10)
inventory.save_to_file("inventory_data.json")

# Load the inventory state from the file and print it
inventory.load_from_file("inventory_data.json")
print("Loaded inventory:", inventory.items)

# Start a thread to check stock levels
threshold = 15
stock_check_thread = threading.Thread(target=inventory.check_stock_levels, args=(threshold,))
stock_check_thread.daemon = True  # Daemon thread will stop when the main program exits
stock_check_thread.start()

# Simulate operations that might occur
time.sleep(2)  # Wait for stock check to run
inventory.remove_item("Bananas", 10)
inventory.save_to_file("inventory_data.json")

# Allow the stock checking thread to print restocking alerts
time.sleep(10)
