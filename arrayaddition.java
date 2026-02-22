import java.util.Scanner;
public class arrayaddition
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int len = scanner.nextInt();
        int[] array= new int[len];
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Enter the value of index "+i);
            array[i] = scanner.nextInt();
            sum +=array[i];
        }
        System.out.println("The sum of array element : "+sum);
        scanner.close();
    }
}
