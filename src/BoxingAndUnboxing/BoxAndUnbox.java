package BoxingAndUnboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxAndUnbox {

    public static void main(String[] args) {
        int number = 15;
        Integer boxedNumber = number;

        System.out.println(boxedNumber);
        System.out.println(boxedNumber.getClass().getSimpleName());

        int num = boxedNumber;
        System.out.println(num);

        Double boxedNum = getDoublePrimitive();
        double unboxedNum = getDoubleObject();

        System.out.println(boxedNum.getClass().getSimpleName());
//        System.out.println(unboxedNum.getClass().getSimpleName());

        List<Integer> ourList = getList(1, 2, 3, 4, 5, 6);
        List<Integer> ourList1 = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(ourList);
        System.out.println(ourList1);

        int[] intArr = new int[5];
        System.out.println(Arrays.toString(intArr));

        Integer[] IntegerArr = new Integer[5];
        System.out.println(Arrays.toString(IntegerArr));
    }

    public static ArrayList<Integer> getList(int... varargs) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : varargs) {
            list.add(i);
        }

        System.out.println("Integer List " + list);

        return list;
    }

    public static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    public static double getDoublePrimitive() {
        return 100.00;
    }
}
