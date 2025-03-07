package models;
// represents each product (item) in the stock system, contains product details,
/**
* Product class to store product details
* represents each product (item) in the stock system
* author 2juju
* version 1.0
*/

public class Product {

    private final String id;
    private final String name;
    private int quantity;
    private double price;

    /**
     * Constructor to initialise product details
     * @param id - unique identifier for product
     * @param name - name of product
     * @param quantity - quantity of product
     * @param price - price of product
     * @return - product details
     */
    public Product(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    /**
    * Updates the quantity of the product
    * @param quantity - quantity of product
    */
    public void updateQuantity(int quantity) {

        this.quantity += quantity;
        System.out.println(name + " quantity updated to " + this.quantity);
    }

    /**
     * Updates the price of the product
     * @param price - price of product
     */
    public void updatePrice(double price) {
        this.price = price;
        System.out.println(name + " price updated to " + this.price);
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

