package Lambdas;

import java.util.List;

public class StreamsAPI {

    public static void main(String[] args) {
        List<String> numList = List.of("one", "two", "three", "four", "five");
        numList.stream()
                .forEach(System.out::println);

    }

}
