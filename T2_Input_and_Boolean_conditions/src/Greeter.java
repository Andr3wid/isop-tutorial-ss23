import java.util.Scanner;

public class Greeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        String sentenceStart = "Hello, it's great to have you here ";

        String completeSentence = sentenceStart + name;

        System.out.println(completeSentence);

        /////////////////////////////////////////////////
    }
}
