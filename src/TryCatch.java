import java.util.Scanner;

class RandomException extends Exception {
    @Override
    public String toString() {
        return "random exception is raised.";
    }
}

public class TryCatch {

    public static void main(String[] args) {
//        hopeForTheBest();
        fun1();
    }

    public static void fun1() {
        fun2();
    }

    public static void fun2() {
        fun3();
    }

    public static void fun3() {
        try {
            throw new RandomException();
        } catch (RandomException e) {
            System.out.println(e);
        }
    }

    public static void hopeForTheBest() {
        int[] array = {1, 2, 3, 4, 5, 0};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {
//            int result = array[4] / array[1];
            int result = num1 / num2;
            System.out.println(result);
            System.out.println(array[1]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("no index found");
        } finally {
            System.out.println("program ended");
        }

        System.out.println("just kidding, program continues.");

    }
}
