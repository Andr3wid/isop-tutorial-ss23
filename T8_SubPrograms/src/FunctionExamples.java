public class FunctionExamples {
    /*
    arr2D = {
        {2,4,6,3},
        {1,-4, 10, 7}
    }
    print2DEntriesBelowThreshold(arr2D, 4) ==> 1,4,3,1,-4
     */

    static int print2DEntriesBelowThreshold(int[][] arr2d, int threshold) {
        int printedNumberCount = 0;

        for(int i = 0; i < arr2d.length; i++) {
            for(int j = 0; j < arr2d[i].length; j++) {
                int currentEntry = arr2d[i][j];

                if(currentEntry <= threshold) {
                    System.out.print(currentEntry + " ");
                    printedNumberCount++;
                }
            }
        }

        System.out.println();
        return printedNumberCount;
    }

    static void print2DEntriesAndCount(int[][] arr2d, int threshold) {
        int count = print2DEntriesBelowThreshold(arr2d, 100);
        System.out.println("We printed " + count + " number(s)");
    }

    public static void main(String[] args) {

        int[][] arr2D = {
                {2,4,6,3},
                {1,-4, 10, 7},
                {101}
        };

//        int count1 = print2DEntriesBelowThreshold(arr2D, 100);
//        System.out.println("We printed " + count1 + " numbers");
        print2DEntriesAndCount(arr2D, 100);

//        int count2 = print2DEntriesBelowThreshold(arr2D, 0);
//        System.out.println("We printed " + count2 + " numbers");
        print2DEntriesAndCount(arr2D, 0);

    }
}
