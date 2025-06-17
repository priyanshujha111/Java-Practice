import java.util.Scanner;
public class Factors {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                
                if (i == num / i) {
                    count++;
                } else {
                    
                    count += 2;
                }
            }
        }

        System.out.println("Number of factors of " + num + " is: " + count);
        sc.close();
    }
}

    

