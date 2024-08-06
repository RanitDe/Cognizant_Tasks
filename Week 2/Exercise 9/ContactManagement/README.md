## Exercise 9: Contact Management with Hashtable

## Objectives:
•	Understand and use the Hashtable class.
•	Perform thread-safe operations on a key-value pair collection.

## Business Scenario: 
You are building a contact management system to store and manage contact information for a company. Each contact has a unique ID and associated details.
Tasks:
1.	Create a New Java Project:
•	Create a new Java project named ContactManagement.
2.	Create a Contact Class:
•	In the ContactManagement project, create a class named Contact with attributes id (int), name (String), and phoneNumber (String).
3.	Create a ContactManagement Class:
•	Create a class named ContactManagement with a Hashtable<Integer, Contact> to store contacts.
4.	Add Contacts:
•	Implement a method addContact(Contact contact) to add a contact to the system.
5.	Remove Contacts:
•	Implement a method removeContact(int contactId) to remove a contact by its ID.
6.	Display Contacts:
•	Implement a method displayContacts() to display all contacts in the system.
7.	Testing:
•	Create a main class ContactManagementTest with a main method.
•	Add, remove, and display contacts using the ContactManagement class.
