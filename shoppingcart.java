import java.util.Scanner;

public class shoppingcart {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int total=0;
        System.out.print("Enter no of items:");
        int item= scanner.nextInt();
        for(int i=1;i<=item;i++)
        {
            System.out.println("Enter the price of item "+ i );
            double price=scanner.nextDouble();
            total+=price;
        }
        System.out.println("The Total Price is $"+total);
        scanner.close();
    }

}
