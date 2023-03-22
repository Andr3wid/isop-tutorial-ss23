public class VariableSwap {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;

        System.out.println("-- before swapping ---");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // temp holds the original value of a which is 100
        int temp;
        temp = b;
        b = a;
        a = temp;

        System.out.println("-- after swapping ---");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
