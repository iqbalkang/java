package Section3;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        try {
            getInputFromConsole(2024);
        } catch (NullPointerException e) {
            getInputFromScanner(2024);
        }

    }

    public static void getInputFromConsole(int currentYear) {
        String name = System.console().readLine("What is your name? ");
        System.out.println("Hello " + name);

        String dob = System.console().readLine("What year were you born in? ");
        int currentAge = currentYear - Integer.parseInt(dob);

        System.out.println(name + " you are " + currentAge + " years old.");
    }

    public static void getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is Your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        int age = 0;

        do {
            System.out.println("What year were you born in? ");
            String dob = scanner.nextLine();

            age = calculateAge(currentYear, dob);
        } while (age < 0);

        System.out.println(name + " you are " + age + " years old.");
    }

    public static int calculateAge(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if (dob <  minimumYear || dob > currentYear) {
            return -1;
        }

        return currentYear - dob;
    }
}
