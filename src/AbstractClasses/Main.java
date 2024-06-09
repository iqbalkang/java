package AbstractClasses;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cat zaya = new Cat("scottish fold", "medium", 7.3);
        zaya.move("fast");
        Cat milo = new Cat("british shorthair", "medium", 7.3);
        Fish salmon = new Fish("salmon", "big", 10);
        salmon.printInfo();
        doAnimalStuff(milo);
        System.out.println("_".repeat(50));
        Horse sitara = new Horse("nukra", "big", 1000);
        sitara.shedHair();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(zaya);
        animals.add(milo);
        animals.add(salmon);

        for(Animal animal : animals) {
            doAnimalStuff(animal);
        }
    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
