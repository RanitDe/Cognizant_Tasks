import java.util.Random;

public class Sensor implements Runnable {
    
    private String sensorName;
    private Random random;

    public Sensor(String sensorName) {
        this.sensorName = sensorName;
        this.random = new Random();
    }

    @Override
    public void run() {
        // Simulate data collection by printing random data at regular intervals
        for (int i = 0; i < 5; i++) {
            System.out.println(sensorName + " collecting data: " + random.nextInt(100));
            try {
                // Simulate the time taken to collect data
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(sensorName + " has completed data collection.");
    }
}
