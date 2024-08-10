# Lists
product_names = ['Laptop', 'Mouse', 'Keyboard', 'Monitor']

def add_product(product):
    product_names.append(product)

def remove_product(product):
    if product in product_names:
        product_names.remove(product)

def update_product(old_product, new_product):
    if old_product in product_names:
        index = product_names.index(old_product)
        product_names[index] = new_product


# Dictionaries
products = {
    'Laptop': {'quantity': 10, 'price': 1000},
    'Mouse': {'quantity': 50, 'price': 20},
    'Keyboard': {'quantity': 30, 'price': 50},
    'Monitor': {'quantity': 20, 'price': 150}
}

def add_product_details(name, quantity, price):
    products[name] = {'quantity': quantity, 'price': price}

def update_product_details(name, quantity=None, price=None):
    if name in products:
        if quantity is not None:
            products[name]['quantity'] = quantity
        if price is not None:
            products[name]['price'] = price

def delete_product_details(name):
    if name in products:
        del products[name]


# Tuples
laptop_data = ('Laptop', 10, 1000)
mouse_data = ('Mouse', 50, 20)

product_catalog = (laptop_data, mouse_data)

def display_catalog():
    for product in product_catalog:
        print(f"Product: {product[0]}, Quantity: {product[1]}, Price: {product[2]}")


# Sets
product_categories = {'Electronics', 'Accessories'}

def add_category(category):
    product_categories.add(category)

def remove_category(category):
    product_categories.discard(category)


# Combining Collections
def generate_price_report():
    sorted_products = sorted(products.items(), key=lambda item: item[1]['price'])
    for name, details in sorted_products:
        print(f"Product: {name}, Price: {details['price']}")

def find_products_in_price_range(min_price, max_price):
    result = {name for name, details in products.items() if min_price <= details['price'] <= max_price}
    return result


# Example usage
if __name__ == "__main__":
    add_product('Tablet')
    update_product('Mouse', 'Gaming Mouse')
    remove_product('Monitor')
    
    add_product_details('Tablet', 15, 300)
    update_product_details('Laptop', price=950)
    delete_product_details('Keyboard')
    
    display_catalog()
    
    add_category('Tablets')
    remove_category('Accessories')
    
    generate_price_report()
    
    products_in_range = find_products_in_price_range(100, 500)
    print(f"Products in price range 100-500: {products_in_range}")
