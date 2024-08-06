## Exercise 2: Creating and Running Threads

## Objectives:
•	Create and start threads in Java.
•	Understand the main thread and how other threads interact with it.

## Business Scenario: 
You are developing a simulation where multiple sensors collect data simultaneously. Each sensor should run in its own thread.

## Tasks:
1.	Create a New Java Class:
•	Create a Java class named SensorSimulation.
2.	Define Sensor Threads:
•	Create a thread class named Sensor that simulates data collection by printing random data at regular intervals.
•	In the SensorSimulation class, create and start multiple Sensor threads.
3.	Main Thread Interaction:
•	In the SensorSimulation class, ensure the main thread waits for all sensor threads to complete before exiting.
•	Use join method to make the main thread wait for the sensor threads.
4.	Execute the Program:
•	Run the SensorSimulation class and observe the concurrent execution of sensor threads.
