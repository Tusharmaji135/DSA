import java.util.LinkedList;
import java.util.Queue;

/**
 * PurchaseQueue class demonstrating Queue data structure
 * Implements a purchase processing queue using LinkedList as Queue
 */
public class PurchaseQueue {
    private Queue<PurchaseOrder> purchaseQueue;
    private int orderCounter;
    
    // Constructor
    public PurchaseQueue() {
        purchaseQueue = new LinkedList<>();
        orderCounter = 1;
    }
    
    // Inner class for Purchase Order
    public static class PurchaseOrder {
        private int orderId;
        private String customerName;
        private ShoppingCart cart;
        private String status;
        
        public PurchaseOrder(int orderId, String customerName, ShoppingCart cart) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.cart = cart;
            this.status = "Pending";
        }
        
        // Getters
        public int getOrderId() { return orderId; }
        public String getCustomerName() { return customerName; }
        public ShoppingCart getCart() { return cart; }
        public String getStatus() { return status; }
        
        // Setter for status
        public void setStatus(String status) { this.status = status; }
        
        @Override
        public String toString() {
            return "Order #" + orderId + " - Customer: " + customerName + 
                   " - Items: " + cart.getCartSize() + 
                   " - Total: $" + String.format("%.2f", cart.getTotalAmount()) +
                   " - Status: " + status;
        }
    }
    
    // Add order to queue (Queue offer operation - O(1))
    public void addPurchaseOrder(String customerName, ShoppingCart cart) {
        if (cart.isEmpty()) {
            System.out.println("Cannot create order with empty cart for customer: " + customerName);
            return;
        }
        
        PurchaseOrder order = new PurchaseOrder(orderCounter++, customerName, cart);
        purchaseQueue.offer(order);
        System.out.println("Order added to queue: " + order);
    }
    
    // Process next order in queue (Queue poll operation - O(1))
    public PurchaseOrder processNextOrder() {
        if (purchaseQueue.isEmpty()) {
            System.out.println("No orders in queue to process");
            return null;
        }
        
        PurchaseOrder order = purchaseQueue.poll();
        order.setStatus("Processing");
        System.out.println("Processing order: " + order);
        
        // Simulate processing time
        try {
            Thread.sleep(1000); // 1 second delay to simulate processing
        } catch (InterruptedException e) {
            System.out.println("Processing interrupted");
        }
        
        order.setStatus("Completed");
        System.out.println("Order completed: " + order);
        return order;
    }
    
    // Peek at next order without removing (Queue peek operation - O(1))
    public PurchaseOrder peekNextOrder() {
        if (purchaseQueue.isEmpty()) {
            System.out.println("No orders in queue");
            return null;
        }
        
        PurchaseOrder order = purchaseQueue.peek();
        System.out.println("Next order to process: " + order);
        return order;
    }
    
    // Get queue size (Queue size operation - O(1))
    public int getQueueSize() {
        return purchaseQueue.size();
    }
    
    // Check if queue is empty (Queue isEmpty operation - O(1))
    public boolean isEmpty() {
        return purchaseQueue.isEmpty();
    }
    
    // Display all orders in queue
    public void displayQueue() {
        System.out.println("\n=== Purchase Queue ===");
        if (purchaseQueue.isEmpty()) {
            System.out.println("No orders in queue");
            return;
        }
        
        System.out.println("Orders in queue (" + purchaseQueue.size() + " total):");
        int position = 1;
        for (PurchaseOrder order : purchaseQueue) {
            System.out.println(position + ". " + order);
            position++;
        }
        System.out.println("===================");
    }
    
    // Process all orders in queue
    public void processAllOrders() {
        System.out.println("\n=== Processing All Orders ===");
        while (!purchaseQueue.isEmpty()) {
            processNextOrder();
            System.out.println("Remaining orders in queue: " + purchaseQueue.size());
        }
        System.out.println("All orders processed successfully!");
    }
    
    // Clear all orders from queue
    public void clearQueue() {
        purchaseQueue.clear();
        System.out.println("Purchase queue cleared!");
    }
}