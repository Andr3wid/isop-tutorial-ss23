import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int ourSecretNumber = 7;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = input.nextLine();

        System.out.println("Please guess the secret number between 1 and 10: ");
        int guess = input.nextInt();

        if(guess == ourSecretNumber) {
            System.out.println("Congratulations, you guessed the correct number!");
        } else if(username.equals("administrator")) {
            System.out.println("Your guessed number was wrong, but you are the administrator. And administrators are always right!");
        } else {
            System.out.println("Sorry, that was wrong. Please try again.");
        }
    }
}
