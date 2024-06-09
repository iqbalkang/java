package NestedClasses;

import java.util.ArrayList;

public class GearBox {



    private int maxGears;
    private int currentGear = 0;
    private ArrayList<Gear> gears;

    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }
}
