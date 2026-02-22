import java.util.Scanner;
public class age_in_months {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your name?");
            String name = scanner.nextLine();
            System.out.println("How old are you?");
            int ageInYears = scanner.nextInt();
            int ageInMonths = ageInYears*12;
            System.out.println("Hello, "+ name +"! You are "+ ageInMonths +"months old.");
            scanner.close();

        }
    }

