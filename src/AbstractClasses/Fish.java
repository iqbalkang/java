package AbstractClasses;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    public void move(String speed) {
        if(speed.equals("slow")) {
            System.out.println(printInfo() + " is gliding");
        } else {
            System.out.println(printInfo() + " is swimming");
        }
    }

    public void makeNoise() {
        if(type.equals("goldfish")) {
            System.out.println("swish");
        } else {
            System.out.println("splash");
        }
    }
}
