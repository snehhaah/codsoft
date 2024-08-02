import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int range = 100;
        int maxAttempts = 10;
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(range) + 1;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Guess the number between 1 and " + range + "! You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    hasGuessedCorrectly = true;
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry! You've used all your attempts. The correct number was " + numberToGuess + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}
