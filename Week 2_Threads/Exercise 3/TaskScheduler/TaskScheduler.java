public class TaskScheduler {

    public static void main(String[] args) {
        // Create task threads
        Task task1 = new Task("Task-1", 2000); // 2 seconds
        Task task2 = new Task("Task-2", 1000); // 1 second
        Task task3 = new Task("Task-3", 3000); // 3 seconds

        // Start tasks
        task1.start();
        task2.start();
        task3.start();

        try {
            // Wait for Task-1 to complete before proceeding
            task1.join();

            // Yielding the main thread to allow other tasks to proceed
            Thread.yield();

            // Wait for Task-2 to complete
            task2.join();
            
            // Wait for Task-3 to complete
            task3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks have completed.");
    }
}
