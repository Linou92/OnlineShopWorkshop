package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

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
