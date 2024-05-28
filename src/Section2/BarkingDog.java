package Section2;

public class BarkingDog {
    public static void main(String[] args) {
        boolean isBarking = shouldWakeUp(false, 6);
        System.out.println(isBarking);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if(hourOfDay < 0 || hourOfDay > 23)  return false;

        return (barking && hourOfDay < 8) || (barking && hourOfDay > 22);
    }
}
