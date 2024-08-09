# Define a list of items with their quantities
inventory = [('item1', 10), ('item2', 0), ('item3', 5)]

# Write a function to check inventory
def check_inventory(inventory):
    for item, quantity in inventory:
        if quantity == 0:
            print(f"{item} is out of stock!")

# Iterate over the list and check the inventory
check_inventory(inventory)
