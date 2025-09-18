import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game! ");

        while (playAgain) {
            int randomNumber = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 15;
            boolean guessedCorrectly = false;

            System.out.println("\nGenerated a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("\nCorrect! You have guessed the number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    score++;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("\nYou've used all attempts. The correct number was: " + randomNumber);
            }

            System.out.println("Your current score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            String response = sc.next();
            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nThanks for playing! Your final score is: " + score);
        sc.close();
    }
}
