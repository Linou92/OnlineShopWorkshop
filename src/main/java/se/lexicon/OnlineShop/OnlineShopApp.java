package se.lexicon.OnlineShop;

public class OnlineShopApp {

    public static void runApp() {

        // Create products
        Product laptop = new Product("Laptop", 12000);
        Product mouse = new Product("Wireless Mouse", 500);

        // Apply discount to one product
        mouse.applyDiscount(20);

        // Create customer
        Customer customer = new Customer("Alice William", "alice@example.com");

        // Create order
        Order order = new Order(customer);

        // Add products
        order.addProduct(laptop);
        order.addProduct(mouse);

        // Print first summary
        order.printSummary();

        // Remove one product
        order.removeProduct(laptop);

        // Print updated summary
        order.printSummary();
    }
}
