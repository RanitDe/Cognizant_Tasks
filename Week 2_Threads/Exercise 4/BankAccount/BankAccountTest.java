public class BankAccountTest {
    public static void main(String[] args) {
        // Create a BankAccount instance with an initial balance
        BankAccount account = new BankAccount(1000.0);

        // Create and start transaction threads
        Transaction t1 = new Transaction(account, 200.0, true); // Deposit
        Transaction t2 = new Transaction(account, 150.0, false); // Withdrawal
        Transaction t3 = new Transaction(account, 300.0, true); // Deposit
        Transaction t4 = new Transaction(account, 100.0, false); // Withdrawal

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            // Wait for all threads to complete
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final balance
        System.out.println("Final balance: " + account.getBalance());
    }
}
