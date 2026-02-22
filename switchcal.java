import java.util.Scanner;
import java.lang.String;

public class switchcal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1:");
        int num1 = scanner.nextInt();
        System.out.print("Enter number2:");
        int num2 = scanner.nextInt();
        int diff=num1-num2;
        int sum=num1+num2;
        int multi=num1*num2;
        int div=num1/num2;
        int mod=num1%num2;
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo");
        System.out.print("Enter the Operation number to execute that Operation:");
        int op = scanner.nextInt();
        switch(op)
        {
            case 1:
            {
                System.out.print("Addition="+ sum);
                break;
            }
            case 2:
            {
                System.out.println("Subtraction="+diff);
                break;
            }
            case 3:
            {
                System.out.println("Multiplication="+multi);
                break;
            }
            case 4:
            {
                System.out.println("Division="+div);
                break;
            }
            case 5:
            {
                System.out.println("Modulo="+mod);
                break;
            }
            default:
            {
                System.out.println("Invalid Choice");
                break;
            }
        }
        scanner.close();
    }
}
