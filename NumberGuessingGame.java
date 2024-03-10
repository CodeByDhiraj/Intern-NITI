//Intern NITI Internship
//Domain Name -> Java Programming
//Task 1 -> (Number guessing game)
//Intern Name -> Dhiraj Kumar

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minNumber = 1;
        int maxNumber = 100;
        int triedNum = 1;
        int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        boolean hasGuessedCorrectly = false;

        System.out.println("---------------Welcome To The Number Guessing Game---------------\n");

        System.out.println("Guess a number between 1 and 100: ");

        while (!hasGuessedCorrectly) {
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You have guessed the right number: " + randomNumber);
                System.out.println("You Guessed right number in " + triedNum + " try");
            } else if (userGuess < randomNumber) {
                System.out.println("Try a higher number. Guess again:");
                triedNum++;
            } else {
                System.out.println("Try a lower number. Guess again:");
                triedNum++;            }
        }

        scanner.close();
    }
}
