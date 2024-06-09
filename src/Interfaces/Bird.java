package Interfaces;

public class Bird extends Animal implements FlightEnabled, Trackable {
    @Override
    public void move() {
        System.out.println("flaps wings!!!");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying");
    }

    @Override
    public void takeOff() {
        System.out.println(this.getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(this.getClass().getSimpleName() + " is landing");
    }

    @Override
    public void track() {
        System.out.println(this.getClass().getSimpleName() + "'s coordinates are tracked");
    }
}
