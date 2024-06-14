package MultiThreading;

class Data {
    int value = 0;
    boolean flag = true;

    synchronized public int get() {
//        while(flag != false) {
//            try{
//                wait();
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//
//        flag = true;
//        notify();
        return value;
    }

    synchronized public void set(int value) {
        while (flag != true) {
            try{
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        this.value = value;
        flag = false;
        notify();
    }
}

class Producer extends Thread {
    Data d;
    public Producer(Data d) {
        this.d = d;
    }

    synchronized public void run() {
        int i = 0;
        while(i <= 10) {
            d.set(i);
            System.out.println("producer " + i);
            i++;
        }
    }
}

class Consumer extends Thread {
    Data d;
    public Consumer(Data d) {
        this.d = d;
    }

    synchronized public void run() {
        while(d.get() < 10) {
            System.out.println("consumer " + d.get());
        }
    }
}

public class InterThreadCommunication {

    public static void main(String[] args) {
        Data d = new Data();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);

//        p.start();
//        c.start();
        int x = 5;
        Integer y = 5;
        System.out.println(y.equals(x));

    }
}
