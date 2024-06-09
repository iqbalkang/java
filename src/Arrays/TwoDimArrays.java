package Arrays;

import java.util.Arrays;

public class TwoDimArrays {

    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {4, 5, 6};

        int[][] arrayMultiDim = new int[1][3];
//        arrayMultiDim = {arrayOne, arrayTwo};
        arrayMultiDim[0] = arrayTwo;
        arrayMultiDim[1] = arrayOne;

        System.out.println(Arrays.toString(arrayMultiDim));

        int[] intArray = {1, 2, 3, 4, 5};
        Object[] objectArray = new Object[3];
        objectArray[0] = "hello";
        objectArray[1] = new StringBuilder("world");
        objectArray[2] = intArray;

        System.out.println(Arrays.toString(objectArray));
    }
}
