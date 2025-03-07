package models;

public class Product {
    private final String id;
    private final String name;
    private int quantity;
    private double price;
    // variable to store product details

    public Product(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        // constructor to initialize product details
    }
    public void updateQuantity(int quantity) {
        this.quantity += quantity;
        System.out.println(name + " quantity updated to " + this.quantity);
        // method to update quantity of product
    }
    public void updatePrice(double price) {
        this.price = price;
        System.out.println(name + " price updated to " + this.price);
        // method to update price of product
        // may delete later - this is just for testing
    }
    public String getId(){return id;}
    public String getName(){return name;}
    public int getQuantity(){return quantity;}
    public double getPrice(){return price;}
    // getters to get product details
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
        // method to return product details
    }

}

