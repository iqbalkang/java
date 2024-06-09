package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeHashPractice {

    public static void main(String[] args) {

        TreeMap<String, Integer> tm = new TreeMap<>(Map.of("one", 1, "two", 2, "three", 3, "four", 4));
        tm.put("five", 5);
        tm.put("six", 6);

        System.out.println(tm);
        System.out.println(tm.firstEntry());

    }
}
