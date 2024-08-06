## Exercise 5: File Handling with NIO Package

## Objectives:
•	Learn how to use Java NIO package for file operations.
•	Understand the differences between java.io and java.nio.

## Business Scenario: 
You are tasked with creating a backup system for important files. The system should copy files from a source directory to a backup directory using Java NIO for efficient file operations.

Tasks:
1.	Setup:
•	Create a new Java project named BackupSystem.
2.	Copying Files:
•	Create a class named FileCopy.
•	Write a method copyFile(Path source, Path target) that:
	Takes source and target paths as parameters.
	Uses Files.copy from the NIO package to copy the file from source to target.
	Implements error handling using try-catch blocks to handle IOException.
3.	Copying Directories:
•	Create a class named DirectoryCopy.
•	Write a method copyDirectory(Path sourceDir, Path targetDir) that:
	Takes source and target directory paths as parameters.
	Recursively copies all files and subdirectories from the source to the target directory using Files.walk and Files.copy.
	Implements error handling using try-catch blocks to handle IOException.
4.	User Interaction:
•	Create a class named BackupApp.
•	Write a main method that:
	Prompts the user for the source and target directories.
	Uses DirectoryCopy to backup all files and directories from the source to the target directory.
	Demonstrates the error handling by attempting to copy to a read-only directory or a directory with insufficient space.

