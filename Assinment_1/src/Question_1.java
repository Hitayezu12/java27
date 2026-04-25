import java.util.ArrayList;

// Product class
class Product {
    int productId;
    String productName;
    String productDescription;
    int productQuantity;

    // Constructor
    public Product(int productId, String productName, String productDescription, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productQuantity = productQuantity;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "ID: " + productId +
               ", Name: " + productName +
               ", Description: " + productDescription +
               ", Quantity: " + productQuantity;
    }
}

// Main class
public class Question_1 {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        // Adding products
        products.add(new Product(1, "Laptop", "HP Laptop", 5));
        products.add(new Product(2, "Phone", "Samsung Galaxy", 10));
        products.add(new Product(3, "Tablet", "iPad", 3));

        // Display products
        for (Product p : products) {
            System.out.println(p);
        }
    }
}