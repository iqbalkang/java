package NestedClasses;

class OuterClass {
    int x = 10;

    class Inner {
        int y = 20;

        void innerMethod() {
            System.out.println("inner class method. x = " + x + ", y = " + y);
        }
    }

    public void outerMethod() {
        Inner inner = new Inner();
        inner.innerMethod();
        System.out.println("outer class method. y = " + inner.y);
    }
}

public class InnerClass {

    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        outer.outerMethod();

        OuterClass.Inner oi = new OuterClass().new Inner();
        oi.innerMethod();
    }

}

