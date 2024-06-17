package InputOutput;

import java.io.CharArrayReader;

public class CharArray {

    public static void main(String[] args) throws Exception {
        char[] c = {'a', 'b', 'c', 'd'};
        CharArrayReader car = new CharArrayReader(c);

        char[] b = new char[4];
        car.read(b);

        for(char ch : b)
            System.out.println(ch);

    }

}
