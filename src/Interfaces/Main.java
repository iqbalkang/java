package Interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        inFlight(bird);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double mileTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f kms or %.2f miles %n", kmsTraveled, mileTraveled);
        System.out.println("_".repeat(50));

        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

//        List<FlightEnabled> betterFliers = new ArrayList<>();
        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);


    }

    public static void inFlight(FlightEnabled flier) {
        System.out.println("_".repeat(50));
        flier.takeOff();
        flier.fly();

        if(flier instanceof Trackable tracked) {
            tracked.track();
        }

        flier.land();
    }

    public static void triggerFliers(List<FlightEnabled> fliers) {
        for(FlightEnabled flier : fliers) {
            flier.takeOff();
        }
    }

    public static void flyFliers(List<FlightEnabled> fliers) {
        for(FlightEnabled flier : fliers) {
            flier.fly();
        }
    }

    public static void landFliers(List<FlightEnabled> fliers) {
        for(FlightEnabled flier : fliers) {
            flier.land();
        }
    }
}
