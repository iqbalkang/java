package exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SimpleConsoleIntegerCalculator {
    public static void main(String[] args) {
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        System.out.println(value1 + value2);

        String s = "ABCD";

        System.out.println(Arrays.toString(s.toCharArray()));
    }
}
