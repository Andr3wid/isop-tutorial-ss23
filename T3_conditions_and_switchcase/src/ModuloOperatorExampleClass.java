import java.util.Scanner;

public class ModuloOperatorExampleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your number to check: ");
        int userInput = input.nextInt();

        if(userInput % 2 == 0) {
            System.out.println("The entered number is even");
        } else {
            System.out.println("The entered number is odd");
        }
    }
}
