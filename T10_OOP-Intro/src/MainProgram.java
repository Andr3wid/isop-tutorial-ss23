import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("Hello from our main method");

        // Scanner input = new Scanner(System.in);
        Pet myPet1 = new Pet(10, "Susi", "Cat");
        Pet myPet2 = new Pet(3, "Bello", "Dog");
        Pet myPet3 = new Pet(7, "Carl", "Camel");

        System.out.println("The name of pet 1 is: " + myPet1.getName());

        myPet1.haveBirthday();

        myPet1.setAge(-1);

        myPet1.makeSound();
        myPet2.makeSound();
        myPet3.makeSound();

    }
}
