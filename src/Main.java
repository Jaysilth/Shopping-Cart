import java.util.Scanner; // Import Scanner to get user input

public class Main {

    public static void main(String[] args) {

        // -----------------------------
        // SHOPPING CART PROGRAM
        // -----------------------------
        // A simple shopping cart project to calculate total price based on item,
        // unit price, and quantity. Learned from Bro Code on YouTube.

        Scanner scanner = new Scanner(System.in); // Scanner object for input

        // Variables
        String item;       // Name of the item
        double price;      // Price per item
        int quantity;      // Number of items to purchase
        char currency = '$'; // Currency symbol
        double total;      // Total price

        // Ask for item name
        System.out.print("What item would you like to purchase?: ");
        item = scanner.nextLine();

        // Ask for price per item
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        // Ask for quantity
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        // Calculate total
        total = price * quantity;

        // Display summary
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        // Close scanner
        scanner.close();
    }
}
