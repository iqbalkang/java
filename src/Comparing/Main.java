package Comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Integer five = 5;
        Integer[] numbers = {1, -4, 10, 5, 50};

        for(Integer num : numbers) {
            int result = num.compareTo(five);
//            System.out.println(result);
        }

        Student[] students = {new Student("john"), new Student("eric"), new Student("tim")};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        Comparator<Student> sorter = new GPASorter();
        Arrays.sort(students, sorter);
        System.out.println(Arrays.toString(students));
    }
}

class GPASorter implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
    }
}

class Student implements Comparable<Student> {
    private static int LAST_ID = 1000;

    private static Random random = new Random();

    String name;

    private int id;

    protected double gpa;

    public Student(String name) {
        this.name = name;
        this.id = LAST_ID++;
        this.gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }

    @Override
    public String toString() {
        return "%s(%d) has GPA = %.2f".formatted(name, id, gpa);
    }
}
