import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LogReader {

    public static void readLogs(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading log messages from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The specified file was not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the log messages.");
            e.printStackTrace();
        }
    }
}
