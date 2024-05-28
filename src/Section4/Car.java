package Section4;

public class Car {

    private String make = "Tesla";

    private String model = "Model X";

    private String color = "Black";

    private int doors = 4;

    private boolean convertible;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {

        if(make == null) {
            this.make = "Unknown";
            return;
        }

        String lowerCaseMake = make.toLowerCase();

        switch (lowerCaseMake) {
            case "honda", "toyota", "hyundai" -> this.make = make;
            default -> this.make = "Unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + "doors " + make + " " + model + " " + color + " " + convertible);
    }

}
