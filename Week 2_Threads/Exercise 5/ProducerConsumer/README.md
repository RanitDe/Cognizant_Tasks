## Exercise 5: Inter-Thread Communication

## Objectives:
•	Learn about inter-thread communication using wait, notify, and notifyAll.

## Business Scenario:
You are developing a producer-consumer system where multiple producer threads generate data and multiple consumer threads process data. Implement inter-thread communication to synchronize data production and consumption.

## Tasks:
1.	Create a New Java Class:
•	Create a Java class named ProducerConsumer.
2.	Define Shared Resource:
•	Create a class named DataQueue that holds the data queue and methods for adding and removing data.
•	Use wait, notify, and notifyAll methods for inter-thread communication.
3.	Create Producer and Consumer Threads:
•	Create thread classes named Producer and Consumer that interact with the DataQueue to produce and consume data.
4.	Implement and Test Inter-Thread Communication:
•	In the ProducerConsumer class, create and start multiple Producer and Consumer threads.
•	Ensure proper synchronization between producers and consumers using wait and notify.
5.	Execute the Program:
•	Run the ProducerConsumer class and observe the inter-thread communication.
