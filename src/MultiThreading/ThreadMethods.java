package MultiThreading;

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }

    public void run() {
        int count = 0;

        while(true) {
            System.out.println(count++ + " thread");

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
        }
    }
}

public class ThreadMethods {

    public static void main(String[] args) throws Exception {

        MyThread t1 = new MyThread("thread1");
        t1.start();

        int count = 0;

        while(true) {
            System.out.println(count++ + " main");
            Thread.yield();
        }



    }
}
