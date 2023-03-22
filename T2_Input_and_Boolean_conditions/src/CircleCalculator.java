import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner ourInput = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle: ");

        double radius = ourInput.nextDouble();
        double pi = 3.141592654;

        double area = radius * radius * pi;
        double circumference = 2 * radius * pi;

        System.out.println("================================");
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
        System.out.println("================================");
    }
}
