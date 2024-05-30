package Inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "big", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "slow");

        Dog yorkie = new Dog("yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("labrador retriever", 65, "floppy", "swimmer");
        doAnimalStuff(retriever, "slow");


    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("______________________");
    }

}
