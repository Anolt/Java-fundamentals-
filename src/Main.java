import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args){
//        1. SCANNER CLASS - PROGRAM OF TAKING USER INPUT.
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.print("Hello , " + name );
        
//        2. IF ELSE STATEMENTS -
//        Perform block of code if condition is true .

//        3. RANDOM CLASS - understand by creating a number game (1-6)
//        Random rd = new Random();
//        int number ;
//        number = rd.nextInt(1,3);
//        System.out.print(number);

//        4. MATH CLASS - Right Angle Triangle ;
        double a ;
        double b ;
        double c ;
        System.out.print("Enter the value of a: ");
        a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println(Math.round(c));
        scanner.close();

    }
}