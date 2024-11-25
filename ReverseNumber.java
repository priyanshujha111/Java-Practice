
    
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Read the number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Variable to store the reversed number
        int reversedNum = 0;
        
        // Reverse the number
        while (num != 0) {
            int digit = num % 10;  // Get the last digit
            reversedNum = reversedNum * 10 + digit;  // Add it to the reversed number
            num /= 10;  // Remove the last digit from the original number
        }
        
        // Output the reversed number
        System.out.println("Reversed number: " + reversedNum);
        
        // Close the scanner
        sc.close();
    }
}
//OUTPUT
//Enter a number: 87
//Reversed number: 78





