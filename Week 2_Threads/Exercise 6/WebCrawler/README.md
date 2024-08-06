## Exercise 6: Enhanced Multithreading and Concurrency Features
## Objectives:
•	Utilize advanced concurrency features in Java.
•	Implement thread-safe collections and executors.

## Business Scenario: 
You are developing a web crawler that retrieves and processes web pages concurrently. Use Java's concurrency utilities to manage threads and ensure thread safety.

## Tasks:
1.	Create a New Java Class:
•	Create a Java class named WebCrawler.
2.	Use Thread Pools:
•	Use ExecutorService to manage a pool of threads for crawling web pages.
•	Implement a thread class named CrawlerTask that performs the web page retrieval.
3.	Use Concurrent Collections:
•	Use thread-safe collections like ConcurrentHashMap to store crawled data.
•	Ensure proper synchronization when accessing the collection.
4.	Implement and Test Enhanced Concurrency:
•	In the WebCrawler class, create and start multiple CrawlerTask threads using ExecutorService.
•	Monitor and log the status of the crawling process.
5.	Execute the Program:
•	Run the WebCrawler class and observe the enhanced multithreading and concurrency features in action.
