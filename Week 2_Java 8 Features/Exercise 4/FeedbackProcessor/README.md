## Exercise 4: Combining Functional Interfaces and Streams

## Objectives:
•	Combine functional interfaces and Stream API for flexible and reusable code.
•	Implement complex data processing pipelines.

## Business Scenario: 
You are tasked with developing a comprehensive data processing pipeline for customer feedback analysis. The pipeline should be flexible and reusable for different types of analysis.

Tasks:
1.	Define Functional Interfaces:
•	Define functional interfaces FeedbackFilter and FeedbackProcessor.
2.	Create Feedback Class:
•	Define a Feedback class with attributes like feedbackId, customerName, rating, and comments.
3.	Implement Data Processing Pipeline:
•	Use the Stream API to create a flexible data processing pipeline that:
	Filters feedback based on a minimum rating.
	Maps feedback to extract customer names and comments.
	Reduces feedback to count the number of positive and negative feedbacks.
4.	Implement Flexible Processing:
•	Write methods that take FeedbackFilter and FeedbackProcessor as parameters to allow flexible and reusable processing.
•	Create lambda expressions to implement different filtering and processing strategies.
5.	Test the Pipeline:
•	Create sample feedback data and test the data processing pipeline.
•	Print the results to verify the correct operation of the pipeline.

