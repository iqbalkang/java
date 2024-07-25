package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        returnWordMap("hello how are you are");

    }

    public static Map<String, Integer> returnWordMap(String words){
        Map<String, Integer> map = new HashMap<>();

        String[] wordsArray = words.split(" ");

        for(String word : wordsArray) {
            if(!map.containsKey(word)) map.put(word, 1);
            else map.replace(word, map.get(word) + 1);
            System.out.println(map);
        }

//        map.put("bala", 1);
//        map.put("jeeto", 1);
//        map.put("abhi", 1);
//
//        map.replace("abhi", 2);

        System.out.println(map);

        return null;
    }
}
