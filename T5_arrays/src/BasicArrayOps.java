public class BasicArrayOps {
    public static void main(String[] args) {
        // DATATYPE[] IDENTIFIER = { COMMA, SEPARATED, VALUES}
        int[] ourFirstArray = { -10, 0, 10, 20, 30, 40, 50, 60, 70 };

        // DATATYPE[] IDENTIFIER = new DATATYPE[SIZE_OF_ARRAY];
        int[] ourFirstEmptyArray = new int[3];
        String[] stringArray = new String[100];
        double[] doubleArray = new double[20];

        // printing single elements
        System.out.println("First element of array: " + ourFirstArray[0]);

        int lastElementIndex = ourFirstArray.length - 1;
        System.out.println("Last element of array: " + ourFirstArray[lastElementIndex]);

        // updating single elements
        System.out.println("===============================");
        System.out.println("First element before updating value: " + ourFirstEmptyArray[0]);
        ourFirstEmptyArray[0] = 100;
        System.out.println("First element after updating value: " + ourFirstEmptyArray[0]);
        int anotherLastElementIndex = ourFirstEmptyArray.length - 1;
        ourFirstEmptyArray[anotherLastElementIndex] = -100;

        // printing all elements of an array
        System.out.println("====================");

        // below loop would throw an ArrayIndexOutOfBoundException
        // for(int i = 0; i < ourFirstArray.length - 1; i++) {

        // this one works just fine :)
        for(int i = 0; i < ourFirstArray.length; i++) {
            System.out.println("Array-element on position " + i + " has the value: " + ourFirstArray[i]);
        }
    }
}
