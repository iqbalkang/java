package Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[10];

        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = intArray.length - i;
        }

        for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        System.out.println();

        for(int element : intArray) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.print(Arrays.toString(intArray));
    }
}
