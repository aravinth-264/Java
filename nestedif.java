import java.util.Scanner;
public class nestedif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName="Aravinth";
        String password="12345";

        System.out.print("Enter your Username:");
        String enteredUserName=scanner.nextLine();

        if(enteredUserName.equals(userName))
        {
            System.out.print("Enter your password:");
            String enteredPassword=scanner.nextLine();
            if(enteredPassword.equals(password))
            {
                System.out.println("Login Successfully!");
            }
            else
            {
                System.out.println("Password is Invalid!");
            }
        }
        else
        {
            System.out.println("Username is invalid!");
        }
        scanner.close();
    }
}
