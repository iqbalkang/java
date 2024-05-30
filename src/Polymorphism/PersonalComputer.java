package Polymorphism;

public class PersonalComputer extends Product{
    private Monitor monitor;
    private ComputerCase computerCase;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, ComputerCase computerCase, Motherboard motherboard) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.computerCase = computerCase;
        this.motherboard = motherboard;
    }

    private void drawLogo() {
        monitor.drawPixelAt(5, 7, "red");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
}
