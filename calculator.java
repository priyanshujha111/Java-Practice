
    
public class calculator {

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three numbers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Create a Calculator object
        calculator calculator = new calculator();

        // Call the add method with two parameters
        int sumTwo = calculator.add(10, 20);
        System.out.println("Sum of two numbers: " + sumTwo);

        // Call the overloaded add method with three parameters
        int sumThree = calculator.add(5, 15, 25);
        System.out.println("Sum of three numbers: " + sumThree);
    }
}
//output
//Sum of two numbers: 30
//Sum of three numbers: 45
