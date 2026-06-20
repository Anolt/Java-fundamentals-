import java.util.Scanner;
public class Main{
    public static void main(String[] args){

//        Q1. User login Verification
        String username;
        String password;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the username: ");
        username = scanner.nextLine().trim();
        System.out.print("Enter the password: ");
        password = scanner.nextLine().trim();

        if("admin".equals(username) && "java123".equals(password)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Invalid Credentials");
        }
        scanner.close();
    }
}