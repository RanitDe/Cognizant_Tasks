## Exercise 4: JDBC API CRUD Implementation and Demonstration

## Objectives:
•	Perform CRUD (Create, Read, Update, Delete) operations using JDBC API.

## Business Scenario: 
You are tasked with implementing a full-featured employee management system that allows adding, updating, deleting, and retrieving employee records.

Tasks:
1.	Create Employee:
•	In the EmployeeDataRetrieval class, implement a method addEmployee(String name, String position, double salary) that inserts a new employee record into the employees table.
•	Use a PreparedStatement for this operation.
2.	Update Employee:
•	Implement a method updateEmployee(int id, String name, String position, double salary) that updates an existing employee record based on the id.
•	Use a PreparedStatement for this operation.
3.	Delete Employee:
•	Implement a method deleteEmployee(int id) that deletes an employee record based on the id.
•	Use a PreparedStatement for this operation.
4.	Demonstrate CRUD Operations:
•	Write a main method that demonstrates the CRUD operations:
	Add a few employee records.
	Update an employee record.
	Delete an employee record.
	Retrieve and display all employee records.
