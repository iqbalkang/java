package Lambdas;

interface My {
    void display();
}

public class Main {

    public static void main(String[] args) {

//        My my = new My() {
//            @Override
//            public void display() {
//                System.out.println("hello world!");
//            }
//        };

        My my = () -> System.out.println("hello world!");

        my.display();

    }
}
