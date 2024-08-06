import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class OrderProcessing {
    public static void main(String[] args) {
        // Create a list of orders
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("1", "Alice", 150.0, "New"));
        orders.add(new Order("2", "Bob", 50.0, "New"));
        orders.add(new Order("3", "Charlie", 200.0, "New"));
        orders.add(new Order("4", "Diana", 300.0, "New"));

        // Filter orders with an amount greater than 100
        OrderFilter filter = order -> order.getOrderAmount() > 100;
        List<Order> filteredOrders = filterOrders(orders, filter);
        System.out.println("Filtered Orders:");
        filteredOrders.forEach(System.out::println);

        // Process orders by changing their status to "Processed"
        OrderProcessor processor = order -> order.setStatus("Processed");
        processOrders(orders, processor);
        System.out.println("Processed Orders:");
        orders.forEach(System.out::println);
    }

    public static List<Order> filterOrders(List<Order> orders, OrderFilter filter) {
        List<Order> filteredOrders = new ArrayList<>();
        for (Order order : orders) {
            if (filter.filter(order)) {
                filteredOrders.add(order);
            }
        }
        return filteredOrders;
    }

    public static void processOrders(List<Order> orders, OrderProcessor processor) {
        for (Order order : orders) {
            processor.process(order);
        }
    }
}
