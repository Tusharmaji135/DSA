import java.util.ArrayList;
import java.util.Scanner;

/**
 * AmazonShoppingSim - A shopping simulation demonstrating DSA concepts
 * This simulates shopping for toothpaste and other products using various data structures
 */
public class AmazonShoppingSim {
    
    private static ArrayList<Product> productCatalog;
    private static PurchaseQueue purchaseQueue;
    private static Scanner scanner;
    
    // Initialize the product catalog with sample products including toothpaste
    public static void initializeProductCatalog() {
        productCatalog = new ArrayList<>();
        
        // Add toothpaste and other personal care products
        productCatalog.add(new Product(101, "Colgate Total Toothpaste", 3.99, "Personal Care"));
        productCatalog.add(new Product(102, "Crest 3D White Toothpaste", 4.49, "Personal Care"));
        productCatalog.add(new Product(103, "Sensodyne Repair Toothpaste", 5.99, "Personal Care"));
        productCatalog.add(new Product(104, "Oral-B Electric Toothbrush", 29.99, "Personal Care"));
        productCatalog.add(new Product(105, "Listerine Mouthwash", 6.99, "Personal Care"));
        
        // Add other products for variety
        productCatalog.add(new Product(201, "iPhone 15 Pro", 999.99, "Electronics"));
        productCatalog.add(new Product(202, "Samsung Galaxy S24", 899.99, "Electronics"));
        productCatalog.add(new Product(203, "MacBook Pro", 1999.99, "Electronics"));
        productCatalog.add(new Product(301, "Nike Air Max", 129.99, "Footwear"));
        productCatalog.add(new Product(302, "Adidas Ultraboost", 149.99, "Footwear"));
        
        System.out.println("Product catalog initialized with " + productCatalog.size() + " products");
    }
    
    // Display all available products
    public static void displayProductCatalog() {
        System.out.println("\n=== Amazon Product Catalog ===");
        for (int i = 0; i < productCatalog.size(); i++) {
            System.out.println((i + 1) + ". " + productCatalog.get(i));
        }
        System.out.println("==============================");
    }
    
    // Search for toothpaste specifically
    public static void searchForToothpaste() {
        System.out.println("\n=== Searching for Toothpaste ===");
        
        // Use linear search to find toothpaste products
        ArrayList<Product> toothpasteProducts = ProductSearch.searchByCategory(productCatalog, "Personal Care");
        
        System.out.println("Available toothpaste options:");
        for (Product product : toothpasteProducts) {
            if (product.getName().toLowerCase().contains("toothpaste")) {
                System.out.println("- " + product);
            }
        }
    }
    
    // Simulate buying toothpaste
    public static ShoppingCart buyToothpaste() {
        System.out.println("\n=== Buying Toothpaste ===");
        ShoppingCart cart = new ShoppingCart();
        
        // Search for toothpaste using linear search
        Product toothpaste = ProductSearch.linearSearch(productCatalog, "toothpaste");
        
        if (toothpaste != null) {
            cart.addProduct(toothpaste);
            System.out.println("✅ Successfully added toothpaste to cart!");
        } else {
            System.out.println("❌ Toothpaste not found!");
        }
        
        return cart;
    }
    
