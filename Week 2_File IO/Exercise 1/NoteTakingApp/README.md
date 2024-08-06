## Exercise 1: Basic File Reading and Writing

## Objectives:
•	Learn how to read from and write to files using Java.
•	Understand basic file operations.

## Business Scenario: 
You are developing a simple note-taking application where users can save their notes to a file and read them back when needed.
Tasks:
1.	Setup:
•	Create a new Java project named NoteTakingApp.
2.	Writing to a File:
•	Create a class named FileWriterDemo.
•	Write a method saveNoteToFile(String fileName, String note) that:
	Takes a file name and a note as parameters.
	Uses FileWriter and BufferedWriter to write the note to the specified file.
3.	Reading from a File:
•	Create a class named FileReaderDemo.
•	Write a method readNoteFromFile(String fileName) that:
	Takes a file name as a parameter.
	Uses FileReader and BufferedReader to read the content of the file and print it to the console.
4.	User Interaction:
•	Create a class named NoteApp.
•	Write a main method that:
	Prompts the user to enter a note.
	Saves the note to a file using FileWriterDemo.
	Reads the note back from the file using FileReaderDemo and displays it.

