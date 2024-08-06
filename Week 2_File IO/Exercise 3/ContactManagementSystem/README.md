## Exercise 3: File Handling with Serialization

## Objectives:
•	Learn how to serialize and deserialize objects to and from files.
•	Understand the use of ObjectInputStream and ObjectOutputStream.

## Business Scenario: 
You are developing a contact management system where contact details can be saved to a file and read back using serialization.

Tasks:
1.	Setup:
•	Create a new Java project named ContactManagementSystem.
2.	Defining the Contact Class:
•	Create a class named Contact that implements Serializable.
•	Define attributes for contact details like name, phone, and email.
•	Provide a constructor and appropriate getter and setter methods.
3.	Serializing Contacts:
•	Create a class named ContactWriter.
•	Write a method saveContact(String fileName, Contact contact) that:
	Takes a file name and a Contact object as parameters.
	Uses ObjectOutputStream to write the Contact object to the specified file.
	Implements error handling using try-catch blocks to handle IOException.
4.	Deserializing Contacts:
•	Create a class named ContactReader.
•	Write a method readContact(String fileName) that:
	Takes a file name as a parameter.
	Uses ObjectInputStream to read the Contact object from the file.
	Implements error handling using try-catch blocks to handle FileNotFoundException, IOException, and ClassNotFoundException.
5.	User Interaction:
•	Create a class named ContactApp.
•	Write a main method that:
	Creates a Contact object and saves it to a file using ContactWriter.
	Reads the Contact object back from the file using ContactReader and displays the contact details.
	Demonstrates the error handling by attempting to read from a non-existent file and handling class casting issues.
