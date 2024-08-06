import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogWriter {

    public static void writeLog(String fileName, String logMessage) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(logMessage);
            writer.newLine();
            System.out.println("Log message written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the log message.");
            e.printStackTrace();
        }
    }
}
