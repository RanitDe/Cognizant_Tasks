## Exercise 4: Organizing Programs and Using Modules

## Objectives:
•	Organize a Python program using functions and modules.
•	Understand how to create and import custom modules.

## Business Scenario: 
You are tasked with creating a utility tool for text processing that includes several functions like counting words, finding unique words, and converting text to uppercase. The tool should be organized into separate modules to ensure clean and maintainable code.

## Tasks:
1.	Create a New Project Directory:
o	Create a new directory named text_processing_tool.
2.	Create Functions:
o	Inside the text_processing_tool directory, create separate Python files for each text processing task:
	count_words.py: Define a function count_words(text) that returns the number of words in a given text.
	find_unique_words.py: Define a function find_unique_words(text) that returns a set of unique words in the text.
	convert_to_uppercase.py: Define a function convert_to_uppercase(text) that converts all text to uppercase.
3.	Organize Code:
o	In the text_processing_tool directory, create an __init__.py file to make it a package.
o	Ensure each module is correctly imported in the __init__.py file.
4.	Import and Use Modules:
o	Create a new Python file named main.py outside the text_processing_tool directory.
o	In main.py, import the custom modules.
o	Write a script that:
	Prompts the user to enter a text string.
	Uses the imported functions to process the text based on user input.
	Prints the results of the text processing tasks.
Example Directory Structure:
text_processing_tool/
│
├── __init__.py
├── count_words.py
├── find_unique_words.py
└── convert_to_uppercase.py
main.py
