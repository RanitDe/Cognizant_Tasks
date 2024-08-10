from abc import ABC, abstractmethod

# Define the DiscountStrategy interface
class DiscountStrategy(ABC):
    @abstractmethod
    def apply_discount(self, order_amount):
        pass

# Implement different discount strategies

class RegularDiscount(DiscountStrategy):
    def apply_discount(self, order_amount):
        return order_amount  # No discount for regular customers

class PremiumDiscount(DiscountStrategy):
    def apply_discount(self, order_amount):
        return order_amount * 0.9  # 10% discount for premium customers

class VIPDiscount(DiscountStrategy):
    def apply_discount(self, order_amount):
        return order_amount * 0.8  # 20% discount for VIP customers

# Define the Order class
class Order:
    def __init__(self, customer_type, order_amount):
        self.customer_type = customer_type
        self.order_amount = order_amount

    # Implement the final_price() method
    def final_price(self):
        # Select the appropriate discount strategy
        if self.customer_type == "regular":
            strategy = RegularDiscount()
        elif self.customer_type == "premium":
            strategy = PremiumDiscount()
        elif self.customer_type == "vip":
            strategy = VIPDiscount()
        else:
            raise ValueError("Unknown customer type")

        # Apply the discount
        return strategy.apply_discount(self.order_amount)

# Create instances of Order for different customer types
order1 = Order("regular", 100)  # Regular customer, $100 order
order2 = Order("premium", 100)  # Premium customer, $100 order
order3 = Order("vip", 100)      # VIP customer, $100 order

# Print the final prices after applying discounts
print(f"Final price for regular customer: ${order1.final_price():.2f}")
print(f"Final price for premium customer: ${order2.final_price():.2f}")
print(f"Final price for VIP customer: ${order3.final_price():.2f}")
