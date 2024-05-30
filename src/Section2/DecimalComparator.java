package Section2;

public class DecimalComparator {
    public static void main(String[] args) {
//        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
//        areEqualByThreeDecimalPlaces(3.175, 3.176);
//        areEqualByThreeDecimalPlaces(3.0, 3.0);
//        areEqualByThreeDecimalPlaces(-3.123, 3.123);
        areEqualByThreeDecimalPlaces(3.176,3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        boolean areEqual = false;

        int num1New = (int) (num1 * 1000);
        int num2New = (int) (num2 * 1000);

        System.out.println(num1New + " " + num2New);

        if(num1New == num2New) areEqual = true;

        return areEqual;
    }
}
