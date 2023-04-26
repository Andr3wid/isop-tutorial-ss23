public class CoolArayOps {
    public static void main(String[] args) {
        double[] measurements = {
                12.254,
                10.5,
                -112.7,
                12,
                45 ,
                - 1.1,
                12354,
                -10000
        };

        double currentSmallestValue = measurements[0];

        for(int i = 0; i < measurements.length; i++) {
            if(measurements[i] < currentSmallestValue) {
                currentSmallestValue = measurements[i];
                System.out.println("Found new smallest value: " + currentSmallestValue);
            }
        }

        System.out.println("=== Total smallest value in our measurements: " + currentSmallestValue);

    }
}
