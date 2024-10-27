import java.util.Scanner;
public class fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){
            case "Mango":
            System.out.println("KIng of fruit");
            break;
            case "Apple":
            System.out.println("A sweet red fruit");
            break;
            case "orange":
            System.out.println("Round Fruit");
            break;
            case "grapes":
            System.out.println("small fruit");
            break;
            default:
            System.out.println("plz enter valid fruit");
        }
        
    }
    
}
