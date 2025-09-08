/**
 * Product class demonstrating Object-Oriented Programming concepts
 * Used in shopping cart DSA implementation
 */
public class Product {
    private String name;
    private double price;
    private int id;
    private String category;
    
    // Constructor
    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getId() {
        return id;
    }
    
    public String getCategory() {
        return category;
    }
    
    // Setters
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=$" + price + ", category='" + category + "'}";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return id == product.id;
    }
}