import java.util.Random;
import java.util.Scanner;

public class guessing_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secreatNumber = random.nextInt(100)+1;//add 1 because our range is from 1 to 100 not from 0
        int guess=0;
        int attempts=0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Let's Start the game?");

        do{
            System.out.println("Enter your Guess:");
            guess=scanner.nextInt();
            attempts++;
            if(guess < secreatNumber)
            {
                System.out.println("Your guess is low,Try again!");
            }
            else if(guess > secreatNumber)
            {
                System.out.println("Your guess is high,Try again!");
            }
            else
            {
                System.out.println("Congratulation!,you guessed the number at "+ attempts +" attempts.");
            }
        }while(guess!=secreatNumber);
        scanner.close();
    }
}
