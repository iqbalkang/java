package NestedClasses;

class StaticInner {

    static int x = 10;
    int y = 20;

    static class Inner {
        public void display() {
            System.out.println(x);
        }
    }
}

public class StaticInnerClass {

    public static void main(String[] args) {
        StaticInner.Inner si = new StaticInner.Inner();
        si.display();
    }

}
