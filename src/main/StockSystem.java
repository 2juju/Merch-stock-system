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

        // search function
        // searching by ID

        System.out.println("Enter the product id to search: ");
        String searchId = inputObj.nextLine();
        stockManager.searchProductById(searchId);


        // searching by name
        System.out.println("Enter the name of the product to search: ");
        String searchName = inputObj.nextLine();
        stockManager.searchProductByName(searchName);

        // System.out.println(product);
        // stockManager.removeProduct(product);
        // stockManager.listProducts();
        inputObj.close();
    }
}
// TODO: add a search system to pick what to do as a replacement of the gui