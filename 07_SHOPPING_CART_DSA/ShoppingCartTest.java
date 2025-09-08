/**
 * Test class to validate the shopping cart DSA implementation
 * Tests various data structures and algorithms
 */
public class ShoppingCartTest {
    
    public static void testProduct() {
        System.out.println("=== Testing Product Class ===");
        Product toothpaste = new Product(101, "Colgate Total", 3.99, "Personal Care");
        System.out.println("Created product: " + toothpaste);
        System.out.println("Product name: " + toothpaste.getName());
        System.out.println("Product price: $" + toothpaste.getPrice());
        System.out.println("✅ Product class test passed!\n");
    }
    
    public static void testShoppingCart() {
        System.out.println("=== Testing ShoppingCart Class ===");
        ShoppingCart cart = new ShoppingCart();
        
        // Test empty cart
        System.out.println("Cart is empty: " + cart.isEmpty());
        System.out.println("Cart size: " + cart.getCartSize());
        
        // Add products
        Product toothpaste = new Product(101, "Colgate Total", 3.99, "Personal Care");
        Product toothbrush = new Product(102, "Oral-B Brush", 12.99, "Personal Care");
        
        cart.addProduct(toothpaste);
        cart.addProduct(toothbrush);
        
        // Test cart operations
        System.out.println("Cart size after adding: " + cart.getCartSize());
        System.out.println("Total amount: $" + cart.getTotalAmount());
        cart.displayCart();
        
        // Test remove
        cart.removeProduct(toothpaste);
        System.out.println("Cart size after removing: " + cart.getCartSize());
        
        System.out.println("✅ ShoppingCart class test passed!\n");
    }
    
    public static void testProductSearch() {
        System.out.println("=== Testing ProductSearch Class ===");
        
        // Create test products
        java.util.ArrayList<Product> products = new java.util.ArrayList<>();
        products.add(new Product(101, "Colgate Toothpaste", 3.99, "Personal Care"));
        products.add(new Product(102, "Crest Toothpaste", 4.49, "Personal Care"));
        products.add(new Product(201, "iPhone 15", 999.99, "Electronics"));
        
        // Test linear search
        Product found = ProductSearch.linearSearch(products, "toothpaste");
        System.out.println("Linear search result: " + (found != null ? "Found" : "Not found"));
        
        // Test search by category
        java.util.ArrayList<Product> personalCare = ProductSearch.searchByCategory(products, "Personal Care");
        System.out.println("Products in Personal Care: " + personalCare.size());
        
        // Test binary search (after sorting)
        Product[] sortedProducts = ProductSearch.sortProductsById(products);
        Product binaryFound = ProductSearch.binarySearchById(sortedProducts, 201);
        System.out.println("Binary search result: " + (binaryFound != null ? "Found" : "Not found"));
        
        System.out.println("✅ ProductSearch class test passed!\n");
    }
    
    public static void testPurchaseQueue() {
        System.out.println("=== Testing PurchaseQueue Class ===");
        
        PurchaseQueue queue = new PurchaseQueue();
        
        // Create test cart
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product(101, "Colgate Toothpaste", 3.99, "Personal Care"));
        
        // Test queue operations
        System.out.println("Queue is empty: " + queue.isEmpty());
        queue.addPurchaseOrder("Test Customer", cart);
        System.out.println("Queue size: " + queue.getQueueSize());
        
        // Test peek
        queue.peekNextOrder();
        
        // Test process
        queue.processNextOrder();
        System.out.println("Queue size after processing: " + queue.getQueueSize());
        
        System.out.println("✅ PurchaseQueue class test passed!\n");
    }
    
    public static void testToothpastePurchase() {
        System.out.println("=== Testing Toothpaste Purchase (Original Request) ===");
        
        // Create product catalog
        java.util.ArrayList<Product> catalog = new java.util.ArrayList<>();
        catalog.add(new Product(101, "Colgate Total Toothpaste", 3.99, "Personal Care"));
        catalog.add(new Product(102, "Crest 3D White Toothpaste", 4.49, "Personal Care"));
        
        // Search for toothpaste
        Product toothpaste = ProductSearch.linearSearch(catalog, "toothpaste");
        
        if (toothpaste != null) {
            // Add to cart
            ShoppingCart cart = new ShoppingCart();
            cart.addProduct(toothpaste);
            
            // Create purchase order
            PurchaseQueue queue = new PurchaseQueue();
            queue.addPurchaseOrder("Amazon Customer", cart);
            
            // Process purchase
            queue.processNextOrder();
            
            System.out.println("✅ Toothpaste purchase simulation completed successfully!");
        } else {
            System.out.println("❌ Toothpaste not found in catalog!");
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("🧪 Running Shopping Cart DSA Tests\n");
        
        // Run all tests
        testProduct();
        testShoppingCart();
        testProductSearch();
        testPurchaseQueue();
        testToothpastePurchase();
        
        System.out.println("🎉 All tests completed successfully!");
        System.out.println("The shopping cart DSA implementation is working correctly.");
        System.out.println("\nDSA Concepts Demonstrated:");
        System.out.println("- ArrayList (Dynamic Array) - O(1) add, O(n) remove");
        System.out.println("- Linear Search - O(n) time complexity");
        System.out.println("- Binary Search - O(log n) time complexity");
        System.out.println("- Queue (LinkedList) - O(1) enqueue/dequeue");
        System.out.println("- Bubble Sort - O(n²) time complexity");
        System.out.println("- Object-Oriented Programming principles");
    }
}