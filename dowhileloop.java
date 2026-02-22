import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int i;
        do {
            System.out.println("Enter a positive number:");
            i = scanner.nextInt();
        }while(i<=0);
        System.out.println("You Entered "+i);
        scanner.close();
    }
}
