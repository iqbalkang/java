package NestedClasses;

interface MyInterface {
    void display();
}

class OuterCl {

    public void method() {
        MyInterface mi = new MyInterface() {
            @Override
            public void display() {
                System.out.println("anonymous class");
            }
        };

        mi.display();
    }

}

public class AnonymousClass {

    public static void main(String[] args) {
        OuterCl oc = new OuterCl();
        oc.method();
    }

}
