public class CallByRefCallByValue {
    static void changeIntValue(int num) {
        System.out.println("num inside the function before changing: " + num);
        num = -1;
        System.out.println("num inside the function after changing: " + num);
    }

    static void changeFirstElementOfArray(int[] a) {
        System.out.println("first array element inside the function before changing: " + a[0]);
        a[0] = -1;
        System.out.println("first array element inside the function after changing: " + a[0]);
    }

    public static void main(String[] args) {
        // call-by-value: new memory gets allocated inside the function
        // happens for primitive data types like int, boolean or char
        int ourNumber = 100;
        System.out.println("ourNumber before calling changeIntValue: " + ourNumber);
        changeIntValue(ourNumber);
        System.out.println("ourNumber after calling changeIntValue: " + ourNumber);

        // call-by-reference:
        // happens for complex data types like Arrays, Objects
        int[] arr = {1,2,3};
        System.out.println("first array element before calling function: " + arr[0]);
        changeFirstElementOfArray(arr);
        System.out.println("first array element after calling function: " + arr[0]);
    }
}
