package Section1;

public class Hello {

    public static void main(String[] args) {
//        System.out.println("Section1.Hello, Bala");
//        System.out.println("Section1.Hello World");
//
//        boolean isAlien = false;
//        if(isAlien == false) {
//            System.out.println("It is not an Alien");
//        }

        double valOne = 20.00D;
        double valTwo = 80.00D;

        double total = (valOne + valTwo) * 100D;
        double remainder = total % 40.00D;

        boolean isRemainderZero = (remainder == 0.00);
        System.out.print(isRemainderZero);



    }

}
