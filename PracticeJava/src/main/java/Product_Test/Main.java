package Product_Test;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating first product with user input
        System.out.println("Enter details for Product 1:");
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Price: ");
        int price1 = sc.nextInt();
        System.out.print("Stock Quantity: ");
        int stock1 = sc.nextInt();
        sc.nextLine(); // Consume newline
        Product product1 = new Product(name1, price1, stock1);
        // Creating second product with user input
        System.out.println("\nEnter details for Product 2:");
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Price: ");
        int price2 = sc.nextInt();
        System.out.print("Stock Quantity: ");
        int stock2 = sc.nextInt();
        Product product2 = new Product(name2, price2, stock2);
        // Displaying product details
        System.out.println("\n--- Product 1 Details ---");
        product1.displayProduct();
        System.out.println("\n--- Product 2 Details ---");
        product2.displayProduct();
        // Let user choose and purchase a product
        System.out.println("\nWhich product would you like to purchase? (1 or 2): ");
        int choice = sc.nextInt();
        System.out.print("Enter quantity to purchase: ");
        int quantity = sc.nextInt();
        if (choice == 1) {
            product1.purchaseProduct(quantity);
        } else if (choice == 2) {
            product2.purchaseProduct(quantity);
        } else {
            System.out.println("Invalid product choice.");
        }
        // Display updated product details
        System.out.println("\n--- Updated Product 1 Details ---");
        product1.displayProduct();
        System.out.println("\n--- Updated Product 2 Details ---");
        product2.displayProduct();
        sc.close();
    }
}
