## Exercise 4: Synchronization

## Objectives:
•	Understand synchronization in multithreaded applications.
•	Avoid data inconsistency with synchronized methods and blocks.

## Business Scenario: 
You are developing a banking system where multiple threads perform transactions on the same account. Ensure that transactions are synchronized to avoid data inconsistency.

## Tasks:
1.	Create a New Java Class:
•	Create a Java class named BankAccount.
2.	Define Account Operations:
•	Create methods for deposit and withdrawal operations.
•	Use synchronized methods or blocks to ensure thread safety.
3.	Create Transaction Threads:
•	Create a thread class named Transaction that performs deposit and withdrawal operations on a shared BankAccount instance.
4.	Implement and Test Synchronization:
•	In the BankAccount class, create and start multiple Transaction threads.
•	Observe and ensure that the balance updates correctly with synchronized operations.
5.	Execute the Program:
•	Run the BankAccount class and test the synchronized transaction operations.
