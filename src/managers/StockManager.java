package managers;
// inventory management system, contains stock details, manages stock
import java.util.ArrayList;
import java.util.function.Predicate;
import models.Product;

public class StockManager {
    /**
     * Stores products in the inventory, manages stock, adds products to stock
     * @param products - list of products
     */
    private ArrayList<Product> products = new ArrayList<>();

    /**
     * Adds a product to the inventory
     * @param product
     */
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to stock");
    }

    public void removeProduct(Product product){
        products.remove(product);
        System.out.println(product.getName() + " removed from stock");
    } // ill change this later, make a helper function instead

    // helper function
    /**
     * Searches for a product in the inventory using its ID or name
     * @param predicate
     * @return the product if found, null otherwise
     */
    public Product searchProduct(Predicate<Product> predicate){
        for(Product product : products){
            if(predicate.test(product)){
                return product;
            }
        }
        System.out.println("Product not found");
        return null;
    }
    public Product searchProductById(String id){
        return searchProduct(product -> product.getId().equals(id));
    }
    public Product searchProductByName(String name){
        return searchProduct(product -> product.getName().equals(name));
    }

    public void listProducts(){
        for(Product product : products){
            System.out.println(product);
        }
    }
    
}