    // Interactive shopping experience
    public static void interactiveShopping() {
        ShoppingCart cart = new ShoppingCart();
        boolean shopping = true;
        
        System.out.println("\n=== Welcome to Amazon Shopping Simulation ===");
        System.out.println("This simulation demonstrates DSA concepts through shopping!");
        
        while (shopping) {
            System.out.println("\n--- Shopping Menu ---");
            System.out.println("1. View all products");
            System.out.println("2. Search for product by name");
            System.out.println("3. Search by category");
            System.out.println("4. Add product to cart");
            System.out.println("5. View cart");
            System.out.println("6. Remove product from cart");
            System.out.println("7. Buy toothpaste (automated)");
            System.out.println("8. Checkout");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    displayProductCatalog();
                    break;
                case 2:
                    System.out.print("Enter product name to search: ");
                    String searchName = scanner.nextLine();
                    Product found = ProductSearch.linearSearch(productCatalog, searchName);
                    if (found != null) {
                        System.out.println("Found: " + found);
                    }
                    break;
                case 3:
                    System.out.print("Enter category to search: ");
                    String category = scanner.nextLine();
                    ArrayList<Product> categoryProducts = ProductSearch.searchByCategory(productCatalog, category);
                    for (Product p : categoryProducts) {
                        System.out.println("- " + p);
                    }
                    break;
                case 4:
                    System.out.print("Enter product ID to add to cart: ");
                    int productId = scanner.nextInt();
                    Product product = ProductSearch.linearSearchById(productCatalog, productId);
                    if (product != null) {
                        cart.addProduct(product);
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;
                case 5:
                    cart.displayCart();
                    break;
                case 6:
                    cart.displayCart();
                    if (!cart.isEmpty()) {
                        System.out.print("Enter product ID to remove: ");
                        int removeId = scanner.nextInt();
                        Product toRemove = ProductSearch.linearSearchById(productCatalog, removeId);
                        if (toRemove != null) {
                            cart.removeProduct(toRemove);
                        }
                    }
                    break;
                case 7:
                    ShoppingCart toothpasteCart = buyToothpaste();
                    // Add toothpaste to main cart
                    for (Product p : toothpasteCart.getAllProducts()) {
                        cart.addProduct(p);
                    }
                    break;
                case 8:
                    if (!cart.isEmpty()) {
                        System.out.print("Enter your name for the order: ");
                        String customerName = scanner.nextLine();
                        purchaseQueue.addPurchaseOrder(customerName, cart);
                        cart = new ShoppingCart(); // New cart for continued shopping
                        System.out.println("Order submitted for processing!");
                    } else {
                        System.out.println("Cart is empty! Add some products first.");
                    }
                    break;
                case 9:
                    shopping = false;
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
    
    // Demonstrate all DSA concepts
    public static void demonstrateDSAConcepts() {
        System.out.println("\n=== DSA Concepts Demonstration ===");
        
        // 1. ArrayList operations (Dynamic Array)
        System.out.println("\n1. ArrayList Operations:");
        ShoppingCart cart = new ShoppingCart();
        Product toothpaste = ProductSearch.linearSearchById(productCatalog, 101);
        cart.addProduct(toothpaste);
        cart.displayCart();
        
        // 2. Linear Search
        System.out.println("\n2. Linear Search Algorithm:");
        Product searchResult = ProductSearch.linearSearch(productCatalog, "iPhone");
        
        // 3. Binary Search (with sorting)
        System.out.println("\n3. Binary Search Algorithm:");
        Product[] sortedProducts = ProductSearch.sortProductsById(productCatalog);
        Product binaryResult = ProductSearch.binarySearchById(sortedProducts, 201);
        
        // 4. Queue operations
        System.out.println("\n4. Queue Operations:");
        purchaseQueue.addPurchaseOrder("John Doe", cart);
        purchaseQueue.displayQueue();
        purchaseQueue.processNextOrder();
        
        System.out.println("\n=== All DSA Concepts Demonstrated! ===");
    }
    
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        purchaseQueue = new PurchaseQueue();
        
        // Initialize the product catalog
        initializeProductCatalog();
        
        System.out.println("🛒 Welcome to Amazon Shopping DSA Simulation!");
        System.out.println("This program demonstrates various Data Structures and Algorithms");
        System.out.println("through a shopping cart implementation.");
        
        // Quick demo of buying toothpaste (addressing the original request)
        System.out.println("\n🦷 Let's start by buying toothpaste as requested:");
        searchForToothpaste();
        ShoppingCart toothpasteCart = buyToothpaste();
        toothpasteCart.displayCart();
        
        // Add the purchase to queue
        purchaseQueue.addPurchaseOrder("DSA Student", toothpasteCart);
        
        System.out.println("\n📚 Choose mode:");
        System.out.println("1. Interactive Shopping (Full Experience)");
        System.out.println("2. DSA Concepts Demonstration");
        System.out.println("3. Process Orders and Exit");
        System.out.print("Enter choice (1-3): ");
        
        int mode = scanner.nextInt();
        scanner.nextLine();
        
        switch (mode) {
            case 1:
                interactiveShopping();
                break;
            case 2:
                demonstrateDSAConcepts();
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid choice, proceeding to process orders...");
        }
        
        // Process all orders in queue
        System.out.println("\n📦 Processing all orders...");
        purchaseQueue.displayQueue();
        purchaseQueue.processAllOrders();
        
        System.out.println("\n✅ Shopping simulation completed!");
        System.out.println("Thanks for using Amazon Shopping DSA Simulation!");
        
        scanner.close();
    }
}