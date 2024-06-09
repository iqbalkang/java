package Collections;

import java.util.LinkedHashMap;

public class LinkedHashMapPractice {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(5, 0.75f, true);
        lhm.put(1, "one");
        lhm.put(2, "two");
        lhm.put(4, "four");
        lhm.put(3, "three");
        lhm.put(5, "five");

        lhm.get(2);
        lhm.get(1);

        lhm.put(6, "six");
        System.out.println(lhm);
    }

}
