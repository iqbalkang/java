package Section4;


public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        car.setMake(null);
        car.setColor("Red");
        car.setConvertible(true);

        System.out.println("Make = " + car.getMake());
        car.describeCar();
    }
}
