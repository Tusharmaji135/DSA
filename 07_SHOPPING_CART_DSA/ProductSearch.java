import java.util.ArrayList;
import java.util.Arrays;

/**
 * ProductSearch class demonstrating search algorithms
 * Implements Linear Search and Binary Search for product searching
 */
public class ProductSearch {
    
    // Linear Search Algorithm - O(n) time complexity
    public static Product linearSearch(ArrayList<Product> products, String productName) {
        System.out.println("Performing Linear Search for: " + productName);
        
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().toLowerCase().contains(productName.toLowerCase())) {
                System.out.println("Found product at index " + i + " using Linear Search");
                return products.get(i);
            }
        }
        
        System.out.println("Product not found using Linear Search");
        return null;
    }
    
    // Linear Search by ID - O(n) time complexity
    public static Product linearSearchById(ArrayList<Product> products, int productId) {
        System.out.println("Performing Linear Search by ID: " + productId);
        
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == productId) {
                System.out.println("Found product at index " + i + " using Linear Search by ID");
                return products.get(i);
            }
        }
        
        System.out.println("Product not found using Linear Search by ID");
        return null;
    }
    
    // Binary Search by ID (requires sorted array) - O(log n) time complexity
    public static Product binarySearchById(Product[] sortedProducts, int productId) {
        System.out.println("Performing Binary Search by ID: " + productId);
        
        int left = 0;
        int right = sortedProducts.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (sortedProducts[mid].getId() == productId) {
                System.out.println("Found product at index " + mid + " using Binary Search");
                return sortedProducts[mid];
            }
            
            if (sortedProducts[mid].getId() < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println("Product not found using Binary Search");
        return null;
    }
    
    // Sort products by ID for binary search (using built-in sort)
    public static Product[] sortProductsById(ArrayList<Product> products) {
        Product[] productArray = products.toArray(new Product[0]);
        
        // Simple bubble sort implementation for educational purposes
        for (int i = 0; i < productArray.length - 1; i++) {
            for (int j = 0; j < productArray.length - i - 1; j++) {
                if (productArray[j].getId() > productArray[j + 1].getId()) {
                    // Swap products
                    Product temp = productArray[j];
                    productArray[j] = productArray[j + 1];
                    productArray[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Products sorted by ID for binary search");
        return productArray;
    }
    
    // Search products by category - O(n) time complexity
    public static ArrayList<Product> searchByCategory(ArrayList<Product> products, String category) {
        System.out.println("Searching for products in category: " + category);
        ArrayList<Product> categoryProducts = new ArrayList<>();
        
        for (Product product : products) {
            if (product.getCategory().toLowerCase().equals(category.toLowerCase())) {
                categoryProducts.add(product);
            }
        }
        
        System.out.println("Found " + categoryProducts.size() + " products in category: " + category);
        return categoryProducts;
    }
    
    // Search products by price range - O(n) time complexity
    public static ArrayList<Product> searchByPriceRange(ArrayList<Product> products, double minPrice, double maxPrice) {
        System.out.println("Searching for products in price range: $" + minPrice + " - $" + maxPrice);
        ArrayList<Product> priceRangeProducts = new ArrayList<>();
        
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                priceRangeProducts.add(product);
            }
        }
        
        System.out.println("Found " + priceRangeProducts.size() + " products in price range");
        return priceRangeProducts;
    }
}