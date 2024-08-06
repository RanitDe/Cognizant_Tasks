public class InventoryManagementTest {
    public static void main(String[] args) {
        InventoryManagement inventoryManagement = new InventoryManagement();

        // Adding products
        inventoryManagement.addProduct(new Product(1, "Laptop", 10));
        inventoryManagement.addProduct(new Product(2, "Smartphone", 20));
        inventoryManagement.addProduct(new Product(3, "Tablet", 15));

        // Displaying products
        System.out.println("Current inventory:");
        inventoryManagement.displayProducts();

        // Removing a product
        inventoryManagement.removeProduct(2);

        // Displaying products after removal
        System.out.println("\nInventory after removing Smartphone:");
        inventoryManagement.displayProducts();

        // Updating product quantity
        inventoryManagement.updateProductQuantity(3, 25);

        // Displaying products after update
        System.out.println("\nInventory after updating Tablet quantity:");
        inventoryManagement.displayProducts();
    }
}
