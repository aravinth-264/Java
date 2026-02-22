import java.util.Scanner;
public class userarray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int len = scanner.nextInt();
        int[] array = new int[len];
        for(int i=0;i<len;i++)
        {
            System.out.println("Enter a number for the index"+i);
            array[i]= scanner.nextInt();
        }
        for(int j=0;j<len;j++)
        {
            System.out.println("index"+j+" number is "+array[j]);
        }
    }
}
