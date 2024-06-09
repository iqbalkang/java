package Interfaces;

interface Camera {
    void click();
    void record();
}

interface MusicPlayer {

    void play();
    void pause();
}

class Phone {
    void call() {
        System.out.println("calling");
    }

    void text() {
        System.out.println("texting");
    }
}

class SmartPhone extends Phone implements Camera, MusicPlayer {
    void videoCall() {
        System.out.println("video calling");
    }

    @Override
    public void click() {
        System.out.println("clicking");
    }

    @Override
    public void record() {
        System.out.println("recording");
    }

    @Override
    public void play() {
        System.out.println("playing");
    }

    @Override
    public void pause() {
        System.out.println("pausing");
    }
}

public class PhoneInterfaceExample {

    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.play();
        phone.call();
    }
}
