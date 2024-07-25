package exercises;

import java.util.Arrays;

public class MatrixIteration {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

//        for(int[] ints : matrix) {
//            for(int i : ints) {
//                System.out.print(i + "\t");
//            }
//            System.out.println();
//        }

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));

        changedArr(arr);
        System.out.println(Arrays.toString(arr));

        clearArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void changedArr(int[] arr) {
        arr[1] = 200;
    }

    public static void clearArr(int[] arr) {
        arr = null;
    }
}
