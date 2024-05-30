package Polymorphism;

public class ComputerBuilderMain {

    public static void main(String[] args) {
        Monitor theMonitor = new Monitor("27 inch beast", "acer", 27, "2540 x 1440");
        ComputerCase theCase = new ComputerCase("2208", "dell", "240");
        Motherboard theBoard = new Motherboard("bj-200", "asus", 4, 6, "v2.44");
        PersonalComputer thePc = new PersonalComputer("2208", "dell", theMonitor, theCase, theBoard);

        thePc.powerUp();
    }

}
