## Exercise 7: Customer Accounts with TreeMap

## Objectives:
•	Understand and use the TreeMap class.
•	Store and retrieve key-value pairs in a sorted order.

## Business Scenario: 
You are building a system to manage customer accounts. Each customer has an ID, and their information needs to be stored in a sorted order based on their ID.
Tasks:
1.	Create a New Java Project:
•	Create a new Java project named CustomerAccounts.
2.	Create a Customer Class:
•	In the CustomerAccounts project, create a class named Customer with attributes id (int), name (String), and email (String).
3.	Create a CustomerAccounts Class:
•	Create a class named CustomerAccounts with a TreeMap<Integer, Customer> to store customer accounts sorted by their ID.
4.	Add Customers:
•	Implement a method addCustomer(Customer customer) to add a customer account to the system.
5.	Remove Customers:
•	Implement a method removeCustomer(int customerId) to remove a customer account by its ID.
6.	Display Customers:
•	Implement a method displayCustomers() to display all customer accounts in the system.
7.	Testing:
•	Create a main class CustomerAccountsTest with a main method.
•	Add, remove, and display customer accounts using the CustomerAccounts class.
