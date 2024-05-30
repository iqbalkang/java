package Section2;

public class EqualSumChecker {

    public static void main(String[] args) {
        Student bala = new Student("bala", 33);
        Student jeeto =  new Student("jeeto", 31);

        Student balaRef = bala;
        Student jeetoRef = jeeto;

        System.out.println(bala.toString() + " " + jeeto.toString());
        System.out.println(balaRef.toString() + " " + jeetoRef.toString());

    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        boolean isSumEqual = false;

        if((num1 + num2) == num3) isSumEqual = true;
        return isSumEqual;
    }
}


class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}