public class SimpleLoopExamples {
    public static void main(String[] args) {
        int counter = 11;
        int numberOfIterations = 10;

        while (counter <= numberOfIterations) {
            System.out.println(counter + ": Hello ISOP");
            // counter = counter + 1;
            counter++;
        }

        // for(COUNTER_VARIABLE_DECLARATION; CONDITION; ACTION_ON_EACH_ITERATION)
        for (int i = 1; i <= numberOfIterations; i++) {
            System.out.println(i + ": Hello ISOP");
        }

        int counter2 = 1;
        do {
            System.out.println(counter2 + ": Hello ISOP");
            counter2++;
        } while (counter2 <= numberOfIterations);
    }
}
