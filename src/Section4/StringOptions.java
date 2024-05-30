package Section4;

public class StringOptions {

    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";
        String newHelloWorld = helloWorld.concat(" and Goodbye!");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye!");

        printInformation(newHelloWorld);
        printInformation(helloWorldBuilder);

    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder sb) {
        System.out.println("String builder = " + sb);
        System.out.println("Length = " + sb.length());
    }
}
