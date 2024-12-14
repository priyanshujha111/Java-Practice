import java.util.Scanner;

public class Fruit {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int day= in.nextInt();
    switch (day)
    {
        case 1 -> System.out.println("Monday");
        case 2-> System.out.println("Tue");
         case 3 -> System.out.println("wed");
         case 4 -> System.out.println("Thu");
         case 5-> System.out.println("fri");
         case 6 -> System.out.println("Saturday");
         case 7 -> System.out.println("Sunday");
    }}}