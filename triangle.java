public class triangle {
    public static void main(String[] args) {
        int rows = 5; // Change this value to increase/decrease the size of the triangle
        
        for (int i = 1; i <= rows; i++) { // Loop for rows
            for (int j = 1; j <= rows - i; j++) { // Loop for spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Loop for stars
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
    
}
