import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FeedbackProcessorApp {

    public static void main(String[] args) {
        // Create sample feedback data
        List<Feedback> feedbackList = new ArrayList<>();
        feedbackList.add(new Feedback("1", "Alice", 5, "Excellent service"));
        feedbackList.add(new Feedback("2", "Bob", 3, "Average experience"));
        feedbackList.add(new Feedback("3", "Charlie", 2, "Not satisfied"));
        feedbackList.add(new Feedback("4", "David", 4, "Good, but room for improvement"));
        feedbackList.add(new Feedback("5", "Eve", 1, "Very poor service"));

        // Define filter and processor using lambda expressions
        FeedbackFilter positiveFeedbackFilter = feedback -> feedback.getRating() >= 4;
        FeedbackProcessor printFeedbackProcessor = feedback -> System.out.println(feedback);

        // Data processing pipeline
        processFeedback(feedbackList, positiveFeedbackFilter, printFeedbackProcessor);

        // Flexible processing example
        // Filter feedback with rating >= 3, and print customer names and comments
        FeedbackFilter ratingFilter = feedback -> feedback.getRating() >= 3;
        FeedbackProcessor printCustomerAndCommentsProcessor = feedback ->
                System.out.println("Customer: " + feedback.getCustomerName() + ", Comments: " + feedback.getComments());
        processFeedback(feedbackList, ratingFilter, printCustomerAndCommentsProcessor);

        // Calculate the number of positive and negative feedbacks
        Map<Boolean, Long> feedbackCount = feedbackList.stream()
                .collect(Collectors.partitioningBy(feedback -> feedback.getRating() >= 4, Collectors.counting()));
        System.out.println("Positive Feedback Count: " + feedbackCount.get(true));
        System.out.println("Negative Feedback Count: " + feedbackCount.get(false));
    }

    public static void processFeedback(List<Feedback> feedbackList, FeedbackFilter filter, FeedbackProcessor processor) {
        feedbackList.stream()
                .filter(filter::filter)
                .forEach(processor::process);
    }
}
