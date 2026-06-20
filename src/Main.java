import java.util.Scanner;
public class Main{
    public static void main(String[] args){

//        Q1. User login Verification
//        String username;
//        String password;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the username: ");
//        username = scanner.nextLine().trim();
//        System.out.print("Enter the password: ");
//        password = scanner.nextLine().trim();
//
//        if("admin".equals(username) && "java123".equals(password)){
//            System.out.println("Login Successful");
//        }else{
//            System.out.println("Invalid Credentials");
//        }
//        scanner.close();


//        Q2. API Access Control (A backend API allows access only to users
//        who are: Logged in (true) and Age is 18 or above )

        boolean isLoggedIn ;
        int age ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your login status(true/false): ");
        isLoggedIn = sc.nextBoolean();

        System.out.print("Enter you age: ");
        age = sc.nextInt();

        if(isLoggedIn && age>= 18){
            System.out.print("Access Granted");
        }else{
            System.out.print("Access Denied");
        }
        sc.close();

    }
}