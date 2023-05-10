public class Questions {

    // TODO: check how to calculate target index dynamically
    static int[] convert2DTo1D(int[][] array2D) {
        int amountOfElements = 0;

        for(int i = 0; i < array2D.length; i++) {
            amountOfElements += array2D[i].length;
        }

        int[] array1D = new int[amountOfElements];
        int targetIndexCounter = 0;

        for(int i = 0; i < array2D.length; i++) {
            for(int j = 0; j < array2D[i].length; j++) {
                array1D[targetIndexCounter++] = array2D[i][j];
            }
        }

        return array1D;
    }

    public static void main(String[] args) {
        int[][] test1 = {
                {1,2,3,4,5},
                {6,7},
                {8}
        };

        int[][] test2 = {
                {}
        };

        int[] convertedTest1 = convert2DTo1D(test1);
        int[] convertedTest2 = convert2DTo1D(test2);

        System.out.println("=============");
    }
}
