public class RecursiveMethods {

    static void Method2() {
        System.out.println("This is a print in METHOD 2");
        System.out.println("This is another print in METHOD 2");
    }

    static void Method1() {
        Method2();
        System.out.println("Hello - method 1 has been called");
    }

    static void recursivePrint(int counter, int maxCounter) {
        // recursion step
        if(counter <= maxCounter) {
            System.out.println("Self calling method gets called for the " + counter + " time");
            recursivePrint(counter + 1, maxCounter); // important: change one parameter in each self-call
        } else { // base case
            System.out.println("LAST PRINT - the recursion ends here");
        }
    }

    static int iterativeFactorial(int n) {
        // n = 5 => 5 * 4 * 3 * 2 * 1

        int result = 1;

        for(int i = n; i > 0; i--) {
            result = result * i;
        }

        return result;
    }

    static int recursiveFactorial(int n) {
        // recursion step
        if(n > 1) {
            return n * recursiveFactorial(n - 1);
        } else { // base case
            return 1;
        }
    }

    static String reverseStringRecursive(String input) {
        // recursion step
        if(input.length() > 1) {
            char firstCharacter = input.charAt(0);
            String remainingString = input.substring(1);

            return reverseStringRecursive(remainingString) + firstCharacter;
        } else { // base case
            return input;
        }
    }

    // n is an upper bound until which we want to print fibonacci numbers
    static int fibonacciRecursive(int f1, int f2, int upperBound) {
        if(f2 <= upperBound) {
            System.out.println(f2);
            int nextFibNumber = f1 + f2;
            return fibonacciRecursive(f2, nextFibNumber, upperBound);
        } else {
            System.out.println("upper bound " + upperBound + " reached");
            return f1;
        }
    }

    public static void main(String[] args) {
        // Method1();
        // System.out.println("=== MAIN END ===");

        recursivePrint(1, 10);

        int f1 = iterativeFactorial(5);
        System.out.println("Factorial of 5 is: " + f1);

        int f1Recursive = recursiveFactorial(5);
        System.out.println("Factorial of 5 is: " + f1Recursive);

        String name = "Hugo";
        String reversedName = reverseStringRecursive(name);
        System.out.println("The reversed version of '" + name + "' is: " + reversedName);

        System.out.println("FIBONACCI NUMBERS:");
        int r = fibonacciRecursive(0, 1, 100);
    }
}
