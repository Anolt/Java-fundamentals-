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

//        3. RANDOM CLASS
        Random rd = new Random();
        int number ;
        number = rd.nextInt(1,3);
        System.out.print(number);



//
        scanner.close();
    }
}