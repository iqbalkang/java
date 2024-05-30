package Section4;

public class StringManipulation {

    public static void main(String[] args) {

        String dob = "05/12/1991";

        int yearIndex = dob.indexOf("1991");
        String year = dob.substring(yearIndex);
        System.out.printf("Year = %s", year);

    }
}
