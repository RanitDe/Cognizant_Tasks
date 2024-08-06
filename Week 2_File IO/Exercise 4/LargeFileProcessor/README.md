## Exercise 4: Processing Large Files

## Objectives:
•	Handle large files efficiently using Java.
•	Use buffered streams for reading and writing large files.

## Business Scenario: 
You are developing a system to process large data files containing sales records. The system should be able to read large files efficiently, process the data, and write the results to a new file.

Tasks:
1.	Setup:
•	Create a new Java project named LargeFileProcessor.
2.	Reading Large Files:
•	Create a class named LargeFileReader.
•	Write a method readLargeFile(String inputFileName) that:
	Takes an input file name as a parameter.
	Uses BufferedReader to read the file line by line.
	Processes each line (e.g., parse and print sales records).
	Implements error handling using try-catch blocks to handle IOException.
3.	Writing Processed Data:
•	Create a class named LargeFileWriter.
•	Write a method writeProcessedData(String outputFileName, List<String> processedData) that:
	Takes an output file name and a list of processed data as parameters.
	Uses BufferedWriter to write the processed data to the specified file.
	Implements error handling using try-catch blocks to handle IOException.
4.	User Interaction:
•	Create a class named FileProcessorApp.
•	Write a main method that:
	Reads a large sales data file using LargeFileReader.
	Processes the data (e.g., filtering records, calculating totals).
	Writes the processed data to a new file using LargeFileWriter.
	Demonstrates the error handling by attempting to read and write to non-existent files or restricted directories.
