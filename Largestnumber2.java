import java.util.Scanner;
public class Largestnumber2
{
    public static void main(String[] args)
    {
            Scanner scan = new Scanner(System.in);
            int[] number = new int[5];
            int max = number[0];
            for (int i = 0; i < number.length; i++)
            {
                System.out.println("Enter a number for the index" + i);
                number[i] = scan.nextInt();
                if (number[i] > max)
                {
                    max = number[i];
                }
            }
            System.out.println("The Largest number in the given array is " +max);
    }
}