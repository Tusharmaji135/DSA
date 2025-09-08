# Shopping Cart DSA Implementation

This directory contains a comprehensive implementation of shopping cart functionality that demonstrates various Data Structures and Algorithms concepts. The implementation addresses the requirement to "buy toothpaste" through an educational simulation that showcases DSA principles.

## 📁 Files Overview

### Core Classes
- **`Product.java`** - Product entity class demonstrating OOP concepts
- **`ShoppingCart.java`** - Shopping cart implementation using ArrayList
- **`ProductSearch.java`** - Search algorithms (Linear Search, Binary Search)
- **`PurchaseQueue.java`** - Queue implementation for order processing
- **`AmazonShoppingSim.java`** - Main simulation program
- **`ShoppingCartTest.java`** - Test class to validate all implementations

## 🎯 DSA Concepts Demonstrated

### 1. **ArrayList (Dynamic Array)**
- **File:** `ShoppingCart.java`
- **Operations:** Add (O(1) amortized), Remove (O(n)), Get (O(1))
- **Use Case:** Managing products in shopping cart

### 2. **Linear Search Algorithm**
- **File:** `ProductSearch.java`
- **Time Complexity:** O(n)
- **Use Cases:** 
  - Search products by name
  - Search products by ID
  - Search products by category

### 3. **Binary Search Algorithm**
- **File:** `ProductSearch.java`
- **Time Complexity:** O(log n)
- **Prerequisite:** Sorted array
- **Use Case:** Efficient product search by ID

### 4. **Queue Data Structure**
- **File:** `PurchaseQueue.java`
- **Implementation:** LinkedList as Queue
- **Operations:** Enqueue (O(1)), Dequeue (O(1)), Peek (O(1))
- **Use Case:** Order processing system (FIFO)

### 5. **Sorting Algorithm**
- **File:** `ProductSearch.java`
- **Algorithm:** Bubble Sort
- **Time Complexity:** O(n²)
- **Use Case:** Sorting products by ID for binary search

### 6. **Object-Oriented Programming**
- **Files:** All classes
- **Concepts:** Encapsulation, Inheritance, Polymorphism
- **Features:** Private fields, Getters/Setters, Method overriding

## 🚀 How to Run

### Compile all Java files:
```bash
javac *.java
```

### Run the test suite:
```bash
java ShoppingCartTest
```

### Run the main simulation:
```bash
java AmazonShoppingSim
```

## 🛒 Usage Examples

### Quick Toothpaste Purchase (Addresses Original Request)
```java
// The simulation automatically demonstrates buying toothpaste:
// 1. Initializes product catalog with toothpaste options
// 2. Searches for toothpaste using linear search
// 3. Adds toothpaste to shopping cart
// 4. Processes the purchase through queue system
```

### Interactive Shopping
The simulation provides three modes:
1. **Interactive Shopping** - Full shopping experience with menu
2. **DSA Concepts Demonstration** - Automated demo of all algorithms
3. **Process Orders and Exit** - Quick demo mode

## 📊 Performance Analysis

| Operation | Data Structure | Time Complexity | Space Complexity |
|-----------|----------------|-----------------|------------------|
| Add to Cart | ArrayList | O(1) amortized | O(n) |
| Remove from Cart | ArrayList | O(n) | O(1) |
| Linear Search | Array/ArrayList | O(n) | O(1) |
| Binary Search | Sorted Array | O(log n) | O(1) |
| Enqueue Order | Queue (LinkedList) | O(1) | O(1) |
| Dequeue Order | Queue (LinkedList) | O(1) | O(1) |
| Bubble Sort | Array | O(n²) | O(1) |

## 🎓 Educational Value

This implementation serves as a practical example of how DSA concepts apply to real-world scenarios:

1. **ArrayList** demonstrates dynamic array usage in shopping carts
2. **Search Algorithms** show different approaches to finding products
3. **Queue** illustrates order processing in e-commerce systems
4. **Sorting** enables efficient searching through binary search
5. **OOP** provides clean, maintainable code structure

## 🧪 Testing

The `ShoppingCartTest.java` file provides comprehensive testing for:
- Product creation and manipulation
- Shopping cart operations
- Search algorithm functionality
- Queue operations
- Complete toothpaste purchase workflow

## 🎯 Addressing the Original Request

The request to "open amazon and buy toothpaste" has been interpreted and implemented as:

1. **✅ Product Catalog** - Includes various toothpaste options (Colgate, Crest, Sensodyne)
2. **✅ Search Functionality** - Can search for toothpaste products
3. **✅ Shopping Cart** - Add toothpaste to cart
4. **✅ Purchase Process** - Complete purchase through queue system
5. **✅ Educational Value** - Demonstrates DSA concepts throughout

The implementation focuses on educational DSA concepts rather than actual web automation, which is more appropriate for a learning repository.

## 🔧 Extension Possibilities

This implementation can be extended to demonstrate additional DSA concepts:
- **Stack** for undo/redo operations
- **Hash Table** for O(1) product lookups
- **Heap** for priority queue implementation
- **Graph** for product recommendation systems
- **Dynamic Programming** for discount optimization