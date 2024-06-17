package Lambdas;

interface MyLambda {
    void display();
}

class UseLambda {
    public void useLambda(MyLambda ml) {
        ml.display();
    }
}

class Demo {
    public void demo() {
        UseLambda ul = new UseLambda();
        ul.useLambda(() -> System.out.println("hello world"));
    }
}

public class LambdaMethod {

    public static void main(String[] args) {
        Demo dm = new Demo();
        dm.demo();
    }
}
