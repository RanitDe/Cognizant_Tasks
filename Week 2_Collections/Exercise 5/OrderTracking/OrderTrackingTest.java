public class OrderTrackingTest {
    public static void main(String[] args) {
        OrderTracking orderTracking = new OrderTracking();

        // Adding orders
        orderTracking.addOrder(new Order(1, "Burger and Fries"));
        orderTracking.addOrder(new Order(2, "Pizza and Soda"));
        orderTracking.addOrder(new Order(3, "Salad and Water"));

        // Displaying orders
        System.out.println("Current orders:");
        orderTracking.displayOrders();

        // Processing an order
        Order processedOrder = orderTracking.processOrder();
        System.out.println("\nProcessed order: " + processedOrder);

        // Displaying orders after processing
        System.out.println("\nOrders after processing one:");
        orderTracking.displayOrders();
    }
}
