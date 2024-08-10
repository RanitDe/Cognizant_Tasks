## Exercise 2: Dynamic Order Processing System with Discount Strategy

## Objectives:
•	Use design patterns (Strategy Pattern) to implement dynamic behavior.
•	Apply polymorphism and interfaces.

## Business Scenario: 
You need to implement a dynamic order processing system where different discount strategies can be applied based on the type of customer (e.g., regular, premium, VIP).

## Tasks:
1.	Create a new Python file named dynamic_order_processing.py.
2.	Define an interface DiscountStrategy with a method apply_discount(order_amount).
3.	Implement different discount strategies (RegularDiscount, PremiumDiscount, VIPDiscount) that implement the DiscountStrategy interface.
4.	Define a class Order that has attributes customer_type and order_amount.
5.	Implement a method final_price() in the Order class that applies the appropriate discount strategy based on customer_type.
6.	Create instances of Order for different customer types and calculate the final price.
7.	Print the final prices after applying discounts.
