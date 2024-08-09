# Define a variable for the order amount
order_amount = 150

# Write a function to apply a discount
def apply_discount(order_amount):
    if order_amount > 100:
        discount = order_amount * 0.10  # 10% discount
        return order_amount - discount
    else:
        return order_amount

# Calculate the final price for the example order
final_price = apply_discount(order_amount)

# Print the final price after applying the discount
print(f"The final price after applying the discount is: ${final_price}")
