package main;
import java.util.Scanner;
import managers.StockManager;
import models.Product;

public class StockSystem {
    public static void main(String[] args) {

        StockManager stockManager = new StockManager();
        // test items
        Scanner inputObj  = new Scanner(System.in);

        System.out.println("Enter the product id: ");
        String id = inputObj.nextLine();

        System.out.println("Enter the product name: ");
        String name = inputObj.nextLine();

        System.out.println("Enter the product quantity: ");
        int quantity = inputObj.nextInt();


        System.out.println("Enter the product price: ");
        double price = inputObj.nextDouble();


        Product product = new Product(id, name, quantity, price);
        stockManager.addProduct(product);

        System.out.println("Stock list: ");
        stockManager.listProducts();


        // Product product = stockManager.searchProductById("");
        // System.out.println(product);
        // stockManager.removeProduct(product);
        // stockManager.listProducts();
        inputObj.close();
    }
}
