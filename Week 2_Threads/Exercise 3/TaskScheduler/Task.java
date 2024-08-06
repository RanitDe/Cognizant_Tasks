public class Task extends Thread {
    private String taskName;
    private int sleepDuration;

    public Task(String taskName, int sleepDuration) {
        this.taskName = taskName;
        this.sleepDuration = sleepDuration;
    }

    @Override
    public void run() {
        System.out.println(taskName + " started.");
        
        try {
            // Sleep for the given duration
            Thread.sleep(sleepDuration);

            // Yield to other tasks
            Thread.yield();

            System.out.println(taskName + " completed after sleeping for " + sleepDuration + " ms.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
