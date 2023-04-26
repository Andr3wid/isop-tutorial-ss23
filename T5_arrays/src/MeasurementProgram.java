import java.util.Scanner;

public class MeasurementProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many measurement values do you want to enter: ");
        int amountOfValues = scanner.nextInt();

        int[] measurements = new int[amountOfValues];

        // reading in individual values for array elements
        for(int i = 0; i < measurements.length; i++) {
            System.out.println("Please input value at index " + i);

            measurements[i] = scanner.nextInt();
        }

        // calculate the average of entered measurements
        int sumOfAllMeasurements = 0;
        for(int i = 0; i < measurements.length; i++) {
            // sumOfAllMeasurements = sumOfAllMeasurements + measurements[i];
            sumOfAllMeasurements += measurements[i];
        }

        System.out.println("Sum of the measurements: " + sumOfAllMeasurements);

        int average = sumOfAllMeasurements / measurements.length;
        System.out.println("Average of the measurements: " + average);
    }
}
