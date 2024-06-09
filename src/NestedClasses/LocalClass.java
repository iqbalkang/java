package NestedClasses;

class Outer {

    public void display() {
        class Inner {
            public void innerDisplay() {
                System.out.println("inner display");
            }
        }

        Inner inner = new Inner();
        inner.innerDisplay();
    }
}

public class LocalClass {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();

    }

}
