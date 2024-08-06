public class Producer extends Thread {
    private final DataQueue dataQueue;

    public Producer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int data = (int) (Math.random() * 100); // Produce some data
                dataQueue.add(data);
                System.out.println("Produced: " + data);
                Thread.sleep(1000); // Simulate time taken to produce data
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
