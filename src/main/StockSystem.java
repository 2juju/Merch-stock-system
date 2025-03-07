package main;
import managers.StockManager;
import models.Product;

public class StockSystem {
    public static void main(String[] args) {

        StockManager stockManager = new StockManager();
        // test items
        Product product1 = new Product("1", "Apple", 10, 0.5);
        Product product2 = new Product("2", "Banana", 20, 0.3);
        Product product3 = new Product("3", "Orange", 15, 0.4);

        stockManager.addProduct(product1);
        stockManager.addProduct(product2);
        stockManager.addProduct(product3);
        stockManager.listProducts();

        Product product = stockManager.searchProductById("2");
        System.out.println(product);
        stockManager.removeProduct(product);
        stockManager.listProducts();
    }
}
