package se.lexicon.OnlineShop;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        if(customer == null) throw new IllegalArgumentException("Customer cannot be null");
        this.customer = customer;
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        if(product != null) products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public double calculateTotal(){
        double total = 0;
        for(Product product : products){
            total += product.getPrice();
        }
        return total;
    }

    public void printSummary(){
        StringBuilder productList = new StringBuilder();
        for(Product product : products){
            productList.append(String.format("- %s : %.2f SEK%n", product.getName(), product.getPrice()));
        }

        IO.println(String.format("""
                ----- ORDER SUMMARY -----
                Customer: %s
                Products: 
                %sTotal: %.2f SEK
                """,
                customer.getName(),
                productList,
                calculateTotal()));
    }
}
