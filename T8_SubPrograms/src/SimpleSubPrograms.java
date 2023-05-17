import java.util.Scanner;

public class SimpleSubPrograms {
    //
    static void greetUser(String username, int count) {
        for(int i = 1; i <= count; i++) {
            System.out.println("Hello " + username + ", it's a pleasure to see you!");
        }
        System.out.println("==================================");
    }

    static double calculateCircleArea(int r) {
        System.out.println("Calculating area for a circle with radius " + r);
        return r * r * 3.14159265;
    }

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Hello, please enter a whole number: ");
//        int num = input.nextInt();
//        System.out.println("You entered: " + num);

        String asdf = "Hugo";

        greetUser(asdf, 3);
        greetUser("Sabrina", 2);
        greetUser("Spongebob", 10);

        /////////////////////////////
        double circleArea = calculateCircleArea(10);
        System.out.println("The area of the circle is: " + circleArea);
    }
}
