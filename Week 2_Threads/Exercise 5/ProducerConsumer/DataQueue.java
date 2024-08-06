import java.util.LinkedList;
import java.util.Queue;

public class DataQueue {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;

    public DataQueue(int capacity) {
        this.capacity = capacity;
    }

    // Add data to the queue
    public synchronized void add(int data) throws InterruptedException {
        while (queue.size() == capacity) {
            wait(); // Wait until there's space in the queue
        }
        queue.add(data);
        notifyAll(); // Notify any waiting threads
    }

    // Remove data from the queue
    public synchronized int remove() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // Wait until there's data to consume
        }
        int data = queue.poll();
        notifyAll(); // Notify any waiting threads
        return data;
    }
}
