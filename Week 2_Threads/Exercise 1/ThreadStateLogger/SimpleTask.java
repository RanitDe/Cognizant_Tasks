public class SimpleTask implements Runnable {

    @Override
    public void run() {
        // Log the state during execution
        System.out.println("Thread state during execution: " + Thread.currentThread().getState());

        // Perform a simple task (e.g., print numbers)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                // Simulate some work by sleeping for a short time
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Log the state when the task is completed
        System.out.println("Thread state after task completion: " + Thread.currentThread().getState());
    }
}
