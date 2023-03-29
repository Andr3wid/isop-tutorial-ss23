public class LoopPlayground {
    public static void main(String[] args) {
        // count from top to bottom
        System.out.println("You rocket starts in  ...");
        for(int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("....\nWooosh - your rocket launched into space!");

        ///////////////////////////////

        // steps of two
        int counter = 10;

        System.out.println("Counting from top to bottom:");
        while(counter >= -10) {
            System.out.print(counter + " ");
            counter = counter - 2;
        }
        System.out.println("\nCounting ended");

    }
}
