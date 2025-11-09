import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("🎯Welcome to Guess The Number!");

        while(playAgain) {
            System.out.println("\nSelect Difficulty Level:");
            System.out.println("1. Easy (1–50)");
            System.out.println("2. Medium (1–100)");
            System.out.println("3. Hard (1–200)");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            int maxRange = 100;

            switch (choice) {
                case 1: maxRange = 50;
                case 2: maxRange = 100;
                case 3: maxRange = 200;
                default: System.out.println("Invalid choice! Defaulting to Medium");
            }
            int numberToGuess = random.nextInt(100) + 1;
            int userGuess = 0;
            int attempts = 0;
        

        System.out.println("I'm thinking of a number between 1 and 100...");
        System.out.println("Can you guess it?");

        while (userGuess != numberToGuess) {
            System.out.print("\nEnter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess )  {
                System.out.println("Too low!Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too High! Try again.");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " tries");
            }
        }

        System.out.println("\nDo you want to play again? (yes/no):");
        String again = scanner.next().toLowerCase();

        if (!again.equals("yes")) {
        playAgain = false;
        System.out.println("\n Thanks for playing! Goodbye!");
            }
        }
        scanner.close();
    }
}