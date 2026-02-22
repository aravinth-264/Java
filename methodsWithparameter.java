import java.util.Scanner;
public class methodsWithparameter
{
//    public static void main(String[] args)
//    {
//        greet("Aravinth");
//    }

//    public static void main(String[] args)
//    {
//        String name="Aravinth";
//        greet(name);
//    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        greet(name);
    }
    public static void greet(String name)
    {
        System.out.println("Hello, "+name+ "! Welcome.");
    }


}

