public class ThreadStateLogger {

    public static void main(String[] args) {
        // Create a new thread instance
        Thread thread = new Thread(new SimpleTask());

        // Log the state before starting the thread
        System.out.println("Thread state before starting: " + thread.getState());

        // Start the thread
        thread.start();

        // Log the state after starting the thread
        System.out.println("Thread state after starting: " + thread.getState());

        try {
            // Wait for the thread to finish execution
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Log the state after the thread has completed execution
        System.out.println("Thread state after completion: " + thread.getState());
    }
}
