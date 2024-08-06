## Exercise 1: Implementing Functional Interfaces with Lambda Expressions

## Objectives:
•	Understand and implement functional interfaces.
•	Use lambda expressions to simplify code.

## Business Scenario: 
You are developing an application that performs various operations on a list of customer orders. You need to implement functional interfaces for filtering and processing the orders based on different criteria.

Tasks:
1.	Create a New Java Project:
•	Create a new Java project named OrderProcessing.
2.	Define Functional Interfaces:
•	Define a functional interface OrderFilter with a method boolean filter(Order order).
•	Define another functional interface OrderProcessor with a method void process(Order order).
3.	Create the Order Class:
•	Define an Order class with attributes like orderId, customerName, orderAmount, and status.
4.	Implement Lambda Expressions:
•	In the OrderProcessing class, create a list of Order objects.
•	Use lambda expressions to implement OrderFilter for filtering orders with an amount greater than a specified value.
•	Use lambda expressions to implement OrderProcessor for processing orders by changing their status.
5.	Filter and Process Orders:
•	Write a method that takes an OrderFilter and processes all orders that match the filter.
•	Write a method that takes an OrderProcessor and applies it to all orders.
6.	Test the Application:
•	Create sample orders and test the filtering and processing methods.
•	Print the results to verify that the orders are correctly filtered and processed.

