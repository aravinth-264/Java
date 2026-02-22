import java.util.Scanner;
public class GroceryList {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            for(int i=0;i<5;i++)
            {
                System.out.println("Enter item #"+i+":");
                String item = scanner.nextLine();
                if(item.equals("skip"))
                {
                    continue;                }
                else if (item.equals("done"))
                {
                    break;
                }
                else
                {
                    System.out.println("You added:"+item);
                }
            }
        }
    }