## Exercise 2: Advanced File Handling with Error Handling

## Objectives:
•	Handle errors and exceptions during file operations.
•	Implement robust file handling in Java.

## Business Scenario: 
You are developing a log management system for an application. The system should be able to write log messages to a file and read log messages from the file, with proper error handling for file operations.

Tasks:
1.	Setup:
•	Create a new Java project named LogManagementSystem.
2.	Writing Logs to a File:
•	Create a class named LogWriter.
•	Write a method writeLog(String fileName, String logMessage) that:
	Takes a file name and a log message as parameters.
	Uses FileWriter and BufferedWriter to append the log message to the specified file.
	Implements error handling using try-catch blocks to handle IOException.
3.	Reading Logs from a File:
•	Create a class named LogReader.
•	Write a method readLogs(String fileName) that:
	Takes a file name as a parameter.
	Uses FileReader and BufferedReader to read the content of the file line by line.
	Implements error handling using try-catch blocks to handle FileNotFoundException and IOException.
4.	User Interaction:
•	Create a class named LogApp.
•	Write a main method that:
	Writes multiple log messages to a file using LogWriter.
	Reads the log messages from the file using LogReader and displays them.
	Demonstrates the error handling by attempting to read from a non-existent file.

