public class Consumer extends Thread {
    private final DataQueue dataQueue;

    public Consumer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int data = dataQueue.remove();
                System.out.println("Consumed: " + data);
                Thread.sleep(1500); // Simulate time taken to process data
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
