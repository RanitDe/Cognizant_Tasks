public class ProducerConsumer {
    public static void main(String[] args) {
        DataQueue dataQueue = new DataQueue(10); // Queue capacity of 10

        // Create and start producer threads
        Producer producer1 = new Producer(dataQueue);
        Producer producer2 = new Producer(dataQueue);
        producer1.start();
        producer2.start();

        // Create and start consumer threads
        Consumer consumer1 = new Consumer(dataQueue);
        Consumer consumer2 = new Consumer(dataQueue);
        consumer1.start();
        consumer2.start();
    }
}
