import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<=5;i++)
        {
            System.out.println("Enter a positive number (Negative to stop):");
            int num=scanner.nextInt();
            if(num < 0)
            {
                System.out.println("Negative number is detected.So, Loop gets stopped.");
                break;
            }
            else
            {
                System.out.println("You entered "+ num);
            }
        }
        scanner.close();
    }
}
