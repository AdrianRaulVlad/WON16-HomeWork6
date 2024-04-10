/*
3) Create an object that represents a Product
   state: name, price, quantity, category
   behavior: getName, getPrice, getQuantity, getCategory
        - hasStock : will return true if the quantity is not 0
        - isCategory(String category) : return true if the category is equal to the parameter
*/
public class Product {
    // State variables
    private String name;
    private double price;
    private int quantity;
    private String category;

    // Constructor to initialize the Product object
    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    // Additional behavior methods
    public boolean hasStock() {
        return quantity > 0;
    }

    public boolean isCategory(String category) {
        return this.category.equalsIgnoreCase(category);
    }
}
