
    import java.util.Scanner;

public class MarksAnalyzer {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Array to store marks of 12 students
        int[] marks = new int[12];

        // Input marks of 12 students
        System.out.println("Enter the marks of 12 students: ");
        for (int i = 0; i < 12; i++) {
            marks[i] = scanner.nextInt();
        }

        // Initialize highest and lowest marks
        int highest = marks[0];
        int lowest = marks[0];

        // Find the highest and lowest marks
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        // Display the results
        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);

        // Close the scanner
        scanner.close();
    }
}

//output
//Highest marks: 98
//Lowest marks :45    

