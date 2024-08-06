import java.util.HashMap;

public class InventoryManagement {
    private HashMap<Integer, Product> inventory;

    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getId(), product);
    }

    public void removeProduct(int productId) {
        inventory.remove(productId);
    }

    public void updateProductQuantity(int productId, int newQuantity) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
        }
    }

    public void displayProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
