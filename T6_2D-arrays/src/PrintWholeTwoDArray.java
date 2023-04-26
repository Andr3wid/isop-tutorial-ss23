public class PrintWholeTwoDArray {
    public static void main(String[] args) {
        int[][] arr2 = {
                {10, 20},
                {30,40},
                {60,70}
        };

        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                int ourElement = arr2[i][j];
                System.out.println(ourElement + " ");
            }
        }
    }
}
