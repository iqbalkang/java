package AbstractClasses;

public class Cat extends Animal{

    public Cat(String type, String size, double weight) {
        super(type, size, weight);
    }

    public void move(String speed) {
        if(speed.equals("slow")) {
            System.out.println(printInfo() + " is walking");
        } else {
            System.out.println(printInfo() + " is running");
        }
    }

    public void makeNoise() {
        if(type.equals("scottish fold")) {
            System.out.println("Meow!");
        } else {
            System.out.println("Meeeooooowwwww!!!");
        }
    }

//    @Override
//    public String printInfo() {
//        return super.printInfo() + " overridden";
//    }

}
