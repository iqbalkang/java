package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArraysClass {

    public static void main(String[] args) {

        int[] firstArray = getArray(10);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        System.out.println("________________");

        int[] thirdArray = getArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] copiedArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(copiedArray));

        Arrays.sort(copiedArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(copiedArray));

        System.out.println("________________");

        String[] names = new String[] {"bala", "jeeto", "abhi", "prince", "vicky"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int position = Arrays.binarySearch(names, "vicky");
        System.out.printf("vicky was found at position: %d %n", position);

        int[] number1 = {1, 2, 3, 4, 5};
        int[] number2 = {1, 2, 3, 4, 5};
        boolean match = Arrays.equals(number1, number2);
        System.out.println(match);
    }

    public static int[] getArray(int len) {
        Random random = new Random();

        int[] newArray = new int[len];

        for(int i = 0; i < len; i++) {
            newArray[i] = random.nextInt(100);
        }

        return newArray;
    }

    public static class MoreLists {

        public static void main(String[] args) {
            String[] groceries = {"apple", "banana", "orange", "peach"};

            List<String> list = List.of(groceries);
            List<String> list1 = Arrays.asList(groceries);
            list1.set(0, "kela");
            System.out.println(list1);
            System.out.println(Arrays.toString(groceries));

            ArrayList<String> groceriesList = new ArrayList<>(list);
            groceriesList.add("bala");
            System.out.println(groceriesList);

            int size = groceriesList.size();
            String[] arrayList = groceriesList.toArray(new String[size]);
            System.out.println(arrayList[1]);
            System.out.println(Arrays.toString(arrayList));
            System.out.println(arrayList.getClass().getSimpleName());
            System.out.println(arrayList.length);
            System.out.println("_".repeat(50));

            ArrayList<Integer> intList = new ArrayList<>();
            intList.add(1);
            System.out.println(intList);
            System.out.println("_".repeat(50));

            ArrayList<String> arrList = new ArrayList<>(Arrays.asList("bala", "jeeto", "abhi"));
            System.out.println(arrList);
            arrList.add("prince");
            System.out.println(arrList);
            arrList.add(0, "vicky");
            System.out.println(arrList);
        }
    }
}
