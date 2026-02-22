import java.util.Scanner;
class twoSum {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = scanner.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element for index"+i);
            nums[i]=scanner.nextInt();
        }
        System.out.println("Enter your Target:");
        int target=scanner.nextInt();
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                if(nums[j]+nums[k]==target)
                {
                    System.out.printf("Output: [%d %d]",j,k);
                }
            }
        }
    }
}