 import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Read the string from the user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Reverse the string using StringBuilder
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();
        
        // Output the reversed string
        System.out.println("Reversed string: " + reversedStr.toString());
        
        // Close the scanner
        sc.close();
    }
}

//OUTPUT
//Enter a string: Priyanshu
//Reversed string: uhsnayirP

