import java.util.Scanner;

public class BooleanConditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Please enter your test result in percent: ");
        int testResultInPercent = input.nextInt();

        boolean isOverEighteen = age > 18;
        boolean hasOverNinetyPercent = testResultInPercent >= 90;

        System.out.println("Person is over 18: " + isOverEighteen);
        System.out.println("Has more than 90% on test: " + hasOverNinetyPercent);

        boolean getsDrivingLicense = isOverEighteen && hasOverNinetyPercent;

        System.out.println("Person gets driving license: " + getsDrivingLicense);
    }
}
