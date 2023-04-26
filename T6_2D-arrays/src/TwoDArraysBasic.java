public class TwoDArraysBasic {
    public static void main(String[] args) {
        // creating a 2D array
        int[][] arr = new int[3][5];
        int[][] arr2 = {
                {10, 20},
                {30,40},
                {60,70}
        };

        int veryFirstElement = arr2[0][0];
        System.out.println("Very first element: " + veryFirstElement);

        int columnIndex = arr2[1].length - 1;
        int lastElementOfSecondRow = arr2[1][columnIndex];
        // int lastElementOfSecondRow = arr2[1][2];
        System.out.println("Last element of second row: " + lastElementOfSecondRow);

        int lastRowIndex = arr2.length - 1;
        int lastColumnIndex = arr2[lastRowIndex].length - 1;
        arr2[lastRowIndex][lastColumnIndex] = -1000;

        int veryLastValue = arr2[lastRowIndex][lastColumnIndex];
        System.out.println("Very last value: " + veryLastValue);


        System.out.println("=== END ===");
    }
}
