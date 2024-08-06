public class SensorSimulation {

    public static void main(String[] args) {
        // Number of sensor threads to create
        int numberOfSensors = 5;
        
        // Create an array to hold the sensor threads
        Thread[] sensors = new Thread[numberOfSensors];

        // Initialize and start each sensor thread
        for (int i = 0; i < numberOfSensors; i++) {
            sensors[i] = new Thread(new Sensor("Sensor-" + (i + 1)));
            sensors[i].start();
        }

        // Ensure the main thread waits for all sensor threads to complete
        try {
            for (Thread sensor : sensors) {
                sensor.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All sensor threads have completed.");
    }
}
