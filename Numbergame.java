import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        // Define the range
        int min = 1;
        int max = 100;

        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize variables for tracking the number of attempts
        int attempts = 0;

        while (true) {
            // Prompt the user for their guess
            System.out.print("Guess the random number between " + min + " and " + max + ": ");
            int userGuess = scanner.nextInt();

            // Increment the number of attempts
            attempts++;

            // Compare the user's guess with the random number
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! Your guess is correct. The random number was " + randomNumber + ".");
                System.out.println("It took you " + attempts + " attempts to guess the number.");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
