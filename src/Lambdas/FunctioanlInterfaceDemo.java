package Lambdas;

public class FunctioanlInterfaceDemo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.print();

        Printable p = () -> System.out.println("woof");
        p.print();

        Printable what = whatEver();
        what.print();

    }

    static Printable whatEver() {
        return () -> System.out.println("whatever");
    }
}

interface Printable {
    void print();
}

class Cat implements Printable {

    @Override
    public void print() {
        System.out.println("meow");
    }
}
