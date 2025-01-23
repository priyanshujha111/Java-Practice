import java.util.Scanner;

public class ProductCatalog {
    public static void main(String[] args) {
        // Array of product names
        String[] products = {"Laptop", "Mouse", "Keyboard", "Monitor", "Printer"};

        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a product name to search
        System.out.println("Enter the product name to search: ");
        String searchProduct = scanner.nextLine();

        // Flag to check if the product is found
        boolean found = false;

        // Search for the product in the array
        for (String product : products) {
            if (product.equalsIgnoreCase(searchProduct)) {
                found = true;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("Product " + searchProduct + " is available.");
        } else {
            System.out.println("Product " + searchProduct + " is not available.");
        }

        // Close the scanner
        scanner.close();
    }
}
//output
//mouse 
//preoduct mouse is available