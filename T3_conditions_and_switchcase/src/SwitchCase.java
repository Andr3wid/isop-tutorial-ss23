import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("~~ Please select an item from our menu ~~");
        System.out.println("Burger .... 1");
        System.out.println("Pizza ..... 2");
        System.out.println("Fries ..... 3");

        int userChoice = scanner.nextInt();

        /*
        if(userChoice == 1) {
            System.out.println("Juicy burger is on its way!");
        }

        if(userChoice == 2) {
            System.out.println("Crispy pizza is in the oven");
        }

        if(userChoice == 3) {
            System.out.println("Fries with ketchup it is!");
        }

        if(userChoice != 1 && userChoice != 2 && userChoice !=3) {
            System.out.println("We don't have that on our menu");
        }
         */

        // tells to inspect the value of the variable "userChoice"
        switch (userChoice) {
            case 1:
                System.out.println("Juicy burger is on its way!");
                break;
            case 2:
                System.out.println("Crispy pizza is in the oven");
                break;
            case 3:
                System.out.println("Fries with ketchup it is!");
                break;
            default:
                System.out.println("We don't have that on our menu");
                break;
            }
        }
    }
