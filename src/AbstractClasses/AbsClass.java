package AbstractClasses;

abstract class AbstractClass {
    int i = 0;

    public AbstractClass() {
        System.out.println("AbsClass Generated!");
    }

    public AbstractClass(int i) {
        this.i = i;
    }

    void method1() {
        System.out.println("Method 1");
    }

    abstract void method2();
}

class Two extends AbstractClass {

    public Two(int i) {
        super(i);
    }

    @Override
    void method2() {
        System.out.println(i);
        System.out.println("Method 2 implemented");
    }

    void method3() {
        System.out.println("Method 3");
    }
}

public class AbsClass {

    public static void main(String[] args) {
        Two ac = new Two(12);
        ac.method1();
        ac.method2();
        ac.method3();
    }
}



