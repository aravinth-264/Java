import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number:");
        int num = scanner.nextInt();
        if(num%2==0)
        {
            System.out.println("Your number is Even.");
        }
        else
        {
            System.out.println("Your number is Odd.");
        }
    }
}
