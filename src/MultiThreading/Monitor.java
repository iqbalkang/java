package MultiThreading;

class MyData {

    synchronized public void Display(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }
}

class Thread1 extends Thread {
    MyData d;

    public Thread1(MyData d) {
        this.d = d;
    }

    public void run() {
        d.Display("Hello world");
    }
}

class Thread2 extends Thread {
    MyData d;

    public Thread2(MyData d) {
        this.d = d;
    }

    public void run() {
        d.Display("Welcome");
    }
}

public class Monitor {

    public static void main(String[] args) {
        MyData d = new MyData();
        Thread1 t1 = new Thread1(d);
        Thread2 t2 = new Thread2(d);

        t1.start();
        t2.start();

    }

}
