import java.util.Scanner;
public class Largestnumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] number = new int[5];
        for(int i=0;i<number.length;i++)
        {
            System.out.println("Enter a number for the index"+i);
            number[i]=scan.nextInt();
        }
        int max=number[0];
        for(int j=0;j<number.length;j++)
        {
            if(number[j]>max)
            {
                max=number[j];
            }
        }
        System.out.println("The Largest number in the given array is "+max);
    }
}
