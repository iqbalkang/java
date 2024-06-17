package Lambdas.TimAgain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdasSyntax {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("bala", "jeeto", "abhi", "prince", "vicky"));

        list.forEach(string -> System.out.println(string));

        String prefix = "nato";
        list.forEach(item -> {
            System.out.println(prefix + " " + item + " means " + item.charAt(0));
        });

        int result = calcualtor((a, b) -> a + b, 5, 10);
        System.out.println(result);

        var res = ((Operation<Integer>) (a, b) -> a + b).operate(15, 10);
        System.out.println(res);

        var coords = Arrays.asList(new Double[] {12.34, -43.23}, new Double[]{43.99, -98.44}, new Double[]{39.99, -19.44});
        coords.forEach(item -> System.out.println(Arrays.toString(item)));

//        var res = new Operation<Integer>() {
//            @Override
//            public Integer operate(Integer o1, Integer o2) {
//                return o1 + o2;
//            }
//        };
//
//        System.out.println(res.operate(5, 5));
    }

    public static <T> T calcualtor(Operation<T> function, T value1, T value2) {
        T result = function.operate(value1, value2);
        return result;
    }
}
