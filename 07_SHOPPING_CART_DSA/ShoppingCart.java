import java.util.ArrayList;

/**
 * ShoppingCart class demonstrating ArrayList usage and cart operations
 * This implements a shopping cart using ArrayList data structure
 */
public class ShoppingCart {
    private ArrayList<Product> cart;
    private double totalAmount;
    
    // Constructor
    public ShoppingCart() {
        cart = new ArrayList<>();
        totalAmount = 0.0;
    }
    
    // Add product to cart (ArrayList add operation - O(1) amortized)
    public void addProduct(Product product) {
        cart.add(product);
        totalAmount += product.getPrice();
        System.out.println("Added to cart: " + product.getName() + " - $" + product.getPrice());
    }
    
    // Remove product from cart (ArrayList remove operation - O(n))
    public boolean removeProduct(Product product) {
        if (cart.remove(product)) {
            totalAmount -= product.getPrice();
            System.out.println("Removed from cart: " + product.getName());
            return true;
        }
        System.out.println("Product not found in cart: " + product.getName());
        return false;
    }
    
    // Get cart size (ArrayList size operation - O(1))
    public int getCartSize() {
        return cart.size();
    }
    
    // Check if cart is empty (ArrayList isEmpty operation - O(1))
    public boolean isEmpty() {
        return cart.isEmpty();
    }
    
    // Get total amount
    public double getTotalAmount() {
        return totalAmount;
    }
    
    // Display all items in cart (ArrayList iteration - O(n))
    public void displayCart() {
        System.out.println("\n=== Shopping Cart ===");
        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }
        
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + ". " + cart.get(i));
        }
        System.out.println("Total Amount: $" + String.format("%.2f", totalAmount));
        System.out.println("==================");
    }
    
    // Clear cart (ArrayList clear operation - O(1))
    public void clearCart() {
        cart.clear();
        totalAmount = 0.0;
        System.out.println("Cart cleared successfully!");
    }
    
    // Get product at specific index (ArrayList get operation - O(1))
    public Product getProduct(int index) {
        if (index >= 0 && index < cart.size()) {
            return cart.get(index);
        }
        return null;
    }
    
    // Search for product in cart (Linear Search - O(n))
    public int findProduct(Product product) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).equals(product)) {
                return i;
            }
        }
        return -1; // Not found
    }
    
    // Get all products in cart
    public ArrayList<Product> getAllProducts() {
        return new ArrayList<>(cart); // Return copy to maintain encapsulation
    }
}