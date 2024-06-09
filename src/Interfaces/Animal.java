package Interfaces;

enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if(this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }
}

record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }
}

class Satellite implements OrbitEarth {

    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    }
}

interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();
}

interface FlightEnabled {
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void fly();
    void takeOff();
    void land();

}

interface Trackable {
    void track();
}

public abstract class Animal {

    public abstract void move();
}
