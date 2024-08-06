public class LogApp {

    public static void main(String[] args) {
        String fileName = "logs.txt";

        // Writing multiple log messages to a file
        LogWriter.writeLog(fileName, "Log Message 1: Application started.");
        LogWriter.writeLog(fileName, "Log Message 2: An error occurred.");
        LogWriter.writeLog(fileName, "Log Message 3: Application ended.");

        // Reading the log messages from the file
        LogReader.readLogs(fileName);

        // Demonstrating error handling by attempting to read from a non-existent file
        LogReader.readLogs("non_existent_file.txt");
    }
}
