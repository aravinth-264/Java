import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1:");
        int num1=scanner.nextInt();
        System.out.print("Enter number2:");
        int num2=scanner.nextInt();
        int diff=num1-num2;
        int sum=num1+num2;
        int multi=num1*num2;
        int div=num1/num2;
        System.out.println("Sum="+ sum);
        System.out.println("Diff="+diff);
        System.out.println("Multi="+multi);
        System.out.println("Div="+div);
        scanner.close();
    }
}
