import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        int chosenNumber = input.nextInt();

        for(int counter = 1; counter <= 1000; counter++) {
            int result = counter * chosenNumber;
            System.out.println(counter + " x " + chosenNumber + " = " + result);
        }
    }
}
