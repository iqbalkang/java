package Section2;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) return -1;

        return Math.round(kilometersPerHour / 1.60934);
    }

    public static void printConversion(double kilometersPerHour) {
        long speed = toMilesPerHour(kilometersPerHour);

        if (speed < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(kilometersPerHour + " km/h = " + speed + " mi/h");
    }
}
