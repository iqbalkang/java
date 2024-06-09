package Enum;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DayOfWeek dayOfWeek = DayOfWeek.TUES;
        System.out.println(dayOfWeek);
        System.out.printf("Name is %s, Ordinal value is %d %n", dayOfWeek.name(), dayOfWeek.ordinal());

        DayOfWeek randomDay = getRandomDay();
        System.out.println(randomDay);
    }

    public static DayOfWeek getRandomDay() {
        int random = new Random().nextInt(7);
        var allDays = DayOfWeek.values();
        return allDays[random];
    }
}
