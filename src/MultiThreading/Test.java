package MultiThreading;

class MyClass extends Thread {
    public void run() {
        int i = 0;

        while(i < 200) {
            System.out.println(i + " hello");
            i++;
        }
    }
}

public class Test {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.start();

        int i = 0;
        while(i < 200) {
            System.out.println(i + " world");
            i++;
        }
    }
}
